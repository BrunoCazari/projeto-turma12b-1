package pipelinesurfers.projetofinal.dto;

import lombok.Getter;
import lombok.Setter;
import pipelinesurfers.projetofinal.model.Usuario;

// DTO - Data Transfer Object
@Getter @Setter
public class UsuarioDto {
    private String name;
    private String email;
    private String racf;

    public UsuarioDto(Usuario user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.racf = user.getRacf();
    }

   
    
    
}