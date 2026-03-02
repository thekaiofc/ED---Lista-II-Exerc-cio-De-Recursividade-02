package View;

import java.util.Scanner;
import Controller.Divisor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int a = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Divisor não pode ser zero.");
        } else {

            // Instanciando a classe de controle
            Divisor controller = new Divisor();

            int resto = controller.dividir(a, b);

            System.out.println("Resto da divisão: " + resto);
        }

        sc.close();
    }
}
