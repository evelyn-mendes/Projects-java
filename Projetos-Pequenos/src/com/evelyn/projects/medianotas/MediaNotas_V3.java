package com.evelyn.projects.medianotas;

import java.util.Scanner;

public class MediaNotas_V3{

        public static void main(String[] args) {

            System.out.println("================= Média aritmética e Situação =================\n");

            Scanner input = new Scanner(System.in);
            
            System.out.print(">> Nome do aluno(a): ");
            String nomeAluno = input.nextLine();
        
            System.out.print(">> Digite quantas notas deseja registrar: ");
            int numNotas = input.nextInt();

            double[] notas = new double[numNotas];

            double soma = 0, media;
            for(int i = 0; i < notas.length; i++ ){

                System.out.print("Digite a nota " + (i+1) + ": ");
                notas[i] = input.nextDouble();

                soma += notas[i];
            }

            System.out.println("\n================================================================\n");

            media = soma / numNotas;
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