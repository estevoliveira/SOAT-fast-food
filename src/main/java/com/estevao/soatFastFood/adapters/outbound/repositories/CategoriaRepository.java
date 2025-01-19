package com.estevao.soatFastFood.adapters.outbound.repositories;

import com.estevao.soatFastFood.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
