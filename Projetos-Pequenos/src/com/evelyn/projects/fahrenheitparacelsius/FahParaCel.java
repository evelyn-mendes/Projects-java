/*
 * Author: Evelyn
 * Date: 16/07/2024
 * Language: Java
 * Description: É um programa que armazena a temperatura em fahrenheit, e a converte para celsius
 */

package com.evelyn.projects.fahrenheitparacelsius;

import java.util.Scanner;

public class FahParaCel {
    
        public static void main(String[] args) {
            
            System.out.println("\n======== Conversor de Fahrenheit para Celsius ========\n");
            Scanner input = new Scanner(System.in);

            System.out.print(">> Digite a temperatura em Fahrenheit: ");
            double farenheit = input.nextDouble();

            double celsius = (5 * (farenheit - 32)/9);

            System.out.println("======================================================\n");
            System.out.printf(">> A temperatura em Celsius é: %.3fºC\n\n", celsius);       
        }
}
