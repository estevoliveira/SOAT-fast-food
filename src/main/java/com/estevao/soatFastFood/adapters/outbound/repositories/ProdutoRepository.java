package com.estevao.soatFastFood.adapters.outbound.repositories;

import com.estevao.soatFastFood.domain.entities.Produto;
import com.estevao.soatFastFood.adapters.outbound.projection.ProdutoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    @Query(nativeQuery = true, value = """
    SELECT p.id,p.nome,p.descricao,p.preco,p.imagem
    FROM TB_PRODUTO as p
    inner join tb_categoria as c
    on p.categoria_id = c.id
    where c.id = :categoriaId
    """)
    //@Query("select p from Produto p where p.categoria_id = :categoriaId")
    List<ProdutoProjection> findProdutosByCategoria(Long categoriaId);
}
