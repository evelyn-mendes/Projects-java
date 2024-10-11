package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que tem os vetores B e C, com o mesmo tipo e tamanho do vetor A. O vetor B recebe os mesmos valores do vetor A, e o vetor C armazena a soma dos valores de A e B. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class VetorCopiaSoma {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++ ){

            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor A: ");
            vetorA[i] = input.nextInt();

            System.out.print(">> Digite o " + (i+1) + " elemento do vetor B: ");
            vetorB[i] = input.nextInt();

            System.out.println();

            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++ ){ 

            System.out.println("Vetor A: " + vetorA[i]);
            System.out.println("Vetor B: " +  vetorB[i]);
            System.out.println("Soma, vetor C: " + vetorC[i] + "\n");

        }

        input.close();
    }
}
