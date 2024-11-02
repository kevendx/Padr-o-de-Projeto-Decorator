package com.trabalholucas;

public class CorDecorator extends CamisetaDecorator {
    private Camiseta camiseta;
    private String cor;

    public CorDecorator(Camiseta camiseta, String cor) {
        this.camiseta = camiseta;
        this.cor = cor;
    }

    @Override
    public String getDescricao() {
        return camiseta.getDescricao() + ", Cor: " + cor;
    }

    @Override
    public double custo() {
        return 3.00 + camiseta.custo(); // preço adicional da cor
    }
}