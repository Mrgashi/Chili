package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    int pageSize = 4;
    @Autowired
    private ChiliRepositoryWithDataJPA chiliRepositoryWithDataJPA;

    public Controller(ChiliRepositoryWithDataJPA chiliRepositoryWithDataJPA) {
        this.chiliRepositoryWithDataJPA = chiliRepositoryWithDataJPA;
    }

    @GetMapping("/")
    public String getChiliPage(@RequestParam(defaultValue = "0") Integer page, Model model, HttpSession session) {
        if (page == null || page < 0) {
            page = 0;
        }

        List<Chili> sublist = chiliRepositoryWithDataJPA.getChiliSubgroup(page, pageSize);

        model.addAttribute("chiliSubList", sublist);
        model.addAttribute("currentPage", page);
        model.addAttribute("numberOfPages", chiliRepositoryWithDataJPA.numberOfPages(pageSize));
        session.setAttribute("currentPage", page);

        return "mainView";

    }

    @GetMapping(value = "/", params = "id")
    public String getChiliById(Model model, @RequestParam Integer id) {
        Chili newChili = chiliRepositoryWithDataJPA.findById(id).get();

        model.addAttribute("chiliElement", newChili);
        model.addAttribute("currentId", id);
        model.addAttribute("numberOfChilies", chiliRepositoryWithDataJPA.count());
        model.addAttribute("pageSize", pageSize);

        return "chiliDetailView";
    }

}