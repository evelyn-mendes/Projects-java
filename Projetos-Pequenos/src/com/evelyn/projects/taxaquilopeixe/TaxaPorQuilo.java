/*
* Author: Evelyn
* Date: 16/07/2024
* Language: Java
* Description: É um programa que armazena o kg transportado, se o kg for menor que 50 aplicasse uma taxa, senão a taxa não é aplicada 
*/

package com.evelyn.projects.taxaquilopeixe;

import java.util.Scanner;

public class TaxaPorQuilo {

    public static void main(String[] args) {
        
        System.out.println("\n============================ Calculo de taxa ============================\n");

        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Digite quantos kg está transportando: ");
        double quilos = input.nextDouble();

        double calculoDeTaxa = (quilos - 50) * 4.00;

        System.out.println("=========================================================================\n");
        if(quilos > 50){
            System.out.println(">> Está |" + (quilos-50) + "Kg| acima do valor permitido.");
            System.out.printf(">> A taxa a ser paga será: R$%.2f\n\n", calculoDeTaxa);
        
        } else {
            System.out.println(">> Está dentro do limite permitido. Está transportando: " + quilos + "Kg");
            System.out.println(">> A taxa a ser paga é: R$00.00\n");
        }

    }

}
