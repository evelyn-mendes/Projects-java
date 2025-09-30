package com.evelyn.projects.imparpar;

import java.util.Scanner;

/**
 * <h1> Par ou ímpar </h1>
 * <p>Programa que recebe dez números, e imprime a quantidade de pares e ímpares</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 29/09/2025
 */

public class QtdParImpar {
    
    public static void main(String[] args) {
        
        System.out.println("=============== Quantidade de números Pares e ímpares ===============");
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int countPares = 0, countImpares = 0;
        
        for(int i = 0; i < 10; i++){

            System.out.print(">> Digite o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();

            if(numeros[i] % 2 == 0){
              countPares++;
            
            } else {

              countImpares++;
            }
        }

        System.out.println("\n=====================================================================");
        System.out.println(">> Quantidade de pares: " + countPares);
        System.out.println(">> Quantidade de ímpares: " + countImpares);

        input.close();
    }
}
