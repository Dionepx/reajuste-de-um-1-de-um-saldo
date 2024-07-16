import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        double aumentoPercentual_1 = saldo * 1.01;

        System.out.println(aumentoPercentual_1);

        sc.close();
    }
}