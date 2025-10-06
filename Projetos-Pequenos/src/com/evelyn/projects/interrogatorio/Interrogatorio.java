package com.evelyn.projects.interrogatorio;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * <h1> Interrogatório </h1>
 * <p>É um programa que simula um interrogatório armazenando respostas das perguntas, e de acordo com o número de respostas positivas, determina se a pessoa é inocente, suspeita, cúmplice, assassina.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 30/09/2025
 */

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

        System.out.print(">> Devia algo à vítima?[S/N] ");
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

        switch(count){

            case 2:
                JOptionPane.showMessageDialog(null, "<html><span style = 'font-weight=bold; text-align=center;'>Suspeito</span></html>","A pessoa é:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
            case 4:
                System.out.println("Cúmplice\n");
                break;

            case 5:
                System.out.println("Assassino(a)\n");
                break;

            default:
                System.out.println("Inocente\n");
        }
        input.close();
    }
}
