package com.estevao.soatFastFood.adapters.inbound.controllers;

import com.estevao.soatFastFood.domain.dto.ProdutoDTO;
import com.estevao.soatFastFood.application.services.ProdutoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produtos")
@Tag(name = "Produto", description = "Class controller para o produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProdutoDTO getProdutoById(@PathVariable Long id){
        return service.getProductByID(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ProdutoDTO insert(@RequestBody ProdutoDTO dto){
        //System.out.println(dto.getNome());
        return service.insert(dto);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProdutoDTO update(@PathVariable Long id,@RequestBody ProdutoDTO dto){
        return service.update(id,dto);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
