import java.util.Scanner;
public class potencia {



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int base;
        int expoente;
        int potencia = 1;
        int i = 1;

        System.out.println("Digite a base:");
        base = ler.nextInt();

        System.out.println("Digite o expoente:");
        expoente = ler.nextInt();

        do {
            potencia = potencia * base;
            i++;
        } while (i <= expoente);

        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + potencia);
    }
}