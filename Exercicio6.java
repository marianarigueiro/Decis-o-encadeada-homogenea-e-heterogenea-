/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio6;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Sênior";
        } else {
            categoria = "Idade inválida. A idade deve ser de pelo menos 5 anos.";
        }
        
        
        System.out.println("Categoria: " + categoria);
        
        scanner.close();
    }
}
