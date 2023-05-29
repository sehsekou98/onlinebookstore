package com.sekoucode.sekoubookstore.demo;

import com.sekoucode.sekoubookstore.domain.Book;
import com.sekoucode.sekoubookstore.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("testdata")
public class BookDataLoader {
    private  final BookRepository bookRepository;
    public BookDataLoader(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();
        var book1= Book.of("1234567891", "Northern Lights", "Lyra Silverstar", 13.99, "Titus Williams");

        var book2 = Book.of("1234567892", "Polar Journey",
                "Lorek Polarson", 9.99, "Sekou S Seh");

        bookRepository.saveAll(List.of(book1, book2));
    }
}
