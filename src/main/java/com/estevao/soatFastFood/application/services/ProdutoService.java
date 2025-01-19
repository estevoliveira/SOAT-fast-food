package com.estevao.soatFastFood.application.services;

import com.estevao.soatFastFood.domain.dto.ProdutoDTO;
import com.estevao.soatFastFood.domain.entities.Categoria;
import com.estevao.soatFastFood.domain.entities.Produto;
import com.estevao.soatFastFood.adapters.outbound.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Transactional(readOnly = true)
    public ProdutoDTO getProductByID(Long id){
        return new ProdutoDTO(repository.findById(id).get());
    }

    @Transactional
    public ProdutoDTO insert(ProdutoDTO dto){
        Produto p = new Produto();
        dtoToProduto(dto,p);

        Categoria c = new Categoria();
        c.setId(dto.getCategoria().getId());
        p.setCategoria(c);
        p = repository.save(p);
        return new ProdutoDTO(p);
    }
    @Transactional
    public ProdutoDTO update(Long id,ProdutoDTO dto){
        Produto p = repository.getReferenceById(id);
        dtoToProduto(dto,p);
        p = repository.save(p);
        return new ProdutoDTO(p);
    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

    private void dtoToProduto(ProdutoDTO dto, Produto p) {
        p.setNome(dto.getNome());
        p.setDescricao(dto.getDescricao());
        p.setPreco(dto.getPreco());
        p.setImagem(dto.getImagem());
        //p.setCategoria(dto.getCategoria());
    }

}
