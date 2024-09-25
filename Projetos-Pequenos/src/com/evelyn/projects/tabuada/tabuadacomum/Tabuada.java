package com.evelyn.projects.tabuada.tabuadacomum;

import java.util.Scanner;

/**
 * <h1> Tabuada Comum </h1>
 * 
 * <p>Programa que recebe um determinado número do usuário e imprime sua tabuada até 10.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 24/09/2024
 */


public class Tabuada {
    
    public static void main(String[] args) {
        
        System.out.println("===================== Tabuada =====================");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o número que deseja ver a tabuada: ");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++) {

            System.out.println("- " + num + " x " + i + " = " + (num*i));
        }
        System.out.println();

        input.close();
    }
    
}
