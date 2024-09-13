package com.evelyn.projects.areadoquadrado;

import java.util.Scanner;

/**
 * <h1> Área de um quadrado </h1>
 * <p>Programa que armazena a altura e a base de um quadrado, e calcula sua área e o dobro da área.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 16/07/2024
 */

public class AreaDoQuadrado {
    
    public static void main(String[] args) {
        
      System.out.println("\n============== Área de um quadrado ==============\n");

      Scanner input = new Scanner(System.in);
      
      boolean isValido = true; //Flag(bandeira)
      double base = 0, altura = 0;
        
      do{

        System.out.print(">> Digite a base: ");
        base = input.nextDouble();

        System.out.print(">> Digite a altura: ");
        altura = input.nextDouble();


        if(base != altura){

          System.out.println("--> Erro: Para calcular a área do quadrado, a base e a altura precisa, tem a mesma medida.\n");

          isValido = false;

        } else {
          isValido = true;
        }
        
      } while(!isValido);
      
      
      System.out.println("=================================================\n");
      
      double area = base * altura;      
      System.out.println(">> A área do quadrado é: " + area);

      System.out.println(">> E seu dobro é: " + area * 2 + "\n");
      
    }
}
