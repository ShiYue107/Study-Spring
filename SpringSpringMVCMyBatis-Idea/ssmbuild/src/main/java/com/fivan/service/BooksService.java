package com.fivan.service;

import com.fivan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className: BooksService
 * @version: v1.8
 * @author: feng[207128153@qq.com]
 */
public interface BooksService {
    //增
    int addBook(Books book);

    //删
    int deleteBookById(int id);

    //改
    int updateBook(Books book);

    //查 单个
    Books selectBookById(int id);

    //查 所有
    List<Books> selectBooks();

    //模糊查询
    List<Books> selectLike(String bookName);
}
