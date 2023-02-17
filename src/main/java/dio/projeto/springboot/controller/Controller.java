package dio.projeto.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
		
	/* RestController em Spring nada mais é que uma claase contendo 
	 * anotações específicas para a disponibilização de
	 * recursos HTTps baseados em nosso serviços e regras de negocio
	 */
	
	@GetMapping()
	public String welcome() {
		return "Welcome the my API";
	}
}
