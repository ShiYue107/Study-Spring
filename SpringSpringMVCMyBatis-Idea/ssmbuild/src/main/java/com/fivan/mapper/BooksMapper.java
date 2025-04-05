package com.fivan.mapper;

import com.fivan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    //增
    int addBook(Books book);

    //删
    int deleteBookById(@Param("bookId")int id);

    //改
    int updateBook(Books book);

    //查 单个
    Books selectBookById(@Param("bookId")int id);

    //查 所有
    List<Books> selectBooks();

    //模糊查询
    List<Books> selectLike(@Param("bookName")String bookName);
}
