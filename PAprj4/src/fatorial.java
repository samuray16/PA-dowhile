import java.util.Scanner;
public class fatorial {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        int i;

        System.out.println("Digite um número inteiro:");
        numero = ler.nextInt();

        i = numero;

        do {
            fatorial = fatorial * i;
            i--;
        } while (i >= 1);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
