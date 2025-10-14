/**
 * <h1>Média das notas</h1>
 * <p> O programa lê N quantidade de notas e, em seguida, calcula a média aritmética das notas. </p>
 * @author Evelyn Mendes
 * @since 14/10/2025
 * @version 1.1
 */

package com.evelyn.projects.medianotas;
import java.util.Scanner;

public class MediaNotas_V1{

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
      System.out.printf("A média das notas é: %.2f\n",media);

      input.close();
    }
}
