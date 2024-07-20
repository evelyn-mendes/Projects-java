/*
 * Main Class
 * Author: Evelyn
 * Date: 16/07/2024
 * Language: Java
 * Description: Programa para ler a quantidade de notas, às notas digitadas pelo usuário e, em seguida, calcula a média aritmética das notas
 */

package com.evelyn.projects.medianotas;
import java.util.Scanner;

public class MediaNotas{

    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      int sum = 0, nota, count = 1;
      double media;


      System.out.println("============= Impressão de médias =============\n");
      
      System.out.print(">> Quantas notas são? ");
      int quantidadeDeNotas = input.nextInt();

      System.out.println("===============================================\n");
      for(count = 1; count <= quantidadeDeNotas; count++){

        System.out.print(">> Informe a " + count + "ª nota: ");
        nota = input.nextInt();
        sum += nota;
      }
      media = (double)sum/(count-1);

      System.out.println("===============================================\n");
      System.out.println("A média das notas é: |" + media + "|\n");

      
    }
}