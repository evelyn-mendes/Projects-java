package com.evelyn.projects.temperaturas;

import java.util.Scanner;

/**
 * <h1> Comparação Temperaturas </h1>
 * 
 * <p> Este programa recebe uma quantidade N de temperaturas e imprime a maior temperatura, a menor e a média das temperaturas.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 18/08/2024
 */


public class Temperaturas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
        System.out.print(">> Digite a quantidade de temperaturas que deseja: ");
        int qtdTemperaturas = input.nextInt();

        int c = 1;
        double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE, media, soma = 0;
        double[] temperaturas = new double[qtdTemperaturas];

        for(int i = 0; i < temperaturas.length; i++){

            System.out.print(">> Digite a " + (i+1) + "ª temperatura: ");
            temperaturas[i] = input.nextDouble();

            if(temperaturas[i] > maior){
              maior = temperaturas[i];
            }

            if(menor > temperaturas[i]){
              menor = temperaturas[i];
            }

            soma += temperaturas[i];
        }

        media = soma / qtdTemperaturas;

        System.out.println("\n=========================== Resultado ===========================");
        System.out.println(">> A maior temperatura é: " + maior);
        System.out.println(">> A menor temperatura é: " + menor);
        System.out.println(">> A média das temperaturas é: " + media + "\n");

        input.close();
    }

}
