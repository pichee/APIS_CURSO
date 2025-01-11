package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;

import br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Missoes.MissoesModel;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NinjaDTO {

    private long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private String rank;
    private MissoesModel missoes;

}