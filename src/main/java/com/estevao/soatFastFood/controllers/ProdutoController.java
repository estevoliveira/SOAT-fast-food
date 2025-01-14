package com.estevao.soatFastFood.controllers;

import com.estevao.soatFastFood.dto.ProdutoDTO;
import com.estevao.soatFastFood.entities.Categoria;
import com.estevao.soatFastFood.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ProdutoDTO insert(@RequestBody ProdutoDTO dto){
        return service.insert(dto);
    }
    @GetMapping(value = "/{categoria}")
    public List<ProdutoDTO> searchByCategoria(@PathVariable Integer categoria){
        return service.searchByCategoria(categoria);
    }
}
