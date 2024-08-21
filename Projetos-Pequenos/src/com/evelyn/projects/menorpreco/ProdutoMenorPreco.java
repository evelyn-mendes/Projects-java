/*
* Author: Evelyn
* Language: Java
* Date: 19/07/2024
* Description: É um programa que armazena uma certa quantidade de preços de produtos, escolhidos pelo usuário, e imprime qual ele deve comprar, se baseando no menor preço dentre os preços
*/

package com.evelyn.projects.menorpreco;

import java.util.Scanner;

public class ProdutoMenorPreco {
    
    public static void main(String[] args) {
        
        System.out.println("========= Produto com menor Preço =========\n");

        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Digite a quantidade de produtos: ");
        int numProdutos = input.nextInt();
    
        double[] preco = new double[numProdutos];
        double menor = 0;
        int idNumero = 0;
        
        for(int c = 0; c < preco.length; c++){

            System.out.print(">> Digite o preço do " + (c+1) + "º produto: ");
            preco[c] = input.nextDouble();

            menor = preco[0];
            
            if (menor > preco[c]){
                menor = preco[c];
                idNumero = c + 1;
            }
        }

        System.out.println("\n============================================\n");

        
        for(int c = 0; c < preco.length; c++){
            
            System.out.println("Produto " + (c+1) + ": R$" + preco[c]);
        }

        System.out.println("\n>> O produto que você deve comprar é o produto |" + idNumero + "| com preço de: R$" + menor + "\n");
    }
}
