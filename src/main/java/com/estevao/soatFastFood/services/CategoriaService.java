package com.estevao.soatFastFood.services;

import com.estevao.soatFastFood.dto.CategoriaDTO;
import com.estevao.soatFastFood.dto.ProdutoDTO;
import com.estevao.soatFastFood.repositories.CategoriaRepository;
import com.estevao.soatFastFood.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional(readOnly = true)
    public List<ProdutoDTO> searchProdutosByCategoria(Long categoria){
        return produtoRepository.findProdutosByCategoria(categoria)
                .stream()
                .map(ProdutoDTO::new)
                .toList();
    }
    @Transactional(readOnly = true)
    public List<CategoriaDTO> findTodasCategorias(){
        return categoriaRepository.findAll()
                .stream()
                .map(c -> new CategoriaDTO(c))
                .toList();
    }
}
