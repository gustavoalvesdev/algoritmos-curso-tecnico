/*
 * Ler uma temperatura em graus Celsius e apresentá-la convertida
 * em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160)/5, sendo F a
 * temperatura em Fahrenheit e C a temperatura em Celsius.
 * Autor : Gustavo Alves da Silva
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva 
 * @date 20/08/2013
 */
public class Alg07 {
    public static void main(String[] args) {
        double f, c;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite a temperatua em Celsius: ");
        c = ent.nextDouble();
        
        f = (9 * c + 160) / 5;
        
        System.out.printf("Temperatura em Fahrenheit: %.1f F\n", f);
        
    }
}
