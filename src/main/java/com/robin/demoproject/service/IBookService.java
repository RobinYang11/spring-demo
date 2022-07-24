package com.robin.demoproject.service;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.dto.UserDto;

import java.util.List;

public interface IBookService {

    BookBean addBook(BookBean book);

    List<BookBean> queryBook(BookBean book);

    void updateBook(BookBean book);

    void deleteBook(BookBean book);

    UserDto queryUserBooks(int id);

}
