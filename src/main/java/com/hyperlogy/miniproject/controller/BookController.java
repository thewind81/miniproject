package com.hyperlogy.miniproject.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tronghh on 24/09/2015.
 */
@Component
public class BookController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String m = request.getParameter("m");
        if ("list".equals(m)) {
            list(request, response);
        } else if ("insert".equals(m)) {

        } else if ("update".equals(m)) {

        } else if ("doInsert".equals(m)) {
            //TODO: update
            list(request, response);
        } else if ("doUpdate".equals(m)) {
            //TODO: update
            list(request, response);
        } else if ("doDelete".equals(m)) {
            //TODO: delete
            list(request, response);
        } else {
            list(request, response);
        }
    }

    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/book/list.jsp").forward(request, response);
    }

    protected void doInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    }

    protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    }
}
