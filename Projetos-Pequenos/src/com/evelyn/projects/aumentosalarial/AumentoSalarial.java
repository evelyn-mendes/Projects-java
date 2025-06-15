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
 * @version 1.2
 * @since 25/09/2024
 */

public class AumentoSalarial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o salário incial do usuário: ");
        double salario = input.nextDouble();

        Year ano = Year.now();
        int anoAtual = ano.getValue();

        char resp = 'p';

        do {
            System.out.print("Gostaria de visualizar todas as casas decimais [s/n]? ");
            resp = input.next().toLowerCase().charAt(0);

            if (resp != 's' || resp != 'n') {
                System.out.println("\nAtenção!\nEscolha 's' ou 'n'\n");
            }

        } while (resp != 's' && resp != 'n');

        System.out.printf("Salário incial: %.2f - Ano: 1995\n\n", salario);
      
        double aumento = 1.5;
        salario += (aumento/100) * salario;      

        DecimalFormat format = new DecimalFormat("###,###.##"); // Class para formatar números double

        System.out.printf("Ano: 1996 - Salário: %.3f\n", salario);

        if (resp == 's') {
            for(int i = 1997; i <= anoAtual; i++){

                aumento *= 2;
                salario += (aumento/100) * salario;

                System.out.printf("Ano: %d - Salário: %s - Percentual: %s\n", i, format.format(salario), format.format(aumento));
            }
        } else {
            for(int i = 1997; i <= anoAtual; i++){

            aumento *= 2;
            salario += (aumento/100) * salario;
                System.out.printf("Ano %d - Salário: %.2e - Percentual: %.0f\n", i, salario, aumento);
            }
        }
        input.close();
    }
}
