package com.evelyn.projects.mediaidadeturma;

import java.util.Scanner;

/** 
 * <h1> Média Idade </h1>
 * 
 * <p> É um programa que recebe N idades de alunos, e imprime a média de idade da sala, e diz se a sala é jovem, adulta ou idosa, baseada na média. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 08/08/2024
 */

public class MediaIdade {
    
    public static void main(String[] args) {

        System.out.println("=============== Média Idades ===============");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a quantidade de alunos: ");
        int qtdAlunos = input.nextInt();

        int[] idadeAlunos = new int[qtdAlunos];
        int soma = 0;
        double media = 0;
        String estadoSala = "";

        for(int i = 0; i < idadeAlunos.length; i++){

            System.out.print(">> Digite a idade do " + (i+1) + "º aluno: ");
            idadeAlunos[i] = input.nextInt();

            soma += idadeAlunos[i];
        }

        media = (double)soma / idadeAlunos.length;

        if(media > 0 && media <= 25){
            estadoSala = "Jovem";

        } else if(media > 25 && media <= 60){
            estadoSala = "Adulta";

        } else {
            estadoSala = "Idosa";
        }

        System.out.println("\n================= Resultado =================");
        System.out.println(">> Média da sala: " + media);
        System.out.println(">> A sala é: " + estadoSala + "\n");

        input.close();
    }
}
