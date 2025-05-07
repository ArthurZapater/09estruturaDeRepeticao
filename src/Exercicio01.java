import java.util.Scanner;

/*
programa que leia dois valores inteiros (o segundo valor deve ser obrigatoriamente
maio que o primeiro). O programa deve imprimir todos os números entre o primeiro e o segundo (inclusive)
 */
public class Exercicio01 {
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        //Entrada de dados
        System.out.print("Digite o primeiro valor --> ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor ( maior que o primeiro --> ");
        valor2 = sc.nextInt();

        if (valor2 > valor1){
            while (valor1 <= valor2){
                System.out.print(valor1 + " ");
                //valor1 = valor1 + 1;
                valor1++;
            }
        }
        else {
            System.out.println("O segundo valor deve se maior que o primeiro");
        }









    }
}
