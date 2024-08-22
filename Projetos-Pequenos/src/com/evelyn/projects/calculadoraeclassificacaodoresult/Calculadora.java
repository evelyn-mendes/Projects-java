/*
* Author: Evelyn
* Date: 16/08/2024
* Language: Java
* Description: É um programa que armazena dois números, e dá ao usuário a opção de escolher entre somar, subtrair, multiplicar ou dividir eles, e depois imprime o resultado, e se o 
* resultado é par ou ímpar e se ele é decimal ou inteiro
*/

package com.evelyn.projects.calculadoraeclassificacaodoresult;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = input.nextInt();

        System.out.print("Digite a operação que deseja realizar (+ - / *): ");
        String resp = input.next();

        double operacao = 0;
        String parImpar = "", inteiroDecimal = "", tipo = "", positivoNegativo = "";
        boolean valido = true; //Chama-se isso de flag(bandeira) para validarmos algo
        

        System.out.println();
      
        switch(resp){

          case "+":
            tipo = "soma";
            operacao = num1 + num2;
            break;

          case "-":
            tipo = "subtração";
            operacao = num1 - num2;
            break;

          case "*":
            tipo = "multiplicação";
            operacao = num1 * num2;
            break;

          case "/":
            tipo = "divisão";
            operacao = (double)num1 / num2;
            break;

          default:
            System.out.println("Error: < Por favor, digite uma das opções! > ");
            valido = false;
        }

        if(valido){
            System.out.printf("A %s dos números é: %.2f\n", tipo, operacao);

            if(operacao % 2 == 0){
                parImpar = "Par";
            } else {
                parImpar = "Ímpar";
            }
            System.out.println("O número é " + parImpar);

            if(operacao < 0){
                positivoNegativo = "Negativo";
            } else {
                positivoNegativo = "Positivo";
            }
            System.out.println("O número é " +  positivoNegativo);

            if(operacao % 1 != 0){

                inteiroDecimal = "Decimal";

            } else {

                inteiroDecimal = "Inteiro";
            }

            System.out.println("O número é " + inteiroDecimal + "\n");
        }
    }
}