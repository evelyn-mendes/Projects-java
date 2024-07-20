/*
* Author: Evelyn
* Date: 15/07/2024
* Language: Java
* Descrition: É um programa que armazena dois números inteiros e imprime a soma de ambos.
*/

package com.evelyn.projects.somadoisnumeros;

import java.util.Scanner;

public class SomaDoisNumeros {
    
    public static void main(String[] args){

        System.out.println("======================== Adição ========================\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Informe o primeiro número: ");
        int number1 = input.nextInt();

        System.out.print(">> Informe o segundo número: ");
        int number2 = input.nextInt();

        System.out.println("=========================================================\n");

        System.out.println(">> A soma de " + number1 + " + " + number2 + " é igual a " + (number1 + number2) + "\n");  
    }
}
