package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Missoes.MissaoModel;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nome;
    int idade;
    long id;
    String email;
    String rank;
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foreign Key
    private MissaoModel missao;

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