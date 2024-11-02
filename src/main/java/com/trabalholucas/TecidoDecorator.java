package com.trabalholucas;

public class TecidoDecorator extends CamisetaDecorator {
    private Camiseta camiseta;
    private String tecido;

    public TecidoDecorator(Camiseta camiseta, String tecido) {
        this.camiseta = camiseta;
        this.tecido = tecido;
    }

    @Override
    public String getDescricao() {
        return camiseta.getDescricao() + ", Tecido: " + tecido;
    }

    @Override
    public double custo() {
        return 7.00 + camiseta.custo(); // preço adicional do tecido
    }
}
