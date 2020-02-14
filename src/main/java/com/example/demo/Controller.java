package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String getChiliPage(@RequestParam(defaultValue = "0") Integer page, Model model, HttpSession session) {
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


    @GetMapping(value = "/", params = "id")
    public String getChiliById(Model model, @RequestParam Integer id) {
        Chili newChili = chiliRepo.getChiliById(id);
        int pageSize = 4;
        model.addAttribute("chiliElement", newChili);
        model.addAttribute("currentId", id);
        model.addAttribute("numberOfChilies", chiliRepo.chiliList.size());
        model.addAttribute("pageSize", pageSize);
        return "chiliDetailView";
    }

    @GetMapping("/Testarea")
    public String test() {
        return "Testarea";
    }

//    @GetMapping("/catalog")
//    public String addAllChilis(Model model) {
//        model.addAttribute("addAllChilis", chiliRepo.chiliList);
//        return "mainView";
//    }

}
