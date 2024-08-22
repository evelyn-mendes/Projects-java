/*
* Author: Evelyn
* Date: 22/07/2024
* Language: Java
* Description: É um programa que armazena um número, e imprime o dia da semana de acordo com esse número
*/

package com.evelyn.projects.diadasemana;

import java.util.Scanner;

public class DiaDaSemana {
    
    public static void main(String[] args) {
        
        System.out.println("================ Dia da Semana ================\n");
        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Digite o número do dia da semana: ");
        int dia = input.nextInt();

        System.out.println("\n===============================================\n");

        switch(dia){

            case 1:
                System.out.println(">> Domingo\n");
                break;
  
            case 2:
                System.out.println(">> Segunda-feira\n");
                break;

            case 3:
                System.out.println(">> Terça-feira\n");
                break;

            case 4:
                System.out.println(">> Quarta-feira\n");
                break;

            case 5:
                System.out.println(">> Quinta-feira\n");
                break;

            case 6:
                System.out.println(">> Sexta-feira\n");
                break;

            case 7:
                System.out.println(">> Sábado\n");
                break;

            default:
                System.out.println("Error: < Valor inválido! >\n");
        }
    }
}