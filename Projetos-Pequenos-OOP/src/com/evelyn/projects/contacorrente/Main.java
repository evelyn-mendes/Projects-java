package com.evelyn.projects.contacorrente;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ContaCliente cliente1 = new ContaCliente();

        cliente1.numConta = "1234-56789-0";
        cliente1.saldo = 2000;
        cliente1.status = false;
        cliente1.limite = 5000;

        System.out.print("Digite o que deseja fazer [Sacar/Depositar/Consultar Saldo/Verificar Cheque]: ");
        String resp = input.nextLine().toLowerCase();

        switch(resp){

            case "sacar":
                System.out.print(">>Digite quanto deseja sacar: ");
                boolean saque = cliente1.sacar(input.nextDouble());
        
                if(saque == true){
        
                    System.out.println(">> Saque realizado com sucesso!");
                    System.out.println("\n--> Seu saldo atual é: " + cliente1.saldo);
                    
                } else {
                    System.out.println(">> Limite insuficiente para o saque.");
                }
                break;
            
            case "depositar":
                System.out.print(">> Digite o quanto deseja depositar: ");
                double deposito = input.nextDouble(); 
                cliente1.depositar(deposito);
    
                System.out.println(">> Deposito de " + deposito + " realizado ");
                System.out.println("\n--> Seu saldo atual é: " + cliente1.saldo);
                break;

            case "consultar saldo":
                System.out.print(">> Seu saldo é: ");
                cliente1.consultarSaldo();
                break;
            
            case "verificar cheque":
                String cheque = (cliente1.verificarChequeEspecial() == true) ? "Especial" : "Não Especial";

                System.out.println(">> O cheque é: " + cheque);
                break;

            default:
                System.out.println("Erro: Por favor, digite umas das opções.");

        }

        
    }
}
