package modulo1.aula6;

import java.util.Scanner;

public class ManueRaissa {
    public static void main(String[] args) {
        System.out.printf("Cadastro das devs Manu e Raissa\n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t 1 -Cadastrar Dev\n");
        System.out.printf("\t 2 -Cadastrar linguagem\n");
        System.out.printf("\t 0 -Sair\n");
        System.out.println("Escolha uma Opção: \n");

        int op = sc.nextInt();
        switch (op) {
            case 1:
                boolean invalido = true;
                do {
                    System.out.println("Digite seu nome: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o nome");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                String sobrenome;
                do {
                    System.out.println("Digite seu sobrenome: ");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o sobrenome");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;
                System.out.println("Digite sua senioridade: ");
                String senioridade = sc.nextLine();
                invalido = true;
                do {
                    System.out.println("Digite sua idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    if (idade <= 0) {
                        System.out.println("A idade tem que ser maior que ZERO");
                        System.out.println("Digite a idade novamente");
                    }else{
                        invalido = false;
                    }
                }while (invalido);
                System.out.println("Cadastro realizado com sucesso");
                break;

            case 2:
                String nomelinguagem = sc.nextLine();
                System.out.println("Selecione uma das aplicações ");
                System.out.println("\t 1- Frontend");
                System.out.println("\t 2- Backend");
                System.out.println("\t 3- Mobile");
                System.out.print("\tEscolha uma Opção: ");
                int ab = Integer.parseInt(sc.nextLine());
                while (ab<0 || ab>3){
                    System.out.print("\tOpção invalida digite novamente : ");
                    ab = Integer.parseInt(sc.nextLine());
                }
                System.out.printf("\t\n Linguegem %s cadastrada com sucesso", nomelinguagem);
                break;

            case 0:
                System.out.printf("Sair");
                sc.nextLine();
                break;
        }
    }
}

