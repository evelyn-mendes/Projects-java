package com.evelyn.projects.matriculaaluno;

public class Aluno {

    String nome;
    int matricula;
    String cursoAtual;
    String[] disciplinas = new String[3];
    double[] notas = new double[3];
    String[] aprovadoReprovado = new String[3];

    String[] calcularMedia(){

        for(int i = 0; i < notas.length; i++){
            
            if(notas[i] >= 7){
                aprovadoReprovado[i] = "Aprovado";
            } else {
                aprovadoReprovado[i] = "Reprovado";
            }
        }

        return aprovadoReprovado;
   
    }
}
