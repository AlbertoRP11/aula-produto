package br.com.fiap.domain.entity;

import java.time.LocalDateTime;

public class ProdutoEstocado {
    private Long id;
    private Produto produto;
    private Deposito deposito;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private String numeroDeSerie;

    public ProdutoEstocado() {
    }

    public ProdutoEstocado(Long id, Produto produto, Deposito deposito, LocalDateTime entrada, LocalDateTime saida, String numeroDeSerie) {
        this.setId(id);
        this.setProduto(produto);
        this.setDeposito(deposito);
        this.setEntrada(entrada);
        this.setSaida(saida);
        this.setNumeroDeSerie(numeroDeSerie);
    }

    public Long getId() {
        return id;
    }

    public ProdutoEstocado setId(Long id) {
        this.id = id;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public ProdutoEstocado setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public ProdutoEstocado setDeposito(Deposito deposito) {
        this.deposito = deposito;
        return this;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public ProdutoEstocado setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
        return this;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public ProdutoEstocado setSaida(LocalDateTime saida) {
        this.saida = saida;
        return this;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public ProdutoEstocado setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this;
    }

    @Override
    public String toString() {
        return "ProdutoEstocado{" +
                "id=" + id +
                ", produto=" + produto +
                ", deposito=" + deposito +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                '}';
    }
}
