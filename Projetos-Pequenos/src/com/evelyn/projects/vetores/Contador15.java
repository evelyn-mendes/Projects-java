package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor A, conta a quantidade de elementos iguais a 15, soma os que estão abaixo de 15 e a média dos que estão acima de 15, desse vetor, e imprime o resultado dessas validações. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 22/10/2024
 */

public class Contador15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int sumBelow15 = 0, sumOver15 = 0 , countEquals15 = 0, count = 0;
        double average;

        for(int i = 0; i < vetorA.length; i++ ) {

            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor A: ");
            vetorA[i] = input.nextInt();

            if(vetorA[i] < 15) {
                sumBelow15 += vetorA[i];

            } else if(vetorA[i] > 15) {
                sumOver15 += vetorA[i];
                count++;

            } else {
                countEquals15++;
            }

        }

        System.out.println("\n>> Soma dos elementos do vetor que são inferiores a 15: " + sumBelow15);
        System.out.println(">> A quantidade de elementos do vetor que são igual a 15: " + countEquals15);

        if (count > 0) {
         
            average = (double)sumOver15 / count;
    
            System.out.printf(">> Média dos elementos do vetor superiores a 15: %.3f\n\n", average);
        } else {

            System.out.println(">>  Não há elementos maiores que 15 para calcular a média.\n");
        }

        
        

        input.close();
    }
}
