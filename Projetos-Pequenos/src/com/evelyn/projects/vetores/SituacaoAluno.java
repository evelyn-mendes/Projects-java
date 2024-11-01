package com.evelyn.projects.vetores;

import java.util.Scanner;

/**
 * <p> Um programa que armazena as notas dos alunos e, ao final, imprime as notas, a média e a situação.</p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 01/11/2024
 */

public class SituacaoAluno {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String[] alunos = {"Ana", "Bruno", "Carla", "Diego", "Eva", "Fábio", "Guilherme", "Helena", "Igor", "Julia"};
        
        double[] nota1 = new double[10];
        double[] nota2 = new double[nota1.length];
        double[] media = new double[nota1.length];
        
        StringBuilder result = new StringBuilder();
        String situacao = "";

        for(int i = 0; i < nota1.length; i++) {

            System.out.print("Digite a 1ª nota de " + alunos[i] + ": ");
            nota1[i] = input.nextDouble();

            System.out.print("Digite a 2ª nota: " + alunos[i] + ": ");
            nota2[i] = input.nextDouble();

            System.out.println();

            media[i] = (nota1[i] + nota2[i]) / 2;
            
            situacao = (media[i] > 7) ? "Aprovado" : "Reprovado";

            result.append("Aluno(a): ").append(alunos[i]).append("\nPrimeira nota: ").append(nota1[i]).append("\nSegunda nota: ").append(nota2[i]).append("\nMédia: ").append(media[i]).append("\nSituação: ").append(situacao).append("\n\n");
            
        }

        System.out.println(result);

        input.close();
    }
}
