package br.com.guifroes1984.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "GuiFroes");

        return "home";
    }
}
