package com.robin.demoproject.api;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.bean.RoomBean;
import com.robin.demoproject.dto.UserDto;
import com.robin.demoproject.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookApi {
    @Autowired
    private IBookService iBookService;

    public BookApi(IBookService iBookService) {
        this.iBookService = iBookService;
    }

//
//    @PostMapping("/api/addFormBook")
//    BookBean addFormBook(BookBean book){
//        iBookService.addBook(book);
//        return book;
//    }


    @PostMapping("/api/addBook")
    BookBean addBook(@RequestBody BookBean book) {
        iBookService.addBook(book);
        return book;
    }

    @GetMapping("/api/queryBook")
    List<BookBean> queryBook(BookBean book) {
        List<BookBean> books = iBookService.queryBook(book);
        return books;

    }

    @PostMapping("/api/updateBook")
    boolean update(@RequestBody BookBean book) {
        try {
            iBookService.updateBook(book);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @PostMapping("/api/deleteBook")
    boolean delete(@RequestBody BookBean book) {
        try {
            iBookService.deleteBook(book);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @GetMapping("/api/queryUserBooks")
    UserDto delete(int id) {
        try {
            return iBookService.queryUserBooks(id);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
