package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que percorre um vetor idades, conta a quantidade de idades superiores a 35 desse vetor e imprime essa quantidade. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 22/10/2024
 */

public class ContarIdadesAcima35 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a quantidade de idades que deseja: ");
        int size = input.nextInt();

        int[] idades = new int[size];
        int count = 0;

        for(int i = 0; i < idades.length; i++ ) {

            System.out.print(">> Digite a " + (i+1) + " idade: ");
            idades[i] = input.nextInt();

            if(idades[i] > 35) {
                count++;
            }
        }

        System.out.println("\n>> Existem " + count + " pessoas com idade superior a 35 anos.\n");

        input.close();
    }
}
