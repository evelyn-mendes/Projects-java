/**
 * Author: Evelyn
 * Language: Java
 * Date: 30/08/2024
 * Description: Programa que armazena os dados de um aluno, e de acordo com a nota dele imprime a situação dele
 */

package com.evelyn.projects.matriculaaluno;
import java.util.Scanner;

public class AlunoMain {

    public static void main(String[] args) {
        
        System.out.println("==================== Situação Aluno(a) ====================");
        Scanner input = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.print(">> Digite o nome do aluno: ");
        aluno1.nome = input.nextLine();

        System.out.print(">> Digite a matrícula do aluno: ");
        aluno1.matricula = input.nextInt();

        input.nextLine();

        System.out.print(">> Digite o curso atual desse aluno: ");
        aluno1.cursoAtual = input.nextLine();

        System.out.println();
        for(int i = 0; i < aluno1.disciplinas.length; i++){

            System.out.print(">> Digite a " + (i+1) + " disciplina: ");
            aluno1.disciplinas[i] = input.nextLine();

            System.out.print(">> Digite a nota da disciplina: ");
            aluno1.notas[i] = input.nextDouble();

            input.nextLine();

            System.out.println();
        }

        System.out.println("========================= Situação =========================");
        aluno1.calcularMedia();

        for(int i = 0; i < aluno1.notas.length; i++){

            System.out.println(">> " + aluno1.disciplinas[i] + ": " + aluno1.notas[i] + " -> " + aluno1.aprovadoReprovado[i]);

        }
    }

}
