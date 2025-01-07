package br.com.gustavopich.CadastroDeNinjas.Ninjas.Ninja.Ninja;
import java.util.List;
import java.util.Optional;

import jakarta.validation.constraints.Null;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    //Lista ninjas
    public List<NinjaModel> listar(){
        return (List<NinjaModel>) ninjaRepository.findAll();
    }
    //Lista ninjas ID
    public NinjaModel listarNinjasId(long id){
        Optional<NinjaModel> ListarporId=ninjaRepository.findById(id);
        return ListarporId.orElse(null);
    }
    //Criar Ninja
    public NinjaModel createNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public void removerNinja(long id){
        ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(long id,NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }


}