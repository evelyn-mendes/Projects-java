package com.evelyn.projects.cadastroinformacoes;

import java.util.Scanner;

public class Cadastro {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome = "", estadoCivil = "", sexo = "", estadoCivilCompleto = "";
        int idade = 0;
        double salario = 0;
      
        System.out.println("=========================================== Tabela ==========================================");
        System.out.println("\nNome -> mais de 3 caracteres\nIdade -> 0 a 150\nSalário -> maior que zero\nSexo -> 'f' ou 'm'\nEstado Civil -> 's'(solteiro(a))   'c'(casado(a))   'v'(viúvo(a))   'd'(divorciado(a))\n\n");

        System.out.println("==============================================================================================\n");

        for(;;){

            System.out.print(">> Digite seu nome: ");
            nome = input.next();
  
            System.out.print(">> Digite sua idade: ");
            idade = input.nextInt();
  
            System.out.print(">> Digite seu salário: ");
            salario = input.nextDouble();
  
            System.out.print(">> Digite seu sexo: ");
            sexo = input.next().toLowerCase();
  
            System.out.print(">> Digite seu estado civil: ");
            estadoCivil = input.next().toLowerCase();

            if((nome.length() > 3) && 
               (idade >= 0 && idade <= 150) &&
               (salario > 0) && (sexo.equals("f") || sexo.equals("m")) && 
               (estadoCivil.equals("s") || 
                estadoCivil.equals("c") || 
                estadoCivil.equals("v") || 
                estadoCivil.equals("d"))){

              break;
            
            } else {
                System.out.println("\n--> Por favor, siga as regras da tabela.\n\n");
            }
          
        }

        switch(estadoCivil){

          case "s":
            estadoCivilCompleto = "Solteiro";
            break;

          case "c":
            estadoCivilCompleto = "Casado";
            break;

          case "v":
            estadoCivilCompleto = "Viúvo";
            break;

          case "d":
            estadoCivilCompleto = "Divorciado";
            break;

        }
      
        System.out.println("==============================================================================================");

        System.out.println("\n--> Informações válidadas com sucesso!\n");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Estado Civil: " + estadoCivilCompleto);
    }
}
