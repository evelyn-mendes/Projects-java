package com.evelyn.projects.lampadaligadaoudesligada;

import java.util.Scanner;

/**
 * <h1> Lâmpada </h1>
 * 
 * <p>Programa que tem métodos para desligar e ligar uma lâmpada.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 26/09/2024
 */

public class LampadaMain {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a ação [ligar/desligar]: ");
        String resp = input.next();

        Lampada estadoLampada = new Lampada();

        if(resp.equalsIgnoreCase("ligar")) {
            estadoLampada.ligar();

        } else if (resp.equalsIgnoreCase("desligar")) {
            estadoLampada.desligar();

        } else {
            System.out.println("\n-> Ação inválida. Digite 'ligar' ou 'desligar'.");

            input.close();

            return;
        }

        String ligado = (estadoLampada.ligada) ? "Ligadas" : "Desligadas";
 
        System.out.println("\n>> As luzes foram: " + ligado);

        input.close();
    }
}
