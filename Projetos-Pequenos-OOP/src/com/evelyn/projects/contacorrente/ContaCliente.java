package com.evelyn.projects.contacorrente;

public class ContaCliente {
    
    String numConta;
    double saldo;
    boolean chequeEspecial = true;
    double limiteChequeEspecial;

    boolean sacar(double quantiaSacar){

        if(saldo >= quantiaSacar){

            saldo -= quantiaSacar;

            return true;

        } else {
            
            if(chequeEspecial) {

                saldo += limiteChequeEspecial;

                if(saldo >= quantiaSacar) {
                    saldo -= quantiaSacar;
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
    }

    double depositar(double quantiaSacar){

        saldo += quantiaSacar;
        return saldo;
    }

    void consultarSaldo(){

        System.out.println("--> Seu saldo é: " + saldo + " R$");
    }

    boolean verificarChequeEspecial(){

        return saldo <= 0;
    }
}
