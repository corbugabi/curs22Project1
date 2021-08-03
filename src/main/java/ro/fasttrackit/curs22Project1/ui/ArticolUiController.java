package ro.fasttrackit.curs22Project1.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.curs22Project1.service.ArticolService;

@Controller
@RequestMapping("articole")
public class ArticolUiController {
    private final ArticolService service;

    public ArticolUiController(ArticolService service) {
        this.service = service;
    }

    @GetMapping
    String articolPage(Model model){
        model.addAttribute("articole",service.getAll());
        return "articole";
    }
}
