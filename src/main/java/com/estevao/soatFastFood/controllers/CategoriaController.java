package com.estevao.soatFastFood.controllers;

import com.estevao.soatFastFood.dto.CategoriaDTO;
import com.estevao.soatFastFood.dto.ProdutoDTO;
import com.estevao.soatFastFood.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<CategoriaDTO> showAllCategorias(){
        return service.findTodasCategorias();
    }

    @GetMapping(value = "/{idCategoria}/produtos")
    public List<ProdutoDTO> searchProdutosByCategoria(@PathVariable Long idCategoria){
        return service.searchProdutosByCategoria(idCategoria);
    }
}
