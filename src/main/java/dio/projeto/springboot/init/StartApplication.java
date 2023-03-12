package dio.projeto.springboot.init;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dio.projeto.springboot.model.Usuario;
import dio.projeto.springboot.repository.UsuarioRepository;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository;
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Usuario user = repository.findByUsername("admin");
        if(user==null){
            user = new Usuario();
            user.setLogin("admin");
            user.setPassword("master123");
            user.getRoles().add("MANAGERS");
            repository.save(user);
        }
        
        user = repository.findByUsername("user");
        if(user ==null){
            user = new Usuario();
            user.setLogin("user");
            user.setPassword("user123");
            user.getRoles().add("USERS");
            repository.save(user);
        }
    }
}
