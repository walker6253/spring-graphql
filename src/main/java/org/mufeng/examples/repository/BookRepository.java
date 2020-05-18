package org.mufeng.examples.repository;

import org.mufeng.examples.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 *
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    List<Book> findAll();
}
