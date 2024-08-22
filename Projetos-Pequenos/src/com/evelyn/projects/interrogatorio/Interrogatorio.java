/*
 * Author: Evelyn
 * Date: 17/08/2024
 * Language: Java
 * Description: É um programa que simula um interrogátorio armazenando respostas das perguntas, e de acordo com quantas respostas foram positivas, 
 * determina se a pessoa é inocente, suspeita, cúmplice, assassina
 */


package com.evelyn.projects.interrogatorio;

import java.util.Scanner;

public class Interrogatorio {
 
    public static void main(String[] args) {
        
        System.out.println("========================== Interrogatório ==========================\n");
        Scanner input = new Scanner(System.in);

        System.out.print(">> Telefonou para a vítima?[S/N] ");
        String resp1 = input.next().toLowerCase();

        System.out.print(">> Esteve no local do crime?[S/N] ");
        String resp2 = input.next().toLowerCase();

        System.out.print(">> Mora perto da vítima?[S/N] ");
        String resp3 = input.next().toLowerCase();

        System.out.print(">> Devia para a vítima?[S/N] ");
        String resp4  = input.next().toLowerCase();

        System.out.print(">> Já trabalhou com a vítima?[S/N] ");
        String resp5  = input.next().toLowerCase();

        int count = 0;

        if(resp1.equals("s")){
            count++;
        }
        if(resp2.equals("s")){
            count++;
        }
        if(resp3.equals("s")){
            count++;
        }
        if(resp4.equals("s")){
            count++;
        }
        if(resp5.equals("s")){
            count++;
        }

        System.out.println("======================================================================");


        System.out.print(">> A pessoa é: ");
        switch(count){

            case 2:
                System.out.println("Suspeita\n");
                break;

            case 3:
            case 4:
                System.out.println("Cúmplice\n");
                break;

            case 5:
                System.out.println("Assassina\n");
                break;

            default:
                System.out.println("Inocente\n");
        }
    }
}
