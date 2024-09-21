package com.evelyn.projects.medianotas;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> Média Aritmética e Situação </h1>
 * 
 * <p>É um programa que armazena N quantidade de notas, e calcula sua média aritmética, e após diz a situação do aluno. </p> 
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 07/08/2024
 */

public class MediaNotas_V3{

        public static void main(String[] args) {

            System.out.println("================= Média aritmética e Situação =================\n");

            Scanner input = new Scanner(System.in);
            
            System.out.print(">> Nome do aluno(a): ");
            String nomeAluno = input.nextLine();
        
            System.out.print(">> Digite quantas notas deseja registrar: ");
            int qtdNotas = input.nextInt();

            double[] notas = new double[qtdNotas];

            double soma = 0, media;

            input.useLocale(Locale.US);

            for(int i = 0; i < notas.length; i++ ){

                System.out.print("Digite a nota " + (i+1) + ": ");
                notas[i] = input.nextDouble();

                soma += notas[i];
            }

            System.out.println("\n================================================================\n");

            media = soma / qtdNotas;
            System.out.printf(">> A média de %s é: %.2f\n>> Situação: ", nomeAluno, media);
            if(media == 10){
            System.out.println("Aprovado com Distinção!\n");
            
            } else if(media >= 7){
                System.out.println("Aprovado!\n");
            
            } else if (media < 7 && media > 0){
                System.out.println("Reprovado!\n");
            }

        }
}