package com.evelyn.projects.abastecimento;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> Abastecimento </h1>
 * <p>Programa que armazena o tipo de combustível e a quantidade de litros, e depois imprime o valor a ser pago conforme o combustível e o desconto.</p>
 * 
 * <h4>Language: Java</h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 * @since 29/07/2024
 */


public class AbastecimentoVeiculo {
    
    public static void main(String[] args) {
        
        System.out.println("\n================ Abastecimento ================\n");

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
      
        String resp = "";
        String tipoCombustivel;

        do{

            System.out.print(">> Digite o tipo de combustível[A/G]: ");
            tipoCombustivel = input.next().toLowerCase();

            if(!tipoCombustivel.equals("a") && !tipoCombustivel.equals("g")){
                System.out.println("--> Erro: Digite uma das opções.\n");
                
                System.out.print("--> Deseja encerrar o programa[S/N]? ");
                resp = input.next().toLowerCase();

                if(resp.equals("s")){
                    break;
                }
            }
            

            System.out.println();
            
        } while(!tipoCombustivel.equals("a") && !tipoCombustivel.equals("g"));
        

        if(resp.equals("s")){

            System.out.println("Encerrando...");
            
        } else {
            System.out.println("===============================================\n");
            double desconto = 0, valorAlcool = 1.90, valorGasolina = 2.50, valorPago = 0;

            System.out.print(">> Digite a quantidade de litros: ");
            double qtdLitros = input.nextDouble();

            switch(tipoCombustivel){  

              case "a":
                  if(qtdLitros <= 20){
                      desconto = (qtdLitros * valorAlcool) * 0.03;
                  } else{
                      desconto = (qtdLitros * valorAlcool) * 0.05;
                  }

                valorPago = (qtdLitros * valorAlcool) - desconto;
                System.out.printf(">> O valor a ser pago pelo álcool é: R$%.2f\n", valorPago);
                break;

              case "g":
                  if(qtdLitros <= 20){
                      desconto = (qtdLitros * valorGasolina) * 0.04;
                  } else{
                      desconto = (qtdLitros * valorGasolina) * 0.06;
                  }
                valorPago = (qtdLitros * valorGasolina) - desconto;                    
                System.out.printf(">> O valor a ser pago pela gasolina é: R$%.2f\n", valorPago);
                break;
            }
        }
    }
}
