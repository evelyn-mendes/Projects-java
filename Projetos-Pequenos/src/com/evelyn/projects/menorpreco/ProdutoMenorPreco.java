package com.evelyn.projects.menorpreco;

import java.util.Scanner;

/**
 * <h1>Indicação de produto com menor preço</h1>
 * <p>É um programa que armazena N quantidade de preços de produtos, escolhidos pelo usuário, e imprime qual ele deve comprar, se baseando no menor preço.</p>
 * Language: Java
 * @author Evelyn Mendes 
 * @since 14/10/2025
 * @version 1.1
*/

public class ProdutoMenorPreco {
    
    public static void main(String[] args) {
        
        System.out.println("========= Produto com menor Preço =========\n");

        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Digite a quantidade de produtos: ");
        int numProdutos = input.nextInt();
    
        double[] preco = new double[numProdutos];
        double menor = Double.MAX_VALUE;
        int idNumero = 0;
        
        System.out.println();
        for(int c = 0; c < preco.length; c++){

            System.out.print(">> Digite o preço do " + (c+1) + "º produto: ");
            preco[c] = input.nextDouble();
            
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

        input.close();
    }
}
