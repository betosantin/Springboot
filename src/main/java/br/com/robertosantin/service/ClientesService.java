package br.com.robertosantin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.robertosantin.model.Cliente;
import br.com.robertosantin.repository.ClientesRepository;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		
		
		this.clientesRepository.persistir(cliente);
	}
	
	private void validarCliente(Cliente cliente) {
		//realiza validações
	}

}
