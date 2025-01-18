package com.estevao.soatFastFood.repositories;

import com.estevao.soatFastFood.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
