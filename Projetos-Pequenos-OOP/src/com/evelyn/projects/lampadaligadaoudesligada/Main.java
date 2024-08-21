package com.evelyn.projects.lampadaligadaoudesligada;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite a ação [ligar/desligar]: ");
        String resp = input.next();

        Lampada estado = new Lampada();

        boolean estadoLampada = estado.ligarLampada(resp);

        String onOff = (estadoLampada == true) ? "Ligadas" : "Desligadas";

        System.out.println("\n>> As luzes foram: " + onOff);
    }
}
