package com.example.joke.controller;

import com.example.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    JokeService jokeService;

    @RequestMapping({"/", ""})
    public  String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
