package com.github.gabrielpcdsi.ProdutosApi.controller;

import com.github.gabrielpcdsi.ProdutosApi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class PrudutoController {

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        System.out.println("Pruduto Salvo: " + produto);
    }
}
