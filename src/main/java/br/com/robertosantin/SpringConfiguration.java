package br.com.robertosantin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de Vendas";
	}

}
