/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        
        System.out.println("Digite a primeira data (Dia/Mês/Ano): ");
        String data1Str = scanner.nextLine();
        LocalDate data1 = LocalDate.parse(data1Str, formatter);
        
        System.out.print("Digite a segunda data (Dia/Mês/Ano): ");
        String data2Str = scanner.nextLine();
        LocalDate data2 = LocalDate.parse(data2Str, formatter);
        
        if (data1.isBefore(data2)) {
            System.out.println("Datas em ordem crescente:");
            System.out.println(data1.format(formatter));
            System.out.println(data2.format(formatter));
        } else if (data1.isAfter(data2)) {
            System.out.println("Datas em ordem crescente:");
            System.out.println(data2.format(formatter));
            System.out.println(data1.format(formatter));
        } else {
            System.out.println("As datas são iguais.");
        }
        
         scanner.close();

    }
}
