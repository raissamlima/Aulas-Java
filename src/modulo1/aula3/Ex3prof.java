package modulo1.aula3;

import java.util.Scanner;

class a4_3_SwitchCaseExemplo {

    public static void main(String[] args) {
        System.out.printf("RaissaFLIX da Proway: Filmes, séries e documentários\n");
        Scanner sc = new Scanner(System.in);

        System.out.printf("RaissaFLIX");
        System.out.printf("\t 1 -Cadastrar Filmes");
        System.out.printf("\t 2 -Cadastrar Séries");
        System.out.printf("\t 3 -Cadastrar Documentário");
        System.out.printf("\t 0 -Sair");
        System.out.printf("\t\nEscolha um opção do menu:");

        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.printf("Digite o nome do filme: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.println("Digite a descrição do filme: ");
                sc.nextLine();

                System.out.printf("Digite o gênero do filme: ");
                String genero = sc.nextLine();

                System.out.printf("Digite o ano de lançamento: ");
                int lançamento = sc.nextInt();

                System.out.printf("Digite o tema do filme: ");
                sc.nextLine();
                String tema = sc.nextLine();
                break;

            case 2:
                System.out.printf("Digite o nome da série: ");
                sc.nextLine();
                String nomeSérie = sc.nextLine();

                System.out.printf("Digite o ano de lançamento: ");
                int ano = sc.nextInt();

                System.out.printf("Digite a produtora da série: ");
                sc.nextLine();
                String produtora = sc.nextLine();
                break;

            case 3:
                System.out.printf("Digite o nome do documentário: ");
                sc.nextLine();
                String nomeDocumentario = sc.nextLine();

                System.out.printf("Digite o ano de lançamento: ");
                int anoLançamento = sc.nextInt();

                System.out.printf("Digite o tema do documentário: ");
                sc.nextLine();
                String temaDocumentario = sc.nextLine();
                break;

            case 0:
                System.out.printf("Saindo ...");
                break;

            default:
                System.out.printf("Opcao invalida");
                break;
        }

    }
}
