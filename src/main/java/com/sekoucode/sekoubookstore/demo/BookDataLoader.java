package com.sekoucode.sekoubookstore.demo;

import com.sekoucode.sekoubookstore.domain.Book;
import com.sekoucode.sekoubookstore.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
public class BookDataLoader {
    private  final BookRepository bookRepository;
    public BookDataLoader(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        var book1= new Book("1234567891", "Northern Lights",
                "Lyra Silverstar", 13.99);
        var book2 = new Book("1234567892", "Polar Journey",
                "Lorek Polarson", 9.99);
        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
