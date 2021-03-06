package br.com.robertosantin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
/*
@ComponentScan(basePackages = {"br.com.robertosantin.repository", "br.com.robertosantin.service", })
	Todos os pacotes a partir da raiz ser�o scaneados por padr�o...
	caso exista pacotes de fora da raiz, � necess�rio definir os pacotes a serem scacaneados
*/
@ComponentScan(basePackages = {"br.com.robertosantin" ,"br.com.santin"})
public class VendasApplication {
	
	@Gato
	private Animal animalGato;
	
	@Cachorro
	private Animal animalCachorro;
	
	@Bean(name = "executarGato")
	public CommandLineRunner executar() {
		return args -> {
			this.animalCachorro.fazerBarulho();
		};
	}
	
	@Bean(name = "executarCachorro")
	public CommandLineRunner executar2() {
		return args -> {
			this.animalGato.fazerBarulho();
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("applicationName")
	 * Usamos anota��es, quando n�o usamos o application.properties
	 * 
	 */
	@Value("${application.name}")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}
	
}
