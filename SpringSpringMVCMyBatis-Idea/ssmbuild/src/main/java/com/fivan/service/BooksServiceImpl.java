package com.fivan.service;

import com.fivan.mapper.BooksMapper;
import com.fivan.pojo.Books;

import java.util.List;

/**
 * @className: BooksServiceImpl
 * @version: v1.8
 * @author: feng[207128153@qq.com]
 */
public class BooksServiceImpl implements BooksService{

    private BooksMapper booksMapper;
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return booksMapper.updateBook(book);
    }

    @Override
    public Books selectBookById(int id) {
        return booksMapper.selectBookById(id);
    }

    @Override
    public List<Books> selectBooks() {
        return booksMapper.selectBooks();
    }

    @Override
    public List<Books> selectLike(String bookName) {
        return booksMapper.selectLike(bookName);
    }
}
