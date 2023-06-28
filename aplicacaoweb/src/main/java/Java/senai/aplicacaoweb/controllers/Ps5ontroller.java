package Java.senai.aplicacaoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ps5")
public class Ps5ontroller {
    @GetMapping
    public String indexPs5(){
        return "Ps5/Jogos";
    }
}
