package com.evelyn.projects.tabeladeprecos.panificadorapaodeontem;

/**
 * <h1> Tabela de Preços - Loja Quase Dois </h1>
 * 
 * <p>É um programa que imprime a tabela de preços da compra de 1 até 50 pães. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 15/08/2024
 */

public class Tabela {
    
    public static void main(String[] args) {

        double preco = 0.18;
        System.out.println("========== Panificadora Pão de Ontem - Tabela de preços ==========");
        System.out.println("Preço do Pão: R$ " + preco + "\n");

        for(int i = 1; i <= 50; i++){

            System.out.printf("%d - R$%.2f\n", i, preco);

            preco += 0.18;
        }
    }
}
