package com.estevao.soatFastFood.services;

import com.estevao.soatFastFood.dto.ProdutoDTO;
import com.estevao.soatFastFood.entities.Categoria;
import com.estevao.soatFastFood.entities.Produto;
import com.estevao.soatFastFood.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Transactional
    public ProdutoDTO insert(ProdutoDTO dto){
        Produto p= new Produto();
        p.setNome(dto.getNome());
        p.setCategoria(dto.getCategoria());
        p.setDescricao(dto.getDescricao());
        p.setPreco(dto.getPreco());
        p.setImagem(dto.getImagem());

        p = repository.save(p);
        return new ProdutoDTO(p);
    }

    @Transactional(readOnly = true)
    public List<ProdutoDTO> searchByCategoria(Integer categoria){
        return repository.searchByCategoria(categoria)
                .stream()
                .map(ProdutoDTO::new)
                .toList();
    }
}
