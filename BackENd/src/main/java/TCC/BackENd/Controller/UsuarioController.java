package TCC.BackENd.Controller;


import TCC.BackENd.Model.Usuario;
import TCC.BackENd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiUsuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuario;

    @GetMapping(value = "/Usuarios")
    public List<Usuario> listarUsuarios()
    {
        return usuario.findAll();
    }

    @GetMapping(value = "/Usuarios/{id}")
    public Optional<Usuario> ListarPorId(@PathVariable(value = "id") int id)
    {
        return usuario.findById(id);
    }

    @GetMapping(value = "/UsuariosNome/{nome}")
    public List<Usuario> listarPorUsername(@PathVariable(value = "nome") String nome)
    {
        return usuario.findByUsername(nome);
    }

    @GetMapping(value = "/UsuariosSenha/{senha}")
    public List<Usuario> listarPorSenha(@PathVariable(value = "senha") String senha)
    {
        return usuario.findBySenha(senha);
    }

    @GetMapping(value = "/UsuariosVersao/{versao}")
    public List<Usuario> listarPorVersao(@PathVariable(value = "versao") boolean versao)
    {
        return usuario.findByVersao(versao);
    }

    @GetMapping(value = "/UsuariosTelefone/{telefone}")
    public List<Usuario> listarPorTelefone(@PathVariable(value = "telefone") String telefone)
    {
        return usuario.findBytelefone(telefone);
    }

    @GetMapping(value = "/UsuarioEmail/{email}")
    public List<Usuario> listarPorEmail(@PathVariable(value = "email") String email)
    {
        return usuario.findByemail(email);
    }

}
