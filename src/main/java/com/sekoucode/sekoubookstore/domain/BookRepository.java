package com.sekoucode.sekoubookstore.domain;

import java.util.Optional;

public interface BookRepository {

    // find all books

    Iterable<Book> findAll();

    //find book by id
    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);
    Book save(Book book);

    //delete book
    void deleteByIsbn(String isbn);

}
