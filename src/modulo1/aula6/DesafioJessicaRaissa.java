package modulo1.aula6;

import java.util.Scanner;

public class DesafioJessicaRaissa {
    // DESAFIO 20/09 - DUPLA RAISSA E JESSICA //
    /* Enunciado: Crie um programa em linguagem Java que atenda aos seguintes requisitos:

_ Deve exibir um menu onde o usuário pode escolher números pares, números ímpares, números primos,
                            calculo de juros compostos e sair.

_ Na opção de números pares, o usuário poderá digitar um valor e o sistema exibirá todos os números
                        pares de zero até o valor que o usuário digitou.

_ Na opção de números ímpares, o usuário deverá digitar um valor e o sistema exibirá todos os números
                        ímpares de zero até o valor digitado pelo usuário.

_ Na opção dos números primos, o sistema deve solicitar que o usuário digite um número e dizer quais são
                      os números primos de zero ao valor digitado pelo usuário.

_ Para o calculo do juros, o sistema deve solicitar ao usuário que digite o valor do investimento,
 o prazo e a taxa de juros mensal. O sistema deve imprimir o retorno mês a mês e o montante para resgate
                                        ao final do prazo.

_ O programa deve validar os dados inseridos, não permitindo valores negativos.

_ Deve ser criado um novo repositório no github para a dupla e inserido o usuário */

    public static boolean Primo(int numero) {
        boolean ePrimo = true;

        for (int n = 2; n < numero; n++) {
            if (numero % n == 0) {
                ePrimo = false;
            }
        }
        return ePrimo;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("------ MENU de Funções Raissa e Jessica ------\n");
        // MENU
        System.out.printf("\t 1 -Números Pares\n");
        System.out.printf("\t 2 -Números Ímpares\n");
        System.out.printf("\t 3 -Números Primos\n");
        System.out.printf("\t 4 -Cálculo de Juros Compostos\n");
        System.out.printf("\t 0 -Sair\n");
        System.out.println("Escolha uma Opção: \n");

        int op = sc.nextInt();
        int numero = 0;
        boolean validaNumero = true;
        switch (op) {
            case 1:
                // --------- NÚMEROS PARES --------- //
                do {
                    System.out.print("Digite um número: ");
                    numero = sc.nextInt();

                    if (numero < 0 || numero > 200) {
                        System.out.println("O número não pode ser negativo e nem maior que 200, tente novamente!");
                        validaNumero = false;
                    } else {
                        validaNumero = true;

                        for (int n = 0; n <= numero; n++) {
                            if (n % 2 == 0) {
                                System.out.printf("%d ", n);
                            }
                        }
                    }
                } while (validaNumero == false);

                break;

            case 2:

                // --------- NÚMEROS ÍMPARES --------- //
                do {
                    System.out.print("Digite um número: ");
                    numero = sc.nextInt();

                    if (numero > 200) {
                        System.out.println("O número não pode ser maior que 200, tente novamente!");
                        validaNumero = false;
                    } else {
                        validaNumero = true;

                        for (int n = 0; n <= numero; n++) {
                            if (n % 2 != 0) {
                                System.out.printf("%d ", n);
                            }
                        }
                    }
                } while (validaNumero == false);
                break;

            case 3:

                // --------- NÚMEROS PRIMOS --------- //
                System.out.print("Digite um número: ");
                numero = sc.nextInt();

                for (int n = 2; n <= numero; n++) {
                    if (Primo(n)) {
                        System.out.printf("%d ", n);
                    }
                }
                break;

            case 4:

                // --------- CÁLCULO DE JUROS COMPOSTOS --------- //

                System.out.print("Digite o valor do investimento: ");
                double valorInvestimento = sc.nextDouble();
                System.out.print("Digite o prazo em dias do investimento: ");
                int prazoInvestimento = sc.nextInt();
                System.out.print("Digite a taxa de juros do investimento: ");
                int taxaJuros = sc.nextInt();

                System.out.printf("\nValor inicial: R$%.2f\n", valorInvestimento);
                System.out.printf("Taxa de juros: %d%%\n\n", taxaJuros);

                double retorno = 0.0;

                for (int n = 0; n < prazoInvestimento; n++) {
                    retorno += (valorInvestimento * taxaJuros/100);
                    System.out.printf("Retorno %dº mês: R$%.2f\n", n + 1, retorno);
                }
                System.out.printf("\nMontante final: R$%.2f", (valorInvestimento + retorno));
                break;

            case 0:

                // --------- SAIR --------- //
                System.out.printf("Sair");
                sc.nextLine();
                break;
        }
    }
}

