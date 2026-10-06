import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite o ano atual: ");
            int anoAtual = scanner.nextInt();
            System.out.println("------------------");
            System.out.print("Digite seu ano de nascimento: ");
            int anoNascimento = scanner.nextInt();
            System.out.println("------------------");
            int idade = anoAtual - anoNascimento;
            System.out.println("Idade: " + idade + " anos");
            System.out.println("------------------");
            if (idade >= 18) {
                System.out.println("Situação: Maior de idade");
            } else {
                System.out.println("Situação: Menor de idade");
            }

            System.out.println("\nDeseja continuar a execução? (S-para SIM ou N-para NÃO): ");
            opcao = scanner.next();

        } while (opcao.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}