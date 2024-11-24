package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "tb_cadastro_de_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(unique = true)
    private String email;

    @Column(name = "imagem")
    private String imgUrl;


    @ManyToOne

    @JoinColumn(name = "missoes_id")//Foreign Key

    private MissaoModel missao;
}