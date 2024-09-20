package com.evelyn.projects.numerosprimos;

import java.util.Scanner;

/**
 * <h1> Números Primos </h1>
 * <p> É um programa que recebe um número e imprime se ele é primo ou não, e mostra por quais números ele é divisível, caso não seja primo. </p>
 * <h4>Language: Java</h4>
 *
 * @author Evelyn
 * @since 07/08/2024
 * @version 1.0
*/

public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("===================== Número Primo =====================");
        System.out.print(">> Digite um número: ");
        int num = input.nextInt();

        boolean primo = true; //Flag

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                System.out.println("-> Divisível por: " + i);
                primo = false;
            }
        }

        if (primo) {
            System.out.println("\n>> É primo\n");
        } else {
            System.out.println("\n>> Não é primo\n");
        }
        
        input.close();
    }
}
