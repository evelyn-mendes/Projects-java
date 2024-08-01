/*
* Author: Evelyn
* Date: 22/07/2024
* Language: Java
* Description: É um programa que armazena horas trabalhadas e o valor da hora, e calcula o salário líquido com os descontos
*/

package com.evelyn.projects.salarioliquidocomtaxas;

import java.util.Scanner;

public class SalarioLiquido_v2 {
    
    public static void main(String[] args) {
        
        System.out.println("================ Cálculo de salário líquido com os descontos ================\n");

        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite quanto você ganha por hora: ");
        double ganhoHora = input.nextDouble();

        System.out.print(">> Digite quantas horas você trabalhou esse mês: ");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = ganhoHora * horasTrabalhadas;
        double ir = 0;
        String percentualIr = "";

        System.out.println("\n=============================================================================\n");

        if(salarioBruto <= 900){

            percentualIr = "0%";
            
        } else if(salarioBruto > 900 && salarioBruto <= 1500){

            percentualIr = "5%";
            ir = salarioBruto * 0.05;
            
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){

            percentualIr = "10%";
            ir = salarioBruto * 0.10;
            
        } else if(salarioBruto > 2500){

            percentualIr = "20%";
            ir = salarioBruto * 0.20;
        }

        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;

        System.out.printf(">> Salário Bruto: R$%.2f\n", salarioBruto);
        System.out.printf(">> Desconto do IR (%s): R$%.2f\n", percentualIr, ir);
        System.out.printf(">> Desconto do INSS (10%%): R$%.2f\n", inss);
        System.out.printf(">> FGTS (11%%): R$%.2f\n", fgts);
        System.out.printf(">> Total de descontos (IR - INSS): R$%.2f\n", (ir + inss));
        System.out.printf(">> Salário líquido: R$%.2f\n\n", (salarioBruto - ir - inss));
    }
}
