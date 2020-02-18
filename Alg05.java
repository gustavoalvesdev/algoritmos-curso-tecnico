/*
 * Escrever um algoritmo que leia o nome de um aluno e as notas
 * das três provas que ele obteve no semestre. No final informar o nome do
 * aluno e a sua média (aritmética).
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg05 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        String nome;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o nome do aluno: ");
        nome = ent.nextLine();
        
        System.out.println("Nota da Prova 1: ");
        nota1 = ent.nextDouble();
        
        System.out.println("Nota da Prova 2: ");
        nota2 = ent.nextDouble();
        
        System.out.println("Nota da Prova 3: ");
        nota3 = ent.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("Aluno: %s", nome);
        System.out.printf("\nMédia: %.1f\n", media);
    }
            
}
