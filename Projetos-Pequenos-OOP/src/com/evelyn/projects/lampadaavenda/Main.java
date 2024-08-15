package com.evelyn.projects.lampadaavenda;

public class Main {
    
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.marca = "Philips";
        lampada.tipo = "Led";
        lampada.modelo = "bulbo A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.garantiaMeses = 7;
        lampada.durabilidade = 43.800;
        lampada.cor = "Branca";
        lampada.tipoLuz = "Amarela";

        lampada.tiposUsuabilidades = new String[5];
        lampada.tiposUsuabilidades[0] = "Abajur";
        lampada.tiposUsuabilidades[1] = "Lampeões";

        System.out.println("Marca: " + lampada.marca);
        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tipo: " + lampada.tipo);
        System.out.println("Tensão: " + lampada.tensao);
        System.out.println("Potência: " + lampada.potencia);
        System.out.println("Garantia em meses: " + lampada.garantiaMeses);
        System.out.printf("Durabilidade em horas em média: %.3f\n", lampada.durabilidade);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo de Luz: " + lampada.tipoLuz);
        System.out.println("Tipos de usuabilidades: " + lampada.tiposUsuabilidades[0] + ", " + lampada.tiposUsuabilidades[1]);
    }
    
}
