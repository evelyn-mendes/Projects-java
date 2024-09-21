package com.evelyn.projects.tabeladeprecos.lojaquasedois;

/**
 * <h1> Tabela de Preços - Loja Quase Dois </h1>
 * 
 * <p>É um programa que imprime a tabela de preços da compra de 1 até 50 produtos. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 15/08/2024
 */

public class Tabela {
    
    public static void main(String[] args) {

        System.out.println("========== Loja Quase Dois - Tabela de preços ==========\n");
        double preco = 1.99;
      
        for(int i = 1; i <= 50; i++){

            System.out.printf("%d - R$%.2f\n",i, preco);

            preco += 1.99;
        }    
    }
}
