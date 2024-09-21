package com.evelyn.projects.compradecds;

import java.util.Scanner;

/**
 * <h1> Compra de CDs </h1>
 * 
 * <p> É um programa que recebe N quantidade de CDs e calcula a soma entre os preços de todos os CDs, e após imprime o valor médio gasto na compra de cada CD. </p>
 * 
 * <h4>Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 21/09/2024
 */

public class CDS {
    
    public static void main(String[] args) {

        System.out.println("==================== Compra de CDs ====================");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a quantidade de CDs comprados: ");
        int qtdCd = input.nextInt();

        String[] cds = new String[qtdCd];
        double[] valoresCds = new double[qtdCd];
        double soma = 0;
        double media = 0;
      
        System.out.println();
        for(int i = 0; i < cds.length; i++){

            input.nextLine();

            System.out.print(">> Digite o nome do " + (i+1) + "º CD: ");
            cds[i] = input.nextLine();

            System.out.print(">> Digite o valor pago nesse CD: ");
            valoresCds[i] = input.nextDouble();

            System.out.println();
            soma += valoresCds[i];
        }

        media = soma / qtdCd;

        System.out.println("======================= Resultado =======================");
        for(int i = 0; i < cds.length; i++){

            System.out.println(">> CD: " + cds[i] + " - Valor pago: R$" + valoresCds[i]);
        }

        System.out.printf("\n>> O valor médio gasto com cada CD: %.2f\n", media);

        input.close();
    }
}
