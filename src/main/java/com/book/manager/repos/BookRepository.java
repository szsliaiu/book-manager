package com.book.manager.repos;

import com.book.manager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 书籍
 * @Date 2022/9/2 16:12
 * @Author by panjinsheng
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    /**
     * ISBN编码查询
     * @param isbn
     * @return
     */
    Book findByIsbn(String isbn);
}
