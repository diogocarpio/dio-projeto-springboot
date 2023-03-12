package dio.projeto.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.projeto.springboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("SELECT e FROM Usuario e JOIN FETCH e.roles WHERE e.login= (:login)")
    public Usuario findByUsername(@Param("login") String login);
}