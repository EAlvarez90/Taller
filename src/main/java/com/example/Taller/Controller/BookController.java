package com.example.Taller.Controller;

import com.example.Taller.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/users")
public class BookController {
    @GetMapping("/{titulo}/{autor}/{año}")
    public String showUser(@PathVariable String titulo, @PathVariable int año, @PathVariable String autor,
                           Model model) {

        Book book = new Book (titulo, autor, año);
        model.addAttribute("book", book);
        return "book";
    }
}
