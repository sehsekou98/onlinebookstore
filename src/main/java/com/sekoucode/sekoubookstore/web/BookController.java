package com.sekoucode.sekoubookstore.web;


import com.sekoucode.sekoubookstore.domain.Book;
import com.sekoucode.sekoubookstore.domain.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Iterable<Book> get() {
        return bookService.viewBookList();
    }

    @GetMapping("{isbn}")
    public  Book getByIsbn(@PathVariable String isbn) {
        return bookService.viewBookDetails(isbn);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book post(@Valid @RequestBody Book book) {

        return bookService.addBook(book);
    }

    @DeleteMapping("{isbn}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String isbn) {

        bookService.removeBook(isbn);
    }

    @PutMapping("{isbn}")
    public Book put(@Valid @PathVariable String isbn, Book book){

        return bookService.editBookDetails(isbn, book);
    }
}
