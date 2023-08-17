package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.repository.ProdutoRepository;

import java.util.Objects;

public class ProdutoService {

    public static Produto persist(Produto p){
        ProdutoRepository produtoRepository = new ProdutoRepository();
        if(Objects.isNull(p.getNome())){
            return null;
        }
        if (Objects.isNull(p.getDescricao())) return null;
        if (Objects.isNull(p.getValor())) return null;

        return produtoRepository.persist(p);
    }

}
