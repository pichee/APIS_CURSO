  package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/mensagem")
      public String boasVindas() {
          return "MINHA PRIMEIRA MENSAGEM";
      }

      //ADD ninja
      @PostMapping("/adicionar")
      public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
          return ninjaService.createNinja(ninja);
      }

      //Read ninja
      @GetMapping("/listarNinjas")
      public List<NinjaModel> listar(){
          return ninjaService.listar();

      }

      //Read all id
      @GetMapping("/listarNinjas/{id}")
      public NinjaModel listarNinjasId(@PathVariable Long id){
              return ninjaService.listarNinjasId(id);
        }

      @PutMapping("/alterar/{id}")
      public  NinjaModel atualizarNinja(@PathVariable Long id,NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id,ninjaAtualizado);
        }

      @DeleteMapping("/delete/{id}")
      public void deletarPorId(@PathVariable Long id) {
          ninjaService.removerNinja(id);
      }


  }
