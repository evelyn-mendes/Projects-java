package com.evelyn.projects.vetores;

import java.util.Scanner;

/** 
 * <p> Um programa tem um vetor B com o mesmo tipo, tamanho do vetor A, mas com os elementos sendo a raiz quadrada dos valores de A. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
*/

public class VetorCopiaRaiz {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++ ) {
            
            System.out.print("Digite o " + (i+1) + " elemento: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println();

        for(int i = 0; i < vetorA.length; i++ ) {

            System.out.println("Vetor A: " + vetorA[i]);
            System.out.printf("Vetor B: %.2f\n", vetorB[i]);

            System.out.println();
        }

        input.close();
    }
}
