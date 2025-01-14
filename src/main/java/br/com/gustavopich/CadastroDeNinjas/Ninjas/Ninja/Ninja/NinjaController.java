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
      //ADD ninja
      @PostMapping("/adicionar")
      public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO) {
          return ninjaService.criarNinja(ninjaDTO);
      }

    //Read ninja
      @GetMapping("/listarNinjas")
      public List<NinjaDTO> listar(){
          return ninjaService.listarNinjas();

      }

      //Read all id
      @GetMapping("/listarNinjas/{id}")
      public NinjaDTO listarNinjasId(@PathVariable Long id){
              return ninjaService.listarNinjasId(id);
        }

      @PutMapping("/alterar/{id}")
      public  NinjaDTO atualizar(@PathVariable Long id, NinjaDTO atualizarNinjas) {
        return ninjaService.atualizarNinjas(id,atualizarNinjas);
        }

      @DeleteMapping("/delete/{id}")
      public void deletarPorId(@PathVariable Long id) {
          ninjaService.deletarNinjaId(id);
      }


  }
