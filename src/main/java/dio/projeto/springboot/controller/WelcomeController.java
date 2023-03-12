package dio.projeto.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/users")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
}

/* RestController em Spring nada mais é que uma claase contendo 
 * anotações específicas para a disponibilização de
 * recursos HTTps baseados em nosso serviços e regras de negocio
 */