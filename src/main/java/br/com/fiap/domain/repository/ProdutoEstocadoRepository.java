package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.entity.ProdutoEstocado;
import br.com.fiap.domain.entity.Deposito;
import br.com.fiap.domain.repository.abstracao.Repository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoEstocadoRepository implements Repository<ProdutoEstocado, Long> {
    ProdutoRepository produtoRepository = new ProdutoRepository()

;    private static List<ProdutoEstocado> itens;

    static{
        itens = new ArrayList<>();
    }

    public List<ProdutoEstocado> findAll(){
        return itens;
    }

    public ProdutoEstocado findById(Long id){
        for (ProdutoEstocado p: itens) {
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public List<ProdutoEstocado> findbyName(String text) {
        return itens.stream().filter(pe -> pe.getProduto().getNome().equalsIgnoreCase(text)).toList();
    }

    public static List<ProdutoEstocado> findByProduto(Produto p){
        List<ProdutoEstocado> encotrados = new ArrayList<>();
        for (ProdutoEstocado pe: itens) {
            if (pe.getProduto().equals(p)){
                encotrados.add(pe);
            }
        }
        return encotrados;
    }

    public static List<ProdutoEstocado> findByDeposito(Deposito deposito){
        return itens.stream().filter(pe -> pe.getDeposito().equals(deposito)).toList();
    }

    public static List<ProdutoEstocado> findByProdutoAndDeposito(Produto produto, Deposito deposito){
        return itens.stream()
                .filter(pe -> pe.getDeposito().equals(deposito))
                .filter(pe -> pe.getProduto().equals(produto))
                .toList();
    }

    public ProdutoEstocado persist(ProdutoEstocado pe){
        pe.setId(itens.size()+1L);
        itens.add(pe);
        return pe;
    }
}
