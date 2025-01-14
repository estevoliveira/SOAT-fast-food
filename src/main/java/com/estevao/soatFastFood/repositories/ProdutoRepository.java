package com.estevao.soatFastFood.repositories;

import com.estevao.soatFastFood.entities.Produto;
import com.estevao.soatFastFood.projection.ProdutoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    //List<GameMinProjection> searchByList(Long listId);
    @Query(nativeQuery = true, value = """
    select * from tb_produto where categoria = :categoriaId
    """)
    List<ProdutoProjection> searchByCategoria(Integer categoriaId);
}
