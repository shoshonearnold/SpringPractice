package com.shoshonearnold.SpringPractice.Controllers;

import com.shoshonearnold.SpringPractice.Repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {
    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publishers")
    public String getBooks(Model model) {
        model.addAttribute("books", publisherRepository.findAll());
        return "publisher/list";
    }
}
