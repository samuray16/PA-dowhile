
public class SomaImpares {

    public static void main(String[] args) {
        int i = 1;
        long soma = 0;

        do {
            if (i % 2 != 0) {
                soma += i;
            }
            i++;
        } while (i <= 1000);

        System.out.println("A soma dos números ímpares de 1 a 1000 é: " + soma);
    }
}