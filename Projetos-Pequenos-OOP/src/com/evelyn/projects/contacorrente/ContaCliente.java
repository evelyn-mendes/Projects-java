package com.evelyn.projects.contacorrente;


public class ContaCliente {
    
    String numConta;
    double saldo;
    boolean status;
    double limite;

    boolean sacar(double dinheiro){

        if(dinheiro > saldo){
            return false;
        } else {
            
            saldo -= dinheiro;
            return true;
        }
    }

    double depositar(double dinheiro){

        saldo += dinheiro;
        return saldo;
    }

    void consultarSaldo(){

        System.out.println(saldo);
    }

    boolean verificarChequeEspecial(){

        if(status == true){
            return true;
        } else {
            return false;
        }
    }
}
