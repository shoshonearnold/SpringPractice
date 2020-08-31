package com.shoshonearnold.SpringPractice.MainInitializer;

import com.shoshonearnold.SpringPractice.Entities.Author;
import com.shoshonearnold.SpringPractice.Entities.Book;
import com.shoshonearnold.SpringPractice.Entities.Publisher;
import com.shoshonearnold.SpringPractice.Repositories.AuthorRepository;
import com.shoshonearnold.SpringPractice.Repositories.BookRepository;
import com.shoshonearnold.SpringPractice.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookCheckoutInitializer implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BookCheckoutInitializer(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Shoshone", "Arnold");
        Book book = new Book("Book1", "98767876" );
        Publisher publisher = new Publisher("Pub1", "122", "Main St", "Raleigh", "NC", "27560");
        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);
        book.setPublisher(publisher);

        System.out.println(author);
        System.out.println(book);
        System.out.println(publisher);



    }
}
