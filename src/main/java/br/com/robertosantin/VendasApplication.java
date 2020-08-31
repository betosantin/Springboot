package br.com.robertosantin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
/*
@ComponentScan(basePackages = {"br.com.robertosantin.repository", "br.com.robertosantin.service", })
	Todos os pacotes a partir da raiz serão scaneados por padrão...
	caso exista pacotes de fora da raiz, é necessário definir os pacotes a serem scacaneados
*/
@ComponentScan(basePackages = {"br.com.santin"})
public class VendasApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}
	
}
