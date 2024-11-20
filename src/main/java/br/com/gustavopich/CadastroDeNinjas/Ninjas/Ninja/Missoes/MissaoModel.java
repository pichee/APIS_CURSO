package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Missoes;

import br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;
}
