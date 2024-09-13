package com.evelyn.projects.anobissexto;

import java.time.Year;
import java.util.Scanner;

/**
 * <h1> Ano Bissexto </h1>
 * <p>Programa que armazena o ano do sistema ou um ano escolhido pelo usuário, em seguida, imprime se o ano é bissexto.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 22/07/2024
 */

public class VerificarAno {
    
    public static void main(String[] args){

        System.out.println("======================= Verificar se o ano é Bissexto =======================\n");

        Scanner input = new Scanner(System.in);
        
        Year anoAtual = Year.now();
        int ano = 0;
        boolean isValido = true; //Flag(bandeira)

        do{

            System.out.print(">> Deseja calcular um ano diferente do ano do seu sistema[S/N]? ");
            char resp = input.next().toLowerCase().charAt(0);

            switch(resp){

                case 's':
                    System.out.print("\n>> Digite um ano: ");
                    ano = input.nextInt();

                    isValido = true;
                    break;

                case 'n':
                    ano = anoAtual.getValue();

                    isValido = true;
                    break;

                default: 
                    System.out.println("--> Erro: Digite uma das opções.\n");
                    isValido = false;
            }

        } while(!isValido);
        
        System.out.println("\n=============================================================================\n");

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(">> O ano " + ano + " é bissexto.\n");

        } else {
            System.out.println(">> O ano " + ano + " não é bissexto.\n");
        }
        
        
        
    }
}


