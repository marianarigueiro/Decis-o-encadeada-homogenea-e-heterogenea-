/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1: BigMac");
        System.out.println("2: Quarteirão");
        System.out.println("3: MacChicken");
        System.out.println("4: Cheddar");
        System.out.println("5: Cheese Burger");
        System.out.println("Digite o número da opção desejada: ");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: BigMac");
                break;
            case 2:
                System.out.println("Você escolheu: Quarteirão");
                break;
            case 3:
                System.out.println("Você escolheu: MacChicken");
                break;
            case 4:
                System.out.println("Você escolheu: Cheddar");
                break;
            case 5:
                System.out.println("Você escolheu: Cheese Burger");
                break;
            default:
                System.out.println("Sua opção está inválida. Por favor, selecione um número de 1 a 5 de um lanche que esteja no meu.");
                break;
        }
        
          scanner.close();
    }
}
