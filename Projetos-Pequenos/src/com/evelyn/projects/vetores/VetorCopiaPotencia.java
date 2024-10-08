package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que faz um vetor B com o mesmo tipo, tamanho do vetor A, mas com os elementos elevados ao quadrado. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class VetorCopiaPotencia {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++ ){

            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = (int)Math.pow(vetorA[i], 2); // Casting necessário porque Math.pow retorna double
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++ ){

            System.out.println("Vetor A: " + vetorA[i]);
            System.out.println("Vetor B: " + vetorB[i]);

            System.out.println();
        }

        input.close();
    }
}