package com.evelyn.projects.calculoimc;

import java.util.Scanner;

/**
 * <h1> Calculadora </h1>
 * <p>É um programa que armazena altura e peso do usuário e o seu IMC.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 16/07/2024
 */

public class CalculoIMC {
    
    public static void main(String[] args) {
        
        System.out.println("\n============== Cálculo de IMC ==============\n");

        Scanner input = new Scanner(System.in);
        
        System.out.print(">> Informe sua altura: ");
        double altura = input.nextDouble();

        System.out.print(">> Informe seu peso: ");
        double peso = input.nextDouble();

        double imc = peso/(Math.pow(altura, 2));

        System.out.println("================= Resultado =================\n");

        if(imc < 18.5){
            System.out.println(">> Abaixo do peso\n");

        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println(">> Peso Normal\n");

        } else if(imc >= 25 && imc <= 29.9){
            System.out.println(">> Sobrepeso\n");
        
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println(">> Obesidade Grau 1\n");

        } else if(imc >= 35 && imc <= 39.9){
            System.out.println(">> Obesidade Grau 2\n");

        } else {
            System.out.println(">> Obesidade Grau 3\n");
        }        
        
    }
}
