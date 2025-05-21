import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, cont = 1;
        double fat = 1;

        System.out.print("Digite um numero --> ");
        valor = sc.nextInt();

        while (cont <= valor){
            fat *= cont;
            cont++;
        }
        System.out.println(fat);
    }
}
