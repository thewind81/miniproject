package com.hyperlogy.miniproject.dao;

import com.hyperlogy.miniproject.bo.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tronghh on 29/09/2015.
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Book get(Book bo) {
        return (Book) sessionFactory.getCurrentSession().get(Book.class, bo.getId());
    }

    @Override
    public void save(Book bo) {
        sessionFactory.getCurrentSession().save(bo);
        sessionFactory.getCurrentSession().flush();
    }

    @Override
    public void update(Book bo) {
        sessionFactory.getCurrentSession().update(bo);
        sessionFactory.getCurrentSession().flush();
    }

    @Override
    public void delete(Book bo) {
        sessionFactory.getCurrentSession().delete(bo);
        sessionFactory.getCurrentSession().flush();
    }

    @Override
    public List<Book> list(Book bo) {
        return sessionFactory.getCurrentSession().createCriteria(Book.class).list();
    }
}
