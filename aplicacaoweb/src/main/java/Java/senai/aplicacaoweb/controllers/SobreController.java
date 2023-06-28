package Java.senai.aplicacaoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sobre")
public class SobreController {

    @GetMapping
    public String indexSobre(){
        return "Sobre/sobremim";
    }
}
