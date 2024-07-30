package com.evelyn.projects.helloworld;

import java.util.Scanner;

public class HelloWorld{

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Deseja em português[p] ou inglês[i]? ");
        char resp = input.next().toLowerCase().charAt(0);

        switch (resp) {
            
            case 'p':
                System.out.println("\n>> Olá, mundo!\n");
                break;
            
            case 'i':
                System.out.println("\n>> Hello, world!\n");
                break;
            
            default:
                System.out.println("\n>> Parabéns! Olá, mundo! Hello, world!\n");
                
        }


    }
}