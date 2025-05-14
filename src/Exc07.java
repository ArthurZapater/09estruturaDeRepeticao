import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc07 {
    public static void main(String[] args) {

        //Declaração das variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        String CPF;
        int dependente, contribuintes;
        double renda, salarioMIn, IR;

        System.out.print("Digite quantos contribuintes irá verificar--> ");
        contribuintes = sc.nextInt();
        System.out.print("Digite o salario minimo--> ");
        salarioMIn = sc.nextDouble();

        while (contribuintes >= 1) {

            System.out.print("Digite o número do CPF--> ");
            CPF = sc.next();
            System.out.print("Digite sua renda--> ");
            renda = sc.nextDouble();
            System.out.print("Digite quantidade de dependentes--> ");
            dependente = sc.nextInt();


            renda = renda - (salarioMIn * 0.05 * dependente);

            if (renda <= salarioMIn * 2) {
                IR = 0;
            }
            else if (renda <= salarioMIn * 3) {
                IR = renda * 0.05;
            }
            else if (renda <= salarioMIn * 5) {
                IR = renda * 0.10;
            }
            else if (renda <= salarioMIn * 7) {
                IR = renda * 0.15;
            }
            else {
                IR = renda * 0.20;
            }

            System.out.println("CPF: " + CPF);
            System.out.println("IR : " + df.format(IR) );

            contribuintes--;
        }
    }
}
