  package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
      @GetMapping("/mensagem")
      public String boasVindas() {
          return "MINHA PRIMEIRA MENSAGEM";
      }

      //ADD ninja
      @PostMapping("/adicionar")
      public String criarNinja() {
          return "Ninja criado";
      }

      //Read ninja
      @GetMapping("/todos")
      public String todos() {
          return "todos os ninjas";
      }

      //Read all id
      @GetMapping("/todosId")
      public String todosPorId() {
          return "todos os ninjas por id";
      }

      @PutMapping("/alterar")
      public String alterar() {
          return "alterado";
      }

      @DeleteMapping("/delete")
      public String deletar() {
          return "deletado";
      }
  }
