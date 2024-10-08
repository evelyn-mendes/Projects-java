package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que faz um vetor B com o mesmo tipo, tamanho do vetor A, mas com os elementos multiplicados por 2. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class VetorCopiaDobro {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        /* 
            int[] b = a; // Acontece o erro porque a e b colocados dessa forma referenciam o mesmo espaço na memória, portanto as alterações em b refletem nos valores de a.
            Quando você faz a atribuição int[] b = a; em Java, o vetor b não é uma cópia independente do vetor a, mas sim uma referência ao mesmo array na memória.
        */
        
        for(int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i]*2;
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
