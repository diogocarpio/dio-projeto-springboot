package dio.projeto.springboot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.projeto.springboot.model.Usuario;

@Repository
public class UsuarioRepository {
	
	public void save(Usuario usuario) {
		if(usuario.getId() == null) {
			System.out.println("SAVE - Recebendo usuário na camada de respositorio");
		} else {
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		}
		
		System.out.println(usuario);
	}
	
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir o usuario", id));
		System.out.println(id);
	}
	
	public List<Usuario> findAll() {
		System.out.println("LIST - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Diogo", "123"));
		usuarios.add(new Usuario("Jonas", "321"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
		return new Usuario("Diogo", "123");
	}
	
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
		return new Usuario("Diogo", "123");
	}
}
