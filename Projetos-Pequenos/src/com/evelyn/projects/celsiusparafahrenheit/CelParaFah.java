package com.evelyn.projects.celsiusparafahrenheit;

import java.util.Scanner;

public class CelParaFah {
    
    public static void main(String[] args) {

        System.out.println("\n======== Conversor de Celsius para Fahrenheit ========\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
      
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("======================================================\n");
        System.out.printf(">> A temeperatura em Fahrenheit é: %.3fºF\n\n", fahrenheit);
    }
}
