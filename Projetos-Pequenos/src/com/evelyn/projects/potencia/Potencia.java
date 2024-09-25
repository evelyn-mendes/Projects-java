package com.evelyn.projects.potencia;

import java.util.Scanner;

/**
 * <h1> Potência </h1>
 * 
 * <p>Programa que simula o método "pow" da classe Math, ou seja, calcula uma potência. O programa recebe uma base e um expoente para calcular a potência correspondente.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn
 * @version 1.0
 * @since 06/08/2024
 */

public class Potencia {

    public static int potencia(int base, int expoente){

        int potencia = base;
        for(int i = 1; i < expoente; i++){
  
            potencia *= base;
        }

        return potencia;
    }
    
    public static void main(String[] args) {
        
        System.out.println("=============================== Potência ===============================");
        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Digite a base: ");
        int base = input.nextInt();

        System.out.print(">> Digite o expoente: ");
        int expoente = input.nextInt();

        int result = potencia(base, expoente);

        System.out.println("========================================================================");
        System.out.println(">> A potência de " + base + " elevado a " + expoente + " é: " + result + "\n");
    
        input.close();
    }
}
