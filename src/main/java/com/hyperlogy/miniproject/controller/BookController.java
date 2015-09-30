package com.hyperlogy.miniproject.controller;

import com.hyperlogy.miniproject.bo.Book;
import com.hyperlogy.miniproject.service.BookService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by tronghh on 24/09/2015.
 */
@Component
public class BookController implements HttpRequestHandler {
    @Autowired
    private BookService bookService;

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String m = request.getParameter("m");
        if ("list".equals(m)) {
        } else if ("insert".equals(m)) {
            request.getRequestDispatcher("/WEB-INF/book/book_insert.jsp").forward(request, response);
            return;
        } else if ("update".equals(m)) {
            Book bo = new Book();
            setProperty(request, bo, "id");
            request.setAttribute("book", bookService.get(bo));
            request.getRequestDispatcher("/WEB-INF/book/book_update.jsp").forward(request, response);
            return;
        } else if ("doInsert".equals(m)) {
            doInsert(request, response);
        } else if ("doUpdate".equals(m)) {
            doUpdate(request, response);
        } else if ("doDelete".equals(m)) {
            Book bo = new Book();
            setProperty(request, bo, "id");
            bookService.doDelete(bo);
        }
        list(request, response);
    }

    protected void setProperty(HttpServletRequest request, Object bo, String name) {
        try {
            BeanUtils.setProperty(bo, name, request.getParameter(name));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("bookList", bookService.list(new Book()));
        request.getRequestDispatcher("/WEB-INF/book/book_list.jsp").forward(request, response);
    }

    protected void doInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Book bo = new Book();
        setProperty(request, bo, "name");
        setProperty(request, bo, "price");
        bookService.doInsert(bo);
    }

    protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Book bo = new Book();
        setProperty(request, bo, "id");
        setProperty(request, bo, "name");
        setProperty(request, bo, "price");
        bookService.doUpdate(bo);
    }
}
