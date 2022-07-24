package com.robin.demoproject.ctrl;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookCtrl {

    @Autowired
    private IBookService iBookService;

    @GetMapping("book.html")
    String book() {
        return "book";
    }

    @PostMapping("/api/addFormBook")
    String addFormBook(BookBean book){
        iBookService.addBook(book);
        return "book";
    }
}
