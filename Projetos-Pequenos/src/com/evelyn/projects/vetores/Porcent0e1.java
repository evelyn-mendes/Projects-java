package com.evelyn.projects.vetores;

/**
 * <p> Esta aplicação gera números aleatórios de 0 e 1, armazena-os em um vetor e, ao final, calcula e exibe a porcentagem de ocorrências de cada número no vetor. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @since 29/09/2024
 * @version 1.0
*/

public class Porcent0e1 {
     
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        int count0 = 0, count1 = 0;

        for(int i = 0; i < numbers.length; i++ ) {

            numbers[i] = numberGenerator();
        
            if(numbers[i] == 0) {
                count0 ++;
            } else {
                count1 ++;
            }
        }

        System.out.print("\n>> Vetor A: ");
        for(int numero : numbers) {
            System.out.print(numero + " ");
        }

        System.out.println("\n>> Porcentagem de números 0: " + (count0*100/10) + "%");
        System.out.println(">> Porcentagem de números 1: " + (count1*100/10) + "%\n");
    }

    public static int numberGenerator () {

        return (int)Math.round(Math.random()); // O casting é necessário, pois o retorno será do tipo "long".
    }
}
