package com.evelyn.projects.vetores;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * <p> Um programa que recebe a cotação do dólar em relação ao real e calcula o valor convertido em reais para quantidades de 1 a 20 dólares. Ao final, exibe o valor em dólares e o equivalente em reais formatados nos padrões americano e brasileiro, respectivamente. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 01/11/2024
 */

public class CalculoReaisIndices {
    
    public static void main(String[] args) {
        
        // Para configurar a entrada de números
        Locale brasil = Locale.forLanguageTag("pt_BR");
        Scanner input = new Scanner(System.in).useLocale(brasil);

        Locale usa = Locale.US;

        double[] reais = new double[20];
        double dolar = 1;
  
        // Irá retornar o padrão de separação de números do Brasil
        NumberFormat formatBrasil = NumberFormat.getNumberInstance(brasil);
        NumberFormat formatUSA = NumberFormat.getNumberInstance(usa);

        System.out.print(">> Digite a cotação do Dólar em realação ao Real: ");
        double cotacao = input.nextDouble();

        for(int i = 0; i < reais.length; i++ ) {
            
            reais[i] = cotacao * (i+1);
        }

        for(double valor : reais) {

            System.out.printf("US$ %s = R$ %s\n", formatUSA.format(dolar), formatBrasil.format(valor));
            dolar++;
        }

        input.close();
    }
}
