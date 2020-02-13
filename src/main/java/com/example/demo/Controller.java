package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    ChiliRepo chiliRepo;

    public Controller(ChiliRepo chiliRepo) {
        this.chiliRepo = chiliRepo;
    }

    @GetMapping("/")
    public String getBookPage (@RequestParam(required = false) Integer page, Model model, HttpSession session){
        if (page == null || page < 0) {
            page = 0;
        }

        int pageSize = 4;
        List<Chili> sublist = chiliRepo.getChiliSubgroup(page, pageSize);
        model.addAttribute("chiliSubList", sublist);
        model.addAttribute("currentPage", page);
        model.addAttribute("numberOfPages", chiliRepo.numberOfPages(pageSize));

        session.setAttribute("currentPage", page);

        return "mainView";

    }



    @GetMapping("/chiliid")
    public String getBookById(Model model, @RequestParam(required = false, defaultValue = "8") Integer id) {
        Chili newChili = chiliRepo.getChiliById(id);

        model.addAttribute("chiliElement", newChili);

        return "mainView";
    }

    @GetMapping("/chilis")
    public String addAllChilis(Model model){
   //     List<Chili> allChilis = chiliRepo.getAllChilis();

        model.addAttribute("addAllChilis", chiliRepo.chiliList);
        return "mainView";
    }

}
