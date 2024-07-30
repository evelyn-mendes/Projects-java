/*
 * Author: Evelyn
 * Date: 16/07/2024
 * Language: Java
 * Description: É um programa que armazena uma medida de altura, e mostra qual é o peso ideal da pessoa
 */

package com.evelyn.projects.pesoideal;

import java.util.Scanner;

public class PesoIdeal {
    
    public static void main(String[] args) {
        
        System.out.println("\n============== Descubra seu peso ideal ==============\n");

        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Informe sua altura: ");
        double altura = input.nextDouble();

        System.out.println("=====================================================\n");
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf(">> Seu peso ideial é: %.2f\n\n", pesoIdeal);
    }
}
