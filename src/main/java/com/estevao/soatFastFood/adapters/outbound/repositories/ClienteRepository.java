package com.estevao.soatFastFood.adapters.outbound.repositories;


import com.estevao.soatFastFood.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
