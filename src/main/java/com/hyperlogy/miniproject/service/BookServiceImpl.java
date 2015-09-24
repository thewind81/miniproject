package com.hyperlogy.miniproject.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tronghh on 24/09/2015.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private SessionFactory sessionFactory;
}
