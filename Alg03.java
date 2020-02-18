/*
 * Função : Escrever um algoritmo para determinar o consumo médio de um
 * automóvel sendo fornecida a distância total percorrida pelo automóvel e
 * o total decombustível gasto.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg03 {
    public static void main(String[] args) {
        double dist, comb, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida em quilômetros: ");
        dist = entrada.nextDouble();
        
        System.out.println("Digite o total de combustível gasto: ");
        comb = entrada.nextDouble();
        
        media = dist / comb;
        
        System.out.printf("Este veículo percorre %.2f quilômetros por litro de combustível", media);
    }
}
