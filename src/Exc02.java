import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, cont, resultado, resposta = 1;

        while (resposta == 1) {
            System.out.print("Digite um valor --> ");
            valor = sc.nextInt();
            cont = 0;
            while (cont <= 10) {
                resultado = valor * cont;
                System.out.println(valor + " * " + cont + " = " + resultado);
                cont++;
            }
            System.out.println("Digite (1) para nova tabuada ou (0) para finalizar");
            resposta = sc.nextInt();
        }




    }
}
