package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor Numbers, soma os elementos desse vetor, que são múltiplos de 5, e imprime a soma deles. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 03/10/2024
 */

public class SomaElementosMultiplos {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        String multiple = "";

        for(int i = 0; i < numbers.length; i++ ) {

            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor: ");
            numbers[i] = input.nextInt();

            if(numbers[i] % 5 == 0) {

                sum += numbers[i];
                multiple += "[" + numbers[i] + "]   ";
            }
         }

        System.out.println("\n>> O múltiplos: " + multiple);
        System.out.println(">> A soma dos números múltiplos de 5 desse vetor: " + sum + "\n");

        input.close();
    }
}
