package com.evelyn.projects.vetores;

import java.util.Random;

/**
 * <p> Um programa que percorre o vetor Numbers, identifica números pares e ímpares, e armazena 1 para pares e 0 para ímpares no vetor B. E, após, imprime o resultado. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @since 02/11/2024
 * @version 1.0
 */

public class UmParZeroImpar {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();

        int[] numbers = new int[10];
        int[] vetorB = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {

            numbers[i] = gerador.nextInt(100);

            vetorB[i] = (numbers[i] % 2 == 0) ? 1 : 0;
        }

        System.out.println("\n========= Resultados =========");
        for(int i = 0; i < numbers.length; i++ ){ 

            System.out.println("Vetor Numbers, posição [" + i + "]: " + numbers[i]);
            System.out.println("Vetor B, posição [" + i + "]: " + vetorB[i] + "\n");
        }
    }
}
