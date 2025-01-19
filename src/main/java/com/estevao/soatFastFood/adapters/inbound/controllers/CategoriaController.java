package com.estevao.soatFastFood.adapters.inbound.controllers;

import com.estevao.soatFastFood.domain.dto.CategoriaDTO;
import com.estevao.soatFastFood.domain.dto.ProdutoDTO;
import com.estevao.soatFastFood.application.services.CategoriaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
@Tag(name = "Categoria", description = "Class controller para o Categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoriaDTO> showAllCategorias(){
        return service.findTodasCategorias();
    }

    @GetMapping(value = "/{idCategoria}/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProdutoDTO> searchProdutosByCategoria(@PathVariable Long idCategoria){
        return service.searchProdutosByCategoria(idCategoria);
    }
}
