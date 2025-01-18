package com.estevao.soatFastFood.repositories;

import com.estevao.soatFastFood.entities.Produto;
import com.estevao.soatFastFood.projection.ProdutoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    //List<GameMinProjection> searchByList(Long listId);
    @Query(nativeQuery = true, value = """
    SELECT p.id,p.nome,p.descricao,p.preco,p.imagem
    FROM TB_PRODUTO as p
    inner join tb_categoria as c
    on p.categoria_id = c.id
    where c.id = :categoriaId
    """)
    List<ProdutoProjection> findProdutosByCategoria(Long categoriaId);
}
