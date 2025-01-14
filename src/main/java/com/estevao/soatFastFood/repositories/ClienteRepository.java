package com.estevao.soatFastFood.repositories;

import com.estevao.soatFastFood.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
