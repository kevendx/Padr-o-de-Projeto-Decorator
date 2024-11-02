package com.trabalholucas;

public class CamisetaBase extends Camiseta {
    public CamisetaBase() {
        descricao = "Camiseta básica";
    }

    @Override
    public double custo() {
        return 20.00; // preço base da camiseta
    }
}
