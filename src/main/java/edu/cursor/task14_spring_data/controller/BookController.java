package edu.cursor.task14_spring_data.controller;

import edu.cursor.task14_spring_data.models.Book;
import edu.cursor.task14_spring_data.models.TwoBooks;
import edu.cursor.task14_spring_data.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    @PostMapping
    public void saveAuthor(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping("/{bookID}")
    public Book findAuthor(@PathVariable("bookID") Long authorID) {
        return bookService.findBook(authorID);
    }

    @DeleteMapping("/{bookID}")
    public void deleteAuthor(@PathVariable("bookID") Long authorID) {
        bookService.deleteBook(authorID);
    }

    @PutMapping
    public void updateAuthor(@RequestBody TwoBooks twoBooks) {
        bookService.updateBook(twoBooks.getOldBook(), twoBooks.getNewBook());
    }
}
