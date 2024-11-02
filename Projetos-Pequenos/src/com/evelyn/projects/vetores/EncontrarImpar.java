package com.evelyn.projects.vetores;

import java.util.Random;

/**
 * <p> Esta aplicação gera números aleatórios entre 0 e 99, armazena-os em um vetor e interrompe a execução ao encontrar um número ímpar, e exibe uma mensagem. </p> 
 * 
 * @author Evelyn Mendes
 * @since 01/10/2024
 * @version 1.0
*/

public class EncontrarImpar {
    
    public static void main(String[] args) {
        
        Random generator = new Random();

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {

            numbers[i] = generator.nextInt(100);

        }

        for(int num : numbers) {

            System.out.println("-> " + num);

            if(num % 2 != 0) {
                break;
            }

        }

        System.out.println("\n>> ímpar encontrado! Encerrando...\n");
    }
}
