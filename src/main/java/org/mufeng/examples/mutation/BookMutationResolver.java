package org.mufeng.examples.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.mufeng.examples.entity.Author;
import org.mufeng.examples.entity.Book;
import org.mufeng.examples.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * @Author: chenyang
 */
@Component
@AllArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {

    private BookRepository bookRepository;


    public Book addBook(String bookName, String publisher,String age,String authorName){
        Book book =new Book();
        Author author =new Author();

        book.setId(UUID.randomUUID().toString());
        book.setName(bookName);
        book.setPublisher(publisher);

        author.setId(UUID.randomUUID().toString());
        author.setAge(age);
        author.setName(authorName);
        book.setAuthor(author);
        Book save = bookRepository.save(book);
        return save;

    }



}
