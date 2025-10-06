package com.evelyn.projects.maiornumero;

import java.util.Scanner;

/**
 * <h1>Maior Número</h1>
 * <p>O programa recebe 5 números e imprime na tela o maior número digitado.</p>
 * 
 * @author Evelyn Mendes 
 * @since 05/10/2025
 * @version 1.0
 */

public class MaiorNum {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        int maior = Integer.MIN_VALUE, posicao = 0;
        
        for(int i = 0; i < num.length; i++){

            System.out.print("Digite o " + (i+1) + "º número: ");
            num[i] = input.nextInt();

            if(num[i] > maior){
                maior = num[i];
                posicao++;
            }
        }

        System.out.println(">> O maior número é " + maior + " na posição " + posicao);

        input.close();
    }
}
