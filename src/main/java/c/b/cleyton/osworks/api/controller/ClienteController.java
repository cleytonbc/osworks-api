package c.b.cleyton.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import c.b.cleyton.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("24 99999-9999");
		cliente1.setEmail("joaodascouves@emailqualqer.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("24 33333-3333");
		cliente2.setEmail("mariadasilva@emailqualquer.com");
		
		return Arrays.asList(cliente1, cliente2);

	}

}