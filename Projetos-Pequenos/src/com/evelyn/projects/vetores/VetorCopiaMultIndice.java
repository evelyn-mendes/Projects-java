package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que tem um vetor B com o mesmo tipo, tamanho do vetor A, mas com os elementos sendo a multiplicação dos valores de A pelo índice. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class VetorCopiaMultIndice {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o " + (i+1) + " elemento: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++ ){ 

            System.out.println("Vetor A: " + vetorA[i]);
            System.out.println("Vetor B: " +  vetorB[i] + "\n");

        }

        System.out.println();

        input.close();
    }
}
