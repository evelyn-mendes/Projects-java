package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor A, conta a quantidade de ímpares e pares entre os elementos desse vetor, calcula o percentual de ímpares e pares, e imprime esse percentual. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 22/10/2024
 */

public class PorcentImparesPares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        double evenCount = 0, oddCount = 0;

        for(int i = 0; i < vetorA.length; i++ ) {

            System.out.print("\n>> Digite o " + (i+1) + "º elemento do vetor A: ");
            vetorA[i] = input.nextInt();

            if(vetorA[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        evenCount = evenCount * 100 / vetorA.length;
        oddCount = oddCount * 100 / vetorA.length;

        System.out.println("\n>> Porcentagem de números pares é: " + evenCount + "%");
        System.out.println(">> Porcentagem de números ímpares: " + oddCount + "%\n");

        input.close();
    }
}
