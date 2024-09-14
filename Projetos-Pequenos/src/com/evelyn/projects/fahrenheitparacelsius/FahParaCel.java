package com.evelyn.projects.fahrenheitparacelsius;

import java.util.Scanner;

/**
 * <h1> Fahrenheit para Celsius </h1>
 * <p>É um programa que armazena a temperatura em Fahrenheit e a converte para Celsius</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 16/07/2024
 */
public class FahParaCel {
    
        public static void main(String[] args) {
            
            System.out.println("\n======== Conversor de Fahrenheit para Celsius ========\n");
            Scanner input = new Scanner(System.in);

            System.out.print(">> Digite a temperatura em Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double celsius = (5 * (fahrenheit - 32)/9);

            System.out.println("======================================================\n");
            System.out.printf(">> A temperatura em Celsius é: %.3fºC\n\n", celsius);       
        }
}
