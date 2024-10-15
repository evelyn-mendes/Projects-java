package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 *  <p> Um programa que percorre um vetor Numbers, soma os elemtos desse vetor e imprime a soma deles. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes 
 * @version 1.0
 * @since 28/09/2024
 */

public class SomaElementos {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {

            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor: ");
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        System.out.println("\n>>A soma de todos os números é: " + sum + "\n");

        input.close();
    }
}
