import java.util.Scanner;
import java.util.Random;

public class Lotofácil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int tela = input.nextInt();
        do {
            System.out.println("Menu Lotofacil :");
            System.out.println("1- Aposta de 0 a 100");
            System.out.println("Digite um numero de o a 100: ");
            System.out.println("2- Aposta de A a Z");
            System.out.println("3- Aposta em par ou impar");
            System.out.println("0- Sair");


            switch (tela) {
                case 1:
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
                    break;

                case 2:
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
                    break;

                case 3:
                    System.out.println(" Lotofácil ");
                    System.out.println("Aposta em par ou ímpar: ");
                    int num = input.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("Parabéns, você ganhou R$: 100,00");
                    } else {
                        System.out.println("Que pena! A premiação foi para números pares.");
                    }
                    break;

                case 0:
                    System.out.println("Digite 0 para sair");
                    break;

                default:
                    System.out.println("opção invalida");
            }
        } while (tela != 0);
    }
}