package com.hyperlogy.miniproject.service;

import com.hyperlogy.miniproject.bo.Book;

import java.util.List;

/**
 * Created by tronghh on 24/09/2015.
 */
public interface BookService {

    public Book get(Book bo);

    public void doSave(Book bo);

    public void doUpdate(Book bo);

    public void doDelete(Book bo);

    public List<Book> list(Book bo);
}
