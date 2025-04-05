package com.fivan.controller;

import com.fivan.mapper.BooksMapper;
import com.fivan.pojo.Books;
import com.fivan.service.BooksServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @className: BooksController
 * @version: v1.8
 * @author: feng[207128153@qq.com]
 */
@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    @Qualifier("service")
    private BooksServiceImpl booksServiceImpl;

    @RequestMapping("/select")
    public String selectBooks(Model model){
        List<Books> booksList = booksServiceImpl.selectBooks();
        model.addAttribute("list",booksList);
        return "allBooks";
    }

    //跳转到新增页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        booksServiceImpl.addBook(books);
        return "redirect:/books/select";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        booksServiceImpl.deleteBookById(id);
        return "redirect:/books/select";
    }

    //跳转到新增页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books book = booksServiceImpl.selectBookById(id);
        model.addAttribute("QBook",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book,Model model){
        booksServiceImpl.updateBook(book);
        return "redirect:/books/select";
    }

    @RequestMapping("/selectLike")
    public String selectLike(String bookName,Model model){
        bookName = "%"+bookName+"%";
        List<Books> like = booksServiceImpl.selectLike(bookName);
        model.addAttribute("list",like);
        return "allBooks";
    }
}
