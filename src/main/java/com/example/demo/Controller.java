package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private final int PAGE_SIZE = 4;

    private final ChiliRepository chiliRepository;

    public Controller(ChiliRepository chiliRepository) {
        this.chiliRepository = chiliRepository;
    }

    @GetMapping("/")
    public String getChiliPage(@RequestParam(defaultValue = "0") Integer page, Model model, HttpSession session) {
        if (page == null || page < 0) {
            page = 0;
        }

        List<Chili> sublist = chiliRepository.getChiliSubgroup(page, PAGE_SIZE);

        model.addAttribute("chiliSubList", sublist);
        model.addAttribute("currentPage", page);
        model.addAttribute("numberOfPages", chiliRepository.numberOfPages(PAGE_SIZE));
        session.setAttribute("currentPage", page);

        return "mainView";

    }


    @GetMapping(value = "/", params = "id")
    public String getChiliById(Model model, @RequestParam Integer id) {
        Chili newChili = chiliRepository.getChiliById(id);

        model.addAttribute("chiliElement", newChili);
        model.addAttribute("currentId", id);
        model.addAttribute("numberOfChilies", chiliRepository.getSize());
        model.addAttribute("chiliElement", newChili);
        model.addAttribute("currentId", id);
        model.addAttribute("pageSize", PAGE_SIZE);

        return "chiliDetailView";
    }

}