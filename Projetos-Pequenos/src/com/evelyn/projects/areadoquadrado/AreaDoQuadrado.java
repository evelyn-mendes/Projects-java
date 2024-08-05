/*
 * Author: Evelyn
 * Date: 16/07/2024
 * Language: Java
 * Description: É um programa que armazena a altura e a base de um quadrado, e calcula sua área e o dobro da área
 */

package com.evelyn.projects.areadoquadrado;

import java.util.Scanner;

public class AreaDoQuadrado {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
          System.out.println("\n============== Área de um quadrado ==============\n");

          System.out.print(">> Digite a base: ");
          double base = input.nextDouble();

          System.out.print(">> Digite a altura: ");
          double altura = input.nextDouble();

          System.out.println("=================================================\n");

          if(base != altura){

            System.out.println("Error: < Para calcular a área do quadrado, a base e a altura precisa, tem a mesma medida. >");

          } else {

            double area = base * altura;      
            System.out.println(">> A área do quadrado é: " + area);

            System.out.println(">> E seu dobro é: " + area * 2 + "\n");
          }
          
          
      
    }
}
