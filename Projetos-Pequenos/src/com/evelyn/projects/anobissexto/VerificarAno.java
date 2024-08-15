/*
* Author: Evelyn
* Date: 22/07/2024
* Language: Java
* Description: É um programa que armazena o ano do sistema ou um ano escolhido pelo usuário, e após imprime se o ano é bissexto
*/

package com.evelyn.projects.anobissexto;

import java.time.Year;
import java.util.Scanner;

public class VerificarAno {
    
    public static void main(String[] args){

        System.out.println("========== Verificar se o ano é Bissexto ==========\n");

        Scanner input = new Scanner(System.in);
        
        Year anoAtual = Year.now();
        int ano = 0;

        System.out.print(">> Deseja calcular um ano diferente do ano do seu sistema[S/N]? ");
        char resp = input.next().toLowerCase().charAt(0);

        switch(resp){

                case 's':
                    System.out.print("\n>> Digite um ano: ");
                    ano = input.nextInt();
                    break;

                case 'n':
                    ano = anoAtual.getValue();
                    break;

                default: 
                    System.out.println("Error: < Digite uma das opções >");
        }
      
        System.out.println("\n===================================================\n");

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(">> O ano " + ano + " é bissexto.\n");

        } else {
            System.out.println(">> O ano " + ano + " não é bissexto.\n");
        }
        
    }
}


