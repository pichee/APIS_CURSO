package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/mensagem")
    public  String boasVindas(){
        return "MINHA PRIMEIRA MENSAGEM";
    }
}