package com.evelyn.projects.raizesequacaodesegundograu;

import java.util.Scanner;

public class RaizesEquacao2grau {
    
    public static void main(String[] args) {
        
        System.out.println("================= Equação de segundo grau =================\n");

        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o valor de A: ");
        int valorA = input.nextInt();

        if(valorA != 0){

            System.out.print(">> Digite o valor de B: ");
            int valorB = input.nextInt();

            System.out.print(">> Digite o valor de C: ");
            int valorC = input.nextInt();

        System.out.println("\n===========================================================\n");

            double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
            if(delta < 0){
                System.out.println(">> A equação não possui raízes reais.");
                System.out.println(">> As raízes só poderiam ser feitas no campo dos números imaginários.\n");

            } else if(delta == 0){
                System.out.println(">> Possui apenas uma raiz real.\n");

            } else{
                System.out.println(">> O delta possui duas raizes reais.\n");
            }

            double x1 = - valorB - (Math.sqrt(delta)) / (2 * valorA);
            double x2 = - valorB + (Math.sqrt(delta) / (2 * valorA));

            System.out.println(">> Valor de delta é: " + delta);

            System.out.println("\n--> Bhaskara: ");
            System.out.println("X': " + x1);
            System.out.println("X'': " + x2 + "\n\n");

        } else {
            System.out.println("\nError: < Não é possível calcular uma equação de segundo grau, por favor mude o valor de A! >\n");
        }

    }
}
