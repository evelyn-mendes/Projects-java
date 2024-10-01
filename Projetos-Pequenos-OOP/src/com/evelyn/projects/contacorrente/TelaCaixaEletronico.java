package com.evelyn.projects.contacorrente;
import java.util.Scanner;

/**
 * <h1> Conta Corrente </h1>
 * 
 * <p> Programa que simula uma conta corrente, podendo sacar, depositar, consultar saldo e verificar se o cheque é especial ou não.
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.1
 * @since 26/09/2024
 */

public class TelaCaixaEletronico {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean valido = true; //Flag
        int resp;

        ContaCliente cliente1 = new ContaCliente();

        cliente1.numConta = "1234-56789-0";
        cliente1.saldo = 2000;
        cliente1.limiteChequeEspecial = 500;

        System.out.println("========== Escolha uma das opções ==========");

        System.out.println("1- Sacar\t\t2- Depositar\n3- Consultar Saldo\t4- Verificar Cheque");

        System.out.println("============================================");

        do {

            System.out.print(">> Digite uma das opções: ");
            resp = input.nextInt();

            valido = true;

            switch(resp){

                case 1:
                    System.out.print(">> Digite quanto deseja sacar: ");
                    boolean saque = cliente1.sacar(input.nextDouble());
            
                    if(saque){
            
                        System.out.println(">> Saque realizado com sucesso!");
                        System.out.println("\n--> Seu saldo atual é: " + cliente1.saldo + " R$");
                        
                    } else {
                        System.out.println("\n-> Erro: Limite insuficiente para o saque.\n");
                    }
                    break;
                
                case 2:
                    System.out.print(">> Digite o quanto deseja depositar: ");
                    double deposito = input.nextDouble(); 
                    cliente1.depositar(deposito);
        
                    System.out.println("\n>> Deposito de " + deposito + " R$ realizado com sucesso!");

                    System.out.println("\n--> Seu saldo atual é: " + cliente1.saldo + " R$");
                    break;
    
                case 3:
                    cliente1.consultarSaldo();
                    break;
                
                case 4:
                    String cheque = (cliente1.verificarChequeEspecial()) ? "Especial" : "Não Especial";
    
                    System.out.println("\n-> O cheque é: " + cheque);
                    break;
    
                default:
                    System.out.println("\n-> Erro: Por favor, digite umas das opções.\n");
                    valido = false;
            }


        } while(!valido);

        input.close();
        
    }
}
