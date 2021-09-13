/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcociente;

import java.util.Scanner;

public class EjCociente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un número...");
        n1 = sc.nextInt();
        System.out.println("Ingrese otro número...");
        n2 = sc.nextInt();
        System.out.println("El Cociente es: " + Cociente(n1, n2));
    }

    public static double Cociente(int num1, int num2) {
        return num1 / num2;
    }

}
