package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que tem os vetores B, com o mesmo tipo e tamanho do vetor A. O vetor B recebe o resto da divisão dos valores do vetor A por 2. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
*/

public class VetorCopiaResto {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {

            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor A: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++ ) {

            System.out.println("Vetor A: " + vetorA[i]);
            System.out.println("Vetor B: " +  vetorB[i] + "\n");

        }

        input.close();
    }
}
