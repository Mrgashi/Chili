package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private final int PAGE_SIZE = 4;
    private static final String CURRENT_PAGE_ATTRIBUTE_NAME =  "currentPage";

    private final ChiliRepository chiliRepository;

    public Controller(ChiliRepository chiliRepository) {
        this.chiliRepository = chiliRepository;
    }


    // Denne oppretter førstesiden og henter inn objekter, sider og paginering
    @GetMapping("/")
    public String getChiliPage(@RequestParam(defaultValue = "0") Integer page, Model model, HttpSession session) {
        if (page == null || page < 0) {
            page = 0;
        }

        List<Chili> sublist = chiliRepository.getChiliSubgroup(page, PAGE_SIZE);

        model.addAttribute("chiliSubList", sublist);
        model.addAttribute("currentPage", page);
        model.addAttribute("numberOfPages", chiliRepository.numberOfPages(PAGE_SIZE));
        model.addAttribute("epost", new Epost());

        session.setAttribute(CURRENT_PAGE_ATTRIBUTE_NAME, page);

        return "mainView";

    }

    //Dette er detalijesiden som vi henter inn via id
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

    //Dette validerer om eposten brukeren legger inn er riktig eller ikke.
    @PostMapping("/")
    public String newsLetter(HttpSession httpSession, Model model, @Valid Epost epost, BindingResult bindingResult){


        Integer currentPage = (Integer) httpSession.getAttribute(CURRENT_PAGE_ATTRIBUTE_NAME);
        List<Chili> sublist = chiliRepository.getChiliSubgroup(currentPage, PAGE_SIZE);

        model.addAttribute("chiliSubList", sublist);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numberOfPages", chiliRepository.numberOfPages(PAGE_SIZE));

        if(bindingResult.hasErrors()){
            return "mainView";
        }
        httpSession.setAttribute("epost", epost);

        return "mainView";
    }

}