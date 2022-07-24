package com.robin.demoproject.dao;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBookDao {

    void addBook(BookBean book);

    List<BookBean> queryBook(BookBean book);

    void updateBook(BookBean book);

    void deleteBook(BookBean book);

    UserDto queryUserBooks(@Param("uid") int id);
}
