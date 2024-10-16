package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor Numbers, soma os elementos desse vetor, que são ímpares, e imprime a soma deles e os números ímpares desse vetor. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 15/10/2024
 */

public class SomaNumImpares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0, odd = 0;
        double average;
        StringBuilder numbersOdd = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("\n>> Digite o " + (i+1) + " elemento do vetor: ");
            numbers[i] = input.nextInt();

            if(numbers[i] % 2 != 0) {

                sum += numbers[i];
                numbersOdd.append("[").append(numbers[i]).append("]   ");
                odd++;
            }
        }

        if(odd > 0) {
            average = (double)sum / odd;

            System.out.println("\n>> O números ímpares: " + numbersOdd);
            System.out.printf(">> A média aritmética dos elementos ímpares é: %.2f\n\n", average);
        } else {
            System.out.println("\n>> Não há ímpares no vetor.\n");
        }
        

        input.close();
    }
}
