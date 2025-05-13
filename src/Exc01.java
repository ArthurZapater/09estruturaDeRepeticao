import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, maior = 0, contador = 1;

        while (contador <=15 ){
            System.out.print("Digite um valor --> ");
            valor = scanner.nextInt();

            if (contador == 1 || valor > maior ){
                maior = valor;
            }
            contador++;
        }
        System.out.println("Maior valor --> " + maior);



    }
}
