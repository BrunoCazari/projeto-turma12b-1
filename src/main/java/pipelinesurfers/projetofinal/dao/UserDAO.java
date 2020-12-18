package pipelinesurfers.projetofinal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pipelinesurfers.projetofinal.model.Usuario;

public interface UserDAO extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmail(String email);
    public Usuario findByEmailAndSenha(String email, String senha);
    public Usuario findByEmailOrRacf(String email, String racf);

    @Query(value = "Select nome,email from tbl_usuario where id = :cod", nativeQuery = true)
    public Object buscarUsuariosPorId(@Param("cod") Integer codigo); 
}
