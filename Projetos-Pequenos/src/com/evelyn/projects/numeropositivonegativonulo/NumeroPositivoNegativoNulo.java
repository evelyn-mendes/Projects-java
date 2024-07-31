/*
* Author: Evelyn
* Date: 16/07/2024
* Language: Java
* Description: É um programa que armazena um valor e diz se ele é positivo ou negativo
*/

package com.evelyn.projects.numeropositivonegativonulo;

import java.util.Scanner;

public class NumeroPositivoNegativoNulo {
    
    public static void main(String[] args){

        System.out.println("\n========= Verificador de número =========\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = input.nextDouble();

        System.out.println("=========================================\n");

        if(num > 0){
            System.out.println("O número " + num  + " é positivo\n\n");
          
        } else if(num < 0){
            System.out.println("O número " + num  + " é negativo\n\n");
          
        } else {
            System.out.println("O número " + num  + " é nulo\n\n");
        }
    }
}
