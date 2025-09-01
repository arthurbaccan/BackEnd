package TCC.BackENd.Controller;

import TCC.BackENd.Model.TabelasPersonalizadas;
import TCC.BackENd.Model.Usuario;
import TCC.BackENd.repository.TabelasPersonalizadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/TabelasPersonalizadas")
public class TabelasPersonalizadasController {
    @Autowired
    TabelasPersonalizadasRepository tab;
    @GetMapping(value = "/{id}")
    public List<TabelasPersonalizadas> listarTabelaPorId(@PathVariable(value = "id") int id)
    {
        return tab.findByIdUsuario(id);
    }

    @GetMapping(value = "/{id}/{nomeTabela}")
    public List<TabelasPersonalizadas> TabelaPersonalizada(@PathVariable(value = "id") int id,@PathVariable(value = "nomeTabela")String nomeTabela)
    {
        return tab.findTabela(id,nomeTabela);
    }
}
