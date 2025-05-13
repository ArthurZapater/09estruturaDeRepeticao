import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, termos, x = 1, y = 1, z ;

        System.out.print("Digite a quantidade de termos fibonacci --> ");
        termos = sc.nextInt();
        if  ( termos == 1){
            System.out.print(x);
        }
        else if (termos == 2){
            System.out.print(x + " " + " " + y);
        }
        else {
            System.out.print(x + " " + y + " ");
            cont = 3;
            while (cont <= termos) {
                z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
                cont++;
            }
        }
    }
}
