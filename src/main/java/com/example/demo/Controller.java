package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    ChiliRepo chiliRepo;

    public Controller(ChiliRepo chiliRepo) {
        this.chiliRepo = chiliRepo;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(required = false, defaultValue = "1") Integer id) {
        Chili newChili = chiliRepo.getChili(id);

        model.addAttribute("chiliElement", newChili);

        return "mainView";
    }

    @GetMapping("/home")
    public String addAllChilis(Model model){
        List<Chili> allChilis = chiliRepo.getPage();

        model.addAttribute("addAllChilis", allChilis);
        return "mainView";
    }
}
