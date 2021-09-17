package modulo1.aula6;

import java.util.Scanner;

class a6_1_while {
    public static void main(String[] args) {
        System.out.printf("Cadastro das devs Manu e Raissa\n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t 1 -Cadastrar Dev");
        System.out.printf("\t 2 -Cadastrar linguagem");
        System.out.printf("\t 0 -Sair\n");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.printf("Digite seu nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                boolean invalido = true;
                String cpf;
                do {
                    System.out.println("Digite seu sobrenome: ");
                    cpf = sc.nextLine();
                    if (cpf.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o sobrenome");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;

                System.out.println("Digite sua senioridade: ");
                String senioridade = sc.nextLine();
                sc.nextLine();


                do {
                    System.out.println("Digite sua idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    if (idade <= 0) {
                        System.out.println("A idade tem que ser maior que ZERO");
                        System.out.println("Digite a idade novamente");
                    }
                }while (invalido);
                break;

            case 0:
                System.out.printf("Sair");
                sc.nextLine();
                break;

            default:
                System.out.println("Cadastro realizado com sucesso");
        }
    }
}