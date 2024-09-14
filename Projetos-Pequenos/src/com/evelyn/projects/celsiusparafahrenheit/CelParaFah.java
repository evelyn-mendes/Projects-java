package com.evelyn.projects.celsiusparafahrenheit;

import java.util.Scanner;

/**
 * <h1> Calculadora </h1>
 * <p>É um programa que armazena a temperatura em Celsius e a converte para fFhrenheit</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 16/07/2024
 */

public class CelParaFah {
    
    public static void main(String[] args) {

        System.out.println("\n======== Conversor de Celsius para Fahrenheit ========\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
      
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("======================================================\n");
        System.out.printf(">> A temperatura em Fahrenheit é: %.3fºF\n\n", fahrenheit);
    }
}
