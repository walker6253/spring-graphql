package org.mufeng.examples.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.mufeng.examples.entity.Book;
import org.mufeng.examples.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: chenyang
 */
@Component
@AllArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {

    private BookRepository bookRepository;


    public List<Book> findBooks() {

        return bookRepository.findAll();
    }

    public Integer countBooks() {

        return 100;
    }


}
