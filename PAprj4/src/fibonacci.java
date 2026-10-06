import java.util.Scanner;
public class fibonacci {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int termo1 = 1;
        int termo2 = 1;
        int proximo;
        int contador = 1;

        System.out.print("Digite a quantidade de termos: ");
        n = entrada.nextInt();

        do {
            System.out.print(termo1 + " ");

            proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;

            contador++;

        } while (contador <= n);

        entrada.close();
    }
}