package com.evelyn.projects.vetores;

/**
 * <p> Um programa que percorre um vetor de idades e encontra a maior e menor idade desse vetor, imprimindo-as e seus respectivos índices ao final do programa. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 29/10/2024
 */

public class MaiorMenorIdade {
    
    public static void main(String[] args) {
        
        int[] idades = {55, 10, 30, 13, 14, 12, 10, 22, 80, 45};
        int maiorIdade = -1;
        int indiceMaiorIdade = 0;
        int menorIdade = 300;
        int indiceMenorIdade = 0;

        for(int i = 0; i < idades.length; i++ ) {

            if(idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indiceMaiorIdade = i;

            } 
            
            if(idades[i] < menorIdade) {
                menorIdade = idades[i];
                indiceMenorIdade = i;
            }
        }

        System.out.println(">> Maior idade: " + maiorIdade);
        System.out.println(">> Posição: " + indiceMaiorIdade + "\n");
        System.out.println(">> Menor idade: " + menorIdade );
        System.out.println(">> Posição: " + indiceMenorIdade + "\n");

    }
}
