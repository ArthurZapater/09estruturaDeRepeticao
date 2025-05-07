/*
programa que leia 10 numeros inteiros e imprima no terminal o maior valor digitado
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, maior = 0, contador = 1;

        while (contador <= 5){
            System.out.print("Digite um valor --> ");
            valor = sc.nextInt();

            if (contador == 1 || valor > maior){
                maior = valor;
            }
            contador++;
        }
        System.out.println("Maior valor --> " + maior);
    }
}
