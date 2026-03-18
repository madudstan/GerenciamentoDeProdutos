package com.lachimia.saito.services;

import com.lachimia.saito.models.ProdutoModel;
import com.lachimia.saito.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto (ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel listarProduto (Long id) {
        return produtoRepository.findById(id).get();
    }

    public Optional<ProdutoModel> buscarProduto (Long id) {
        return produtoRepository.findById(id);
    }

    public void deletarProduto (Long id) {
        produtoRepository.deleteById(id);
    }

}
