/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        String conceito;
        String status;
        
        if (media >= 9) {
            conceito = "A";
            status = "Aprovado";
            
        } else if (media >= 7 && media<9) {
            conceito = "B";
            status = "Aprovado";        
        } else if (media >= 2.5 && media <7) {
            conceito = "C";
            status = "Aprovado";
        } else if (media >= 2.5 && media <5) {
            conceito = "D";
            status = "Reprovado";
    } else {
            conceito = "E";
            status = "Reprovado";
        }
        
        System.out.printf ("Méia: %.2f\n" , media);
        System.out.println ("conceito: " + conceito);
        System.out.println ("status: " + status);
        
        scanner.close();


    }
}

