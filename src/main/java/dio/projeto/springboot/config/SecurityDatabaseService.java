package dio.projeto.springboot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dio.projeto.springboot.model.Usuario;
import dio.projeto.springboot.repository.UsuarioRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class SecurityDatabaseService  implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String login) {
        Usuario userEntity = usuarioRepository.findByUsername(login);
        if (userEntity == null) {
            throw new UsernameNotFoundException(login);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        userEntity.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });
        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getLogin(),
                userEntity.getPassword(),
                authorities);
        return user;
    }
}