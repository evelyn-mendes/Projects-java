/*
* Author: Evelyn
* Date: 16/07/2024
* Language: Java
* Description: É um programa que armazena o ganho por hora e quantas horas foram trabalhadas no mês, e após aplica as taxas e imprime o salário bruto, o salário líquido, e as taxas
*/

package com.evelyn.projects.salarioliquidocomtaxas;

import java.util.Scanner;

public class SalarioLiquido_v1 {
    
    public static void main(String[] args) {
        
        System.out.println("\n============== Salário líquido do mês =======================\n");

        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Digite quanto você ganha por hora: ");
        double dinheiroPorHora = input.nextDouble();

        System.out.print(">> Digite quantas horas você trabalha por mês: ");
        int horasTrabalhadas = input.nextInt();

        System.out.println("=============================================================\n");

        double salarioBruto = dinheiroPorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.08;
        double ir = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.05;
              
        double salarioLiquido = salarioBruto - inss - ir - sindicato;

        System.out.printf(">> Seu salário bruto é: R$%.2f\n", salarioBruto);
        System.out.printf(">> O valor do INSS é: R$%.2f\n", inss);
        System.out.printf(">> O valor do Sindicato é: R$%.2f\n", sindicato);
        System.out.printf(">> O valor do Imposto de Renda é: R$%.2f\n", ir);
        System.out.printf(">> Seu salário líquido é: R$%.2f\n\n", salarioLiquido);
    }
}
