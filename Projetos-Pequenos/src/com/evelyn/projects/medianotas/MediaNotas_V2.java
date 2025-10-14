package com.evelyn.projects.medianotas;

import java.util.Scanner;

/**
 * <h1>Notas de desempenho baseado na média do aluno</h1>
 * <p> É um programa que armazena duas notas, calcula sua média aritmética e, após, diz se o aluno foi aprovado ou reprovado. </p>
 * @author Evelyn Mendes
 * @since 14/10/2025
 * @version 1.1
 */

public class MediaNotas_V2{

    public static void main(String[] args) {
        
        System.out.println("============ Média e Situação ============\n");

        Scanner input = new Scanner(System.in);
      
        int c = 0;
        double media, soma = 0, nota;
        
        for(c = 1; c <= 2; c++){

            System.out.print("Digite a " + c + "ª nota: ");
            nota = input.nextDouble();

            soma += nota;
        }

        System.out.println("\n==============================================\n");

        media = soma/(c-1);

        
        if(media >= 9 && media <= 10){
            System.out.println(">> Conceito: A");
        
        } else if(media < 9 && media >= 7.5){
            System.out.println(">> Conceito: B");
            
        } else if(media < 7.5 && media >= 6){
            System.out.println(">> Conceito: C");
            
        } else if(media < 6 && media >= 4){
            System.out.println(">> Conceito: D");
            
        } else {
            System.out.println(">> Conceito: E");
        }
        
        if(media >= 6 && media <= 10){
            System.out.println(">> APROVADO!\n");
            
        } else {
            System.out.println(">> REPROVADO!\n");
        }

        input.close();
    }
}