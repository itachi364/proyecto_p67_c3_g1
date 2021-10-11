package com.example.heladeria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.heladeria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
