package pipelinesurfers.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pipelinesurfers.projetofinal.dao.UserDAO;
import pipelinesurfers.projetofinal.dto.UsuarioDto;
import pipelinesurfers.projetofinal.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")

public class UsuarioController {

    @Autowired
    private UserDAO dao;

    @GetMapping("/all")
    public List<Usuario> listarTodos() {
        List<Usuario> lista = (List<Usuario>) dao.findAll();
        return lista;
    }

    @PostMapping("/loginemail")
    public ResponseEntity<UsuarioDto> loginPorEmail(@RequestBody Usuario user) {
        Usuario userFinded = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());

        if (userFinded != null) {
            UsuarioDto userDto = new UsuarioDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioDto> login(@RequestBody Usuario user) {
        Usuario userFinded = dao.findByEmailOrRacf(user.getEmail(), user.getRacf());

        if (userFinded != null) {
            if (user.getSenha().equals(userFinded.getSenha())) {
                UsuarioDto usuarioDto = new UsuarioDto(userFinded);
                return ResponseEntity.ok(usuarioDto);
            }
           
        }
        return ResponseEntity.status(401).build();
    }

}
