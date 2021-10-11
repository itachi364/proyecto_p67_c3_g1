package com.example.heladeria.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.heladeria.repository.ClienteRepository;
import com.example.heladeria.model.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente create (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllClientes (){
		return clienteRepository.findAll();
	}
	
	public void delete (Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	public Optional<Cliente> findById (Long identificacion) {
		return clienteRepository.findById(identificacion);
	}

}
