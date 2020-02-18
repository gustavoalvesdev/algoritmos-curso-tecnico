/*
 * Faça um algoritmo que receba o preço de custo de um produto e
 * mostre o valor de venda. Sabe-se que o preço de custo receberá um
 * acréscimo de acordo com um percentual informado pelo usuário
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg11 {
    public static void main(String[] args) {
        double precoCusto, percentual, calculo, valorVenda;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Informe o preço de custo do produto: R$ ");
        precoCusto = ent.nextDouble();
        
        System.out.print("Informe o percentual de acréscimo: ");
        percentual = ent.nextDouble();
        
        calculo = (precoCusto * percentual) / 100;
        
        valorVenda = calculo + precoCusto;
        
        System.out.printf("O produto será vendido por: R$ %.2f\n", valorVenda);
    }
}
