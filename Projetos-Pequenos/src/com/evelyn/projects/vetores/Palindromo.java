package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Esta aplicação recebe 10 números de entrada do usuário, armazena-os em um vetor e exibe se essa sequência é um Palíndromo. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @since 01/11/2024
 * @version 1.0
 */

public class Palindromo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++ ) {
            
            System.out.print("Digite o número da " + (i+1) + "ª posição: ");
            numbers[i] = input.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < numbers.length; i++ ) {

            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.println("\n====================== Vetor Numbers ======================");
        for (int num : numbers ) {
            System.out.print(num + "  ");
        }


        if(palindromo) {
            System.out.println("\n-> É Palíndromo\n");
        } else {
            System.out.println("\n-> Não é Palíndromo\n");
        }

        input.close();
    }
}
