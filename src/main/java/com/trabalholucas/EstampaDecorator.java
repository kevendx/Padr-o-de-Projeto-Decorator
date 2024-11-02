package com.trabalholucas;

public class EstampaDecorator extends CamisetaDecorator {
    private Camiseta camiseta;
    private String estampa;

    public EstampaDecorator(Camiseta camiseta, String estampa) {
        this.camiseta = camiseta;
        this.estampa = estampa;
    }

    @Override
    public String getDescricao() {
        return camiseta.getDescricao() + ", Estampa: " + estampa;
    }

    @Override
    public double custo() {
        return 5.00 + camiseta.custo(); // preço adicional da estampa
    }
}