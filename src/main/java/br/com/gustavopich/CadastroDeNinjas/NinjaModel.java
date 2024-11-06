package br.com.gustavopich.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private int idade;
    private long id;
    private String email;
    private String rank;

    public NinjaModel(String nome) {
        this.nome = nome;
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}