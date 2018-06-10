package com.aalegz.jeremy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/story")
public class StoryController {

    @RequestMapping("/list")
    public String listStories(Model theModel) {

        return "list-stories";
    }
}
