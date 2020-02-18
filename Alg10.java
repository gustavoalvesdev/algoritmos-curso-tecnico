/*
 * Função : A Loja Mamão com Açucar está vendendo seus produtos em 5
 * (cinco) prestações sem juros. Faça um algoritmo que receba um valor de
 * compra e mostre o valor das prestações.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg10 {
    public static void main(String[] args) {
        double compra, prest;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: R$ ");
        compra = entrada.nextDouble();
        
        prest = compra / 5;
        
        System.out.printf("Você pode pagar em 5 (cinco) prestações de R$ %.2f\n", prest);
    }
}
