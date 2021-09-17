package modulo1.aula5;


import java.util.Scanner;

class a5_1_while {
    public static void main(String[] args) {
        System.out.printf("Estrutura de Repetição WHILE\n");
        Scanner sc = new Scanner(System.in);

        System.out.printf("\t 1 -Cadastrar Clientes");
        System.out.printf("\t 2 -Listar Clientes");
        System.out.printf("\t 0 -Sair\n");

        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.printf("Digite seu nome: ");
                sc.nextLine();
                String nome = sc.nextLine();

                boolean invalido = true;
                do {
                    System.out.println("Digite seu sobrenome: ");
                    String sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o sobrenome");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                do {
                System.out.println("Digite seu RG: ");
                String rg = sc.nextLine();
                if (rg.length() <4) {
                    System.out.println("O RG deve ter 4 caracteres");
                    System.out.println("Digite o RG novamente");
                } else {
                    invalido = false;
                }
                } while (invalido);

                invalido = true;
                do {
                    System.out.println("Digite seu CPF: ");
                    String cpf = sc.nextLine();
                    if (cpf.length() <11) {
                        System.out.println("O CPF deve ter 11 caracteres");
                        System.out.println("Digite o CPF novamente");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                    }
        System.out.println("Cadastro realizado com sucesso");
                }
        }

