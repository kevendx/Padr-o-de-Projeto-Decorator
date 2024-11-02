package com.trabalholucas;

public class Main {
    public static void main(String[] args) {
        Camiseta camiseta = new CamisetaBase();
        System.out.println(camiseta.getDescricao() + " Custo: R$ " + camiseta.custo());

        // Adicionando uma estampa
        camiseta = new EstampaDecorator(camiseta, "Logotipo");
        System.out.println(camiseta.getDescricao() + " Custo: R$ " + camiseta.custo());

        // Adicionando uma cor
        camiseta = new CorDecorator(camiseta, "Azul");
        System.out.println(camiseta.getDescricao() + " Custo: R$ " + camiseta.custo());

        // Adicionando um tecido
        camiseta = new TecidoDecorator(camiseta, "Algodão");
        System.out.println(camiseta.getDescricao() + " Custo: R$ " + camiseta.custo());
    }
}