/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu peso atual em kg: ");
         double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura atual em metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);

         System.out.printf("Seu IMC é: %.2f%n", imc);

         if (imc < 18.0) {
            System.out.println("Você está Magro: (MAGREZA)");
        } else if (imc >= 18.0 && imc <= 24.9) {
            System.out.println("Você está Saudável: (SAUDAVEL)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está Sobrepeso: (SOBREPESO)");
        } else {
            System.out.println("Você está Obeso: (BESIDADE)");
        }
    }
}
