package com.hyperlogy.miniproject.dao;

import com.hyperlogy.miniproject.bo.Book;

import java.util.List;

/**
 * Created by tronghh on 29/09/2015.
 */
public interface BookDao {
    public Book get(Book bo);

    public void save(Book bo);

    public void update(Book bo);

    public void delete(Book bo);

    public List<Book> list(Book bo);
}
