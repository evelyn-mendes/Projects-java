package com.evelyn.projects.aumentosalarial;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

/**
 * <h1> Aumento Salarial </h1>
 * 
 * <p>Programa que recebe o salário inicial de um funcionário e calcula o seu novo salário com o aumento percentual, e imprime até o ano atual qual seria o salário desse funcionário. E o percentual a cada ano é o dobro do percentual anterior.</p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 25/09/2024
 */

public class AumentoSalarial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o salário incial do usuário: ");
        double salario = input.nextDouble();

        Year ano = Year.now();
        int anoAtual = ano.getValue();

        System.out.printf("Salário incial: %.2f - Ano: 1995\n\n", salario);
      
        double aumento = 1.5;
        salario += (aumento/100) * salario;

        DecimalFormat format = new DecimalFormat("###,###.##"); // Class para formatar números double

        System.out.printf("Ano: 1996 - Salário: %.3f\n", salario);
    
        for(int i = 1997; i <= anoAtual; i++){

            aumento *= 2;
            salario += (aumento/100) * salario;

            System.out.printf("Ano: %d - Salário: %s - Percentual: %s\n", i, format.format(salario), format.format(aumento));
        }
    
        input.close();
    }
}
