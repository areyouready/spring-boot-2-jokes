package de.fnortheim.jokes;

import de.fnortheim.jokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getView(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
