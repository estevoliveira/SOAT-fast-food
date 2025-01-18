package com.estevao.soatFastFood.controllers;

import com.estevao.soatFastFood.dto.ProdutoDTO;
import com.estevao.soatFastFood.entities.Produto;
import com.estevao.soatFastFood.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/{id}")
    public ProdutoDTO getProdutoById(@PathVariable Long id){
        return service.getProductByID(id);
    }

    @PostMapping
    public ProdutoDTO insert(@RequestBody ProdutoDTO dto){
        //System.out.println(dto.getNome());
        return service.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public ProdutoDTO update(@PathVariable Long id,@RequestBody ProdutoDTO dto){
        return service.update(id,dto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
