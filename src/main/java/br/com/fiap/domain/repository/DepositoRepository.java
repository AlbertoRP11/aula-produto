package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Deposito;
import br.com.fiap.domain.entity.Produto;
import br.com.fiap.domain.repository.abstracao.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepositoRepository implements Repository<Deposito, Long> {
    private static List<Deposito> depositos;

    static{
        depositos = new ArrayList<>();

        Deposito xangai = new Deposito();
        xangai.setId(1L);
        xangai.setNome("Xangai");

        Deposito barcelona = new Deposito();
        barcelona.setId(2L);
        barcelona.setNome("Barcelona");

        Deposito comptom = new Deposito(3L, "Comptom");
        Deposito osasco = new Deposito(4L, "Osasco");

        depositos.addAll(Arrays.asList(xangai, barcelona, comptom, osasco));

    }

    public List<Deposito> findAll(){
        return depositos;
    }

    public Deposito findById(Long id){
        for(int i=0; i<depositos.size(); i++){
            if (depositos.get(i).getId().equals(id)){
                return depositos.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Deposito> findbyName(String text) {
        return depositos.stream().filter( d -> d.getNome().equalsIgnoreCase( text ) ).toList();
    }

    public static List<Deposito> findByName(String texto){
        List<Deposito> depositosEncontrados = new ArrayList<>();
        for (Deposito d : depositos) {
            if (d.getNome().equalsIgnoreCase(texto)){
                depositosEncontrados.add(d);
            }
        }
        return depositosEncontrados;
    }

    public Deposito persist(Deposito d){
        d.setId(depositos.size() + 1L);
        depositos.add(d);
        return d;
    }
}
