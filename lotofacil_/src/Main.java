import java.util.Scanner;
import java.util.Random;

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        do {
            System.out.println(" LOTOFÁCIL ");
            System.out.println("Menu ");
            System.out.println("1- Aposta de 0 a 100");
            System.out.println("2- Aposta de A a Z");
            System.out.println("3- Aposta em par ou impar");
            System.out.println("0- Sair");
            System.out.println("Escolha a opção desejada : ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apostade0a100(scanner, random);
                    break;

                case 2:
                    apostadeAaZ(scanner);
                    break;

                case 3:
                    Apostaemparouimpar(scanner, random);
                    break;

                case 0:
                    System.out.println("Digite 0 para sair");
                    break;

                default:
                    System.out.println("opção invalida");
            }
        } while (opcao != 0);
    }

    private static void apostade0a100(Scanner input, Random random) {
        System.out.println(" Lotofácil ");
        System.out.println("Aposta de 0 à 100:");
        int rand = random.nextInt(101);
        int value = input.nextInt();
        if (value >= 0 && value <= 100) {
            if (value == rand) {
                System.out.println(rand);
                System.out.println("Parabéns, seu número foi sorteado, você ganhou R$ 1.000,00 reais!");
            } else {
                System.out.println("Que pena! O número sorteado foi: " + rand);
            }
        } else {
            System.err.println("Aposta inválida.");
        }
    }

    private static void apostadeAaZ(Scanner input) {
        System.out.println(" Lotofácil ");
        System.out.println(" Aposta de A à Z:");
        char letter = input.next().toUpperCase().charAt(0);
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Letra selecionada é: " + letter);
            char let = 'A'; // Letra premiada é 'A'
            if (letter == let) {
                System.out.println("Letra premiada: " + let);
                System.out.println("Parabéns você ganhou: R$ 500,00");
            } else {
                System.out.println("Que pena! A letra premiada é: " + let);
            }
        } else {
            System.err.println("Aposta inválida!");
        }
    }


    private static void Apostaemparouimpar(Scanner scanner, Random random) {
        System.out.println(" Lotofácil ");
        System.out.println("Aposta em par ou ímpar: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Parabéns, você ganhou R$: 100,00");
        } else {
            System.out.println("Que pena! A premiação foi para números pares.");
        }
    }
}
