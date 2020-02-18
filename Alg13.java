/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso
 * este número seja maior que 10.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva
 * @date 22/08/2013
 */
public class Alg13 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        
        if (num > 10)
            System.out.println("Este número é maior que 10");
        else 
            System.out.println("FIM DO ALGORITMO");
    }
}
