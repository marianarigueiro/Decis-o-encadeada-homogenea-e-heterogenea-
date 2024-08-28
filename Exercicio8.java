/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o comprimento do lado A (em cm): ");
        double a = scanner.nextDouble();
        System.out.println("Digite o comprimento do lado B (em cm): ");
        double b = scanner.nextDouble();
        System.out.println("Digite o comprimento do lado C (em cm): ");
        double c = scanner.nextDouble();
        
         if (a + b > c && a + c > b && b + c > a) {
            // Determinar o tipo de triângulo
            if (a == b && b == c) {
                System.out.println("O triângulo é equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
         
         scanner.close();
    }
}
