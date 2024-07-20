/*
 * Author: Evelyn
 * Date: 16/07/2024
 * Language: Java
 * Description: Programa para ler dois números, e fazer alguma operação aritmética escolhida pelo usuário.
 */

package com.evelyn.projects.calculadora;

import java.util.Scanner;

public class CalculadoraPessoal {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("======================== Sua calculadora pessoal ========================\n");
    System.out.print(">> Digite o primeiro número: ");
    int num1 = input.nextInt();

    System.out.print(">> Digite o segundo número: ");
    int num2 = input.nextInt();

    System.out.println("============================================================================\n");

    System.out.println(">> Escolha o que deseja fazer com os números[escreva a ação]:\n\n(Soma)[+]    (Subtração)[-]    (Multiplicação)[*]    (Divisão)[/]");
    String opcao = input.next().toLowerCase();

    System.out.println("============================================================================\n");



    System.out.print(">> Você digitou o símbolo da operação?[S/N] ");
    char escolha = input.next().toLowerCase().charAt(0);

    System.out.println("============================================================================\n");
    if(escolha == 's'){

      switch(opcao){

        case "+":
          System.out.println("\n" + num1  + " + " + num2 + " = " + (num1 + num2));
          break;

        case "-":
            System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
            break;  

        case "*":
            System.out.println("\n" + num1 + " x " + num2 + " = " + (num1 * num2));
            break;
          
        case "/":
          System.out.println("\n" + num1 + " / " + num2 + " = " + (num1/num2));
          break;

        default:
            System.out.println("\nError: <Por favor, escolha uma opção válida>");
      }
    } else {

        switch(opcao){

          case "soma":
            System.out.println("\n" + num1  + " + " + num2 + " = " + (num1 + num2));
            break;

          case "subtração":
          case "subtracao":
            System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
            break;

          case "multiplicação":
          case "multiplicacao":
            System.out.println("\n" + num1 + " x " + num2 + " = " + (num1 * num2));
            break;

          case "divisão":
          case "divisao":
            System.out.println("\n" + num1 + " / " + num2 + " = " + (num1/num2));
            break;

          default:
            System.out.println("\nError: <Por favor, escolha uma opção válida>");
        }

    }   

    System.out.println("\nEncerrando...\n");
  }
}
