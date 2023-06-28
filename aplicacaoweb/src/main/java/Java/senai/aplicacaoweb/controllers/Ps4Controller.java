package Java.senai.aplicacaoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ps4")
public class Ps4Controller {

    @GetMapping
    public String indexPs4(){
        return "Ps4/Jogos";
    }
}

