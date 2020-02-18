/*
 * Elaborar um algoritmo que efetue a apresentação do valor de
 * conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
 * deverá solicitar o valor da cotação do dólar e também a quantidade de
 * dólares disponíveis com o usuários
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg08 {
    public static void main(String[] args) {
        double reais, dolares, cotacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantida de dinheiro em dólares: US$ ");
        dolares = entrada.nextDouble();
        
        System.out.print("Cotação do dólar: R$ ");
        cotacao = entrada.nextDouble();
        
        reais = dolares * cotacao;
        
        System.out.printf("A quantidade de dinheiro em Reais é de: R$ %.2f\n", reais);
    }
}
