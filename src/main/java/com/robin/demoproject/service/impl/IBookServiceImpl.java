package com.robin.demoproject.service.impl;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.dao.IBookDao;
import com.robin.demoproject.dto.UserDto;
import com.robin.demoproject.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl implements IBookService {
    @Autowired
    private IBookDao iBookDao;


    @Override
    public BookBean addBook(BookBean book){
        iBookDao.addBook(book);
        return  book;
    }

    @Override
    public List<BookBean> queryBook(BookBean book) {
        return iBookDao.queryBook(book);
    }

    @Override
    public void updateBook(BookBean book) {
       iBookDao.updateBook(book);
    }

    @Override
    public void deleteBook(BookBean book) {
        iBookDao.deleteBook(book);
    }

    @Override
    public UserDto queryUserBooks(int id) {
        return iBookDao.queryUserBooks(id);
    }

}
