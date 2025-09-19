package com.evelyn.projects.fatorial;

import java.util.Scanner;

/**
 * <h1> Fatorial </h1>
 * 
 * <p>Programa que armazena um número e imprime o seu fatorial.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.2
 * @since 21/09/2024
 */

public class Fatorial {
    
    public static void main(String[] args) {

        System.out.println("================== Fatorial ==================");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Fatorial de: ");
        int num = input.nextInt();

        long fatorial = 1;

        System.out.print(num + "! = ");

        for(int i = num; i > 1; i--){

            System.out.print(i + " x ");

            fatorial *= i;
        }

        System.out.println("1 = " + fatorial + "\n");

        input.close();
    }
}
