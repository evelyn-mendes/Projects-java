package com.evelyn.projects.numerosprimos.verificacaodeumasequencia;

import java.util.Scanner;

/**
 * <h1> Números Primos </h1>
 * 
 * <p> Programa que itera de 1 até o número escolhido pelo usuário, e diz quais números, desse intervalo, são primos.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 24/09/2024
 */

public class NumerosPrimos {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite até qual número deseja verificar: ");
        int num = input.nextInt();

        boolean primo = true;

        System.out.println("\n>> Números primos de 1 até " + num + ":");
        for (int i = 1; i <= num; i++){

            for (int j = 2; j < i; j ++) {

                if(i % j == 0){
                    primo = false;
                }
            }

            if(primo) {
                System.out.println("- " + i);
            }

            primo = true;
        }

        System.out.println();
        input.close();
    }
}
