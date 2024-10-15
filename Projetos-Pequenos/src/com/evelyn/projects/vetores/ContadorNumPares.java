package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor A, conta a quantidade de números pares dentro desse vetor e imprime os números pares encontrados. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class ContadorNumPares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int countPairs = 0;
        StringBuilder numbers = new StringBuilder();

        for(int i = 0; i < vetorA.length; i++) {
             
            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor A: ");
            vetorA[i] = input.nextInt();

            if(vetorA[i] % 2 == 0) {

                countPairs++;
                numbers.append(vetorA[i]).append("   ");
            }
        }

        System.out.println("\n>> Quantidade de pares: " + countPairs);
        System.out.println("Números pares: " + numbers + "\n");

        input.close();
    }
}
