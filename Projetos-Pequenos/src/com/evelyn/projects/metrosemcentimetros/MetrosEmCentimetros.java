/*
* Author: Evelyn
* Date: 14/07/2024
* Language: Java
* Descrition: É um programa que armazena uma medida em metros e converte para centímetros 
*/

package com.evelyn.projects.metrosemcentimetros;

import java.util.Scanner;

public class MetrosEmCentimetros {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
      
        System.out.println("\n======== Conversor metros para centímetros ========\n");
      
        System.out.print(">> Digite o valor em metros: ");
        double metros = input.nextDouble();

        double centimetros = metros * 100;

        System.out.println("===================================================\n");
        System.out.println(">> " + metros + " metros" + " são " + "" + centimetros + " centímetros.\n");
        System.out.println("===================================================\n");

    }
}
