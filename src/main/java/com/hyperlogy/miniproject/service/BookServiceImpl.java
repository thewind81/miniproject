package com.hyperlogy.miniproject.service;

import com.hyperlogy.miniproject.bo.Book;
import com.hyperlogy.miniproject.dao.BookDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tronghh on 24/09/2015.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book get(Book bo) {
        return bookDao.get(bo);
    }

    @Override
    public void doInsert(Book bo) {
        bookDao.save(bo);
    }

    @Override
    public void doUpdate(Book bo) {
        Book dbBo = bookDao.get(bo);
        BeanUtils.copyProperties(bo, dbBo);
        bookDao.update(dbBo);
    }

    @Override
    public void doDelete(Book bo) {
        Book dbBo = bookDao.get(bo);
        bookDao.delete(dbBo);
    }

    @Override
    public List<Book> list(Book bo) {
        return bookDao.list(bo);
    }
}
