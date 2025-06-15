package com.evelyn.projects.areadocirculo;

import java.util.Scanner;

/**
 * <h1> Área de um círculo </h1>
 * <p>Programa que armazena o raio de um círculo e imprime a área deste círcul.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 14/07/2024
 */

public class AreaDoCirculo {
    
    public static void main(String[] args){

        System.out.println("\n============== Área de um círculo ==============\n");

        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o raio do círculo: ");
        double raio = input.nextDouble();

        System.out.print(">> Deseja saber o número exato?[S/N] ");
        char resp = input.next().toLowerCase().charAt(0);
      
        System.out.println("================================================\n");
        double area = Math.PI * Math.pow(raio, 2);

        if(resp == 's'){
           System.out.println(">> A área do círculo é: " + area + "\n");
          
        } else {
          System.out.printf(">> A área do círculo é ≈ %.2f\n\n", area);
        }
        
        input.close();
    }
}
