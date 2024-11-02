package com.trabalholucas;

public abstract class Camiseta {
    protected String descricao = "Camiseta básica";

    public String getDescricao() {
        return descricao;
    }

    public abstract double custo();
}
