/*
* Author: Evelyn
* Date: 16/07/2024
* Language: Java
* Description: É um programa que armazena uma letra e diz se ela é uma vogal ou consoante
*/


package com.evelyn.projects.vogalouconsoante;

import java.util.Scanner;

public class VogalOuConsoante {
 
    public static void main(String[] args) {
 
        System.out.println("\n========= Verificador de letras =========\n");

        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite uma letra: ");
        String letra = input.next().toLowerCase();

        System.out.println("=========================================\n");

        if(letra.matches("-?[0-9]+") || letra.length() > 1){
            System.out.println("--> Error: Não é uma letra\n\n");
            
        } else {
            
            switch(letra){

              case "a":
              case "e":
              case "i":
              case "o":
              case "u":
                System.out.println(">> A letra `" + letra + "` é uma vogal.\n\n");
                break;

              default:
                System.out.println(">> A letra `" + letra + "` é uma consoante.\n\n");
            }
        }
    }
}
