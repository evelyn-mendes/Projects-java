package com.evelyn.projects.tabuada.tabuadapersonalizada;

import java.util.Scanner;

/**
 * <h1> Tabuada Personalizada </h1>
 * 
 * <p>Programa que recebe um número do usuário, indicando a tabuada desejada, e também os números de início e fim para a geração dessa tabuada.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 24/09/2024
 */

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Montar a tabuada de: ");
        int numTabuada = input.nextInt();

        boolean valido; //Flag
        int numInicial, numFinal;

        do{
            System.out.print("Começar por: ");
            numInicial = input.nextInt();
  
            System.out.print("Terminar em: ");
            numFinal = input.nextInt();

            if(numInicial > numFinal){
                valido = false;

                System.out.println("\n--> Erro: < O número inicial não pode ser maior que o número final >\n");
                
            } else{
                valido = true;
            }
          
        } while(!valido);


        System.out.println("\n>> Montando a tabuada de " + numTabuada + " começando em " + numInicial + " e terminando em " + numFinal + ":");

        for(int i = numInicial; i <= numFinal; i++){

            System.out.println("- " + numTabuada + " x " + i + " = " + (numTabuada * i));
        }

        input.close();
    }
}
