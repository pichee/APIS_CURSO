package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {
    //GET-- Manda uma requisição para mostrar as missoes.
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missoes listadas";
    }
    //Post-- Manda uma requisição para criar as missoes.
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missoes listadas";
    }
    //Put-- Manda uma requisição para alterar as missoes.
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missoes listadas";
    }
    //Delete-- Manda uma requisição para deleterar as missoes.
    @DeleteMapping("/delete")
    public String deleterMissao(){
        return "delete mission";
    }

}
