package com.evelyn.projects.helloworldformatter;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 * <h1> Hello, world! </h1>
 * <p>Imprime o "Hello, world!" na tela de uma forma dependendo da opção que o usuário escolhe.</p>
 * @author Evelyn Mendes
 * @version 1.2
 * @since 29/09/2025
 */

public class HelloWorldFormatter{

    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String ITALIC ="\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        char resp = '1';
    
        do {
            System.out.print("Deseja em português[p] ou inglês[i]? ");
            resp = input.next().toLowerCase().charAt(0);

            if (Character.isLetter(resp)) {
                break;
            }

            JOptionPane.showMessageDialog(null, 
            "<html><span style = 'color: red'>Erro: digite uma resposta válida.</span></html>",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);

        } while (true);
        

        System.out.print("Escolha um estilo de fonte: ");
        System.out.println("\n1 - Normal");
        System.out.println("2 - Negrito");
        System.out.println("3 - Itálico");
        System.out.println("4 - Sublinhado");
        System.out.println("5 - Vermelho");
        System.out.println("6 - Verde");
        System.out.println("7 - Azul");
        int escolha = 0;
            
        try {
            escolha = input.nextInt();
            System.out.println("\n" + formatarTexto(escolha, resp));
        } catch (InputMismatchException e) {
            input.nextLine();
            SwingUtilities.invokeLater (() -> {
                JOptionPane.showMessageDialog(null, 
                "<html><span style = 'color: red;'>Erro: Digite uma resposta válida.</span></html>",
                "Aviso", JOptionPane.INFORMATION_MESSAGE);
            });
            
        }

        input.close();
    }

    public static String formatarTexto (int escolha, char resp) {
        
        String frase = "";
        String fraseFormatada = "";

        switch (resp) {
            
            case 'p':
                frase = ">> Hello, World!";
                if (escolha == 1) {
                    fraseFormatada = frase;
                } else if (escolha == 2){
                    fraseFormatada = BOLD + frase + RESET;
                } else if (escolha == 3) {
                    fraseFormatada = ITALIC + frase + RESET;
                } else if (escolha == 4) {
                    fraseFormatada = UNDERLINE + frase + RESET;
                } else if (escolha == 5) {
                    fraseFormatada = RED + frase + RESET;
                } else if (escolha == 6) {
                    fraseFormatada = GREEN + frase + RESET;
                } else {
                    fraseFormatada = BLUE + frase + RESET;
                }
                break; 
            case 'i':
                frase = ">> Hello, world!";
                if (escolha == 1) {
                    fraseFormatada = frase;
                } else if (escolha == 2) {
                    fraseFormatada = BOLD + frase + RESET;
                } else if (escolha == 3) {
                    fraseFormatada = ITALIC + frase + RESET;
                } else if (escolha == 4) {
                    fraseFormatada = UNDERLINE + frase + RESET;
                } else if (escolha == 5) {
                    fraseFormatada = RED + frase + RESET;
                } else if (escolha == 6) {
                    fraseFormatada = GREEN + frase + RESET;
                } else  {
                    fraseFormatada = BLUE + frase + RESET;
                }
                break;

            default:
                System.out.println("\n>> Parabéns! Olá, mundo! Hello, world!\n");
        }
        return fraseFormatada;
    }
}