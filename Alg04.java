/*
 * Função : Escrever um algoritmo que leia o nome de um vendedor, o seu
 * salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva
 * @date 20/08/2013
 */
public class Alg04 {
    public static void main(String[] args) {
        String nome;
        double salarioFixo, vendas, salarioComissao;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Nome do vendedor: ");
        nome = ent.nextLine();
        
        System.out.print("Salário Fixo: R$ ");
        salarioFixo = ent.nextDouble();
        
        System.out.print("Vendas: R$ ");
        vendas = ent.nextDouble();
        
        salarioComissao = salarioFixo + (vendas * 15) / 100;
        
        System.out.printf("Nome do vendedor: %s\n", nome);
        
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário com Comissão: R$ %.2f\n", salarioComissao);
        
        
    }
}
