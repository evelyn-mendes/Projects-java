package com.evelyn.projects.mediaalunosturmas;

import java.util.Scanner;

/**
 * <h1> Média de Alunos por Turma </h1>
 * 
 * <p> É um programa que recebe N quantidade de turmas e N quantidade de alunos por turma, não podendendo ultrapassar de 40 alunos por turma. E, após, imprime a média de alunos por turma. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.2
 * @since 06/10/2025
 * 
 */

public class MediaAlunos {
    
    public static void main(String[] args) {

        System.out.println("================= Média de Alunos =================");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a quantidade de turmas: ");
        int qtdTurma = input.nextInt();

        int[] qtdAlunos = new int[qtdTurma];
        int soma = 0;
        double media;
        boolean valido = true;
            
        for(int i = 0; i < qtdTurma; i++){

            do {
                System.out.print(">> Digite a quantidade de alunos da turma " + (i+1) + "ª turma: ");
                qtdAlunos[i] = input.nextInt();
    
                if(qtdAlunos[i] > 40){
                    System.out.println("\n-> Erro: < A turma não pode ter mais de 40 alunos! >\n");

                    valido = false;
                } else {
                    valido = true;
                }

            } while (!valido);
            
            
            soma += qtdAlunos[i];
        }

        media = (double)soma / qtdTurma;

        System.out.printf(">> A média de alunos por turma é: %.2f\n", media);

        input.close();
    }
}
