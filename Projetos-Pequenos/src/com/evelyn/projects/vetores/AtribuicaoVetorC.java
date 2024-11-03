package com.evelyn.projects.vetores;

import java.util.Random;

/**
 * <p> Um programa que percorre dois vetores, A e B, e identifica se o elemento de A é maior, igual ou menor que o elemento de B na mesma posição. Caso A seja maior que B, o vetor C recebe 1; se A for igual a B, o vetor C recebe 0; caso contrário, recebe -1. Em seguida, imprime o resultado. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @since 02/11/2024
 * @version 1.0
 */

public class AtribuicaoVetorC {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++ ) {

            vetorA[i] = gerador.nextInt(100);
            vetorB[i] = gerador.nextInt(100);

            vetorC[i] = (vetorA[i] > vetorB[i]) ? 1 : (vetorA[i] == vetorB[i]) ? 0 : -1; 
            // Se o vetor A > vetor B 
            //     vetor C posição i = 1
            // Senao se vetor A == vetor B
            //     vetor c posição i = 0
            // Senao
            //     vetor c posição i = -1
        }

        System.out.println("=========== Comparação entre Vetores ===========\n");
        for(int i = 0; i < vetorA.length; i++ ){ 

            System.out.println("Vetor A, posição [" + i + "]: " + vetorA[i]);
            System.out.println("Vetor B, posição [" + i + "]: " + vetorB[i]);
            System.out.println("Vetor C, posição [" + i + "]: " + vetorC[i] + "\n");
        }

    }
}
