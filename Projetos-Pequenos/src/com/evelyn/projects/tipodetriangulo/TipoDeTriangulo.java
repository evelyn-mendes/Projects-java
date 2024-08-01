/*
* Author: Evelyn
* Date: 22/07/2024
* Language: Java
* Descrition: É um programa que armazena três números, e imprime o tipo de triângulo que ele forma
*/

package com.evelyn.projects.tipodetriangulo;

import java.util.Scanner;

public class TipoDeTriangulo {
    
    public static void main(String[] args) {
        
        System.out.println("================= Tipo de triângulo =================\n");

        Scanner input = new Scanner(System.in);

        int[] lados = new int[3];
      
        for(int c = 0; c < 3; c++){

            System.out.print(">> Digite o " + (c + 1) + "º lado do triângulo: ");
            lados[c] = input.nextInt();
        }

        System.out.println("\n=====================================================\n");


        if(lados[0] + lados[1] > lados[2] && lados[1] + lados[2] > lados[0] && lados[2] + lados[0] > lados[1]){

            if(lados[0] == lados[1] && lados[0] == lados[2] && lados[1] == lados[2]){
                System.out.println(">> Triângulo: Equilátero\n");
              
            } else if(lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]){
                System.out.println(">> Triângulo: Isósceles\n");
              
            } else {
                System.out.println(">> Triângulo: Escaleno\n");
            }
          
        } else{
            System.out.println("Error: < Não é possível formar um triângulo com esses lados. >\n");
        }
    }
}
