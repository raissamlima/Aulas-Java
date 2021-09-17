package modulo1.aula6;

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.printf("Cálculo de aumento de salário\n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t 1 -Serviços Gerais\n");
        System.out.printf("\t 2 -Vigia\n");
        System.out.printf("\t 3 -Recepcionista\n");
        System.out.printf("\t 0 -Sair\n");
        System.out.printf("Escolha uma opção: \n");

        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                boolean invalido = true;
                do {
                    System.out.println("Digite o seu salário: ");
                    float salario = sc.nextFloat();
                    salario *= 1.5;
                    System.out.printf("\t\n Seu salário teve um aumento de 50 porcento e passou a ser: %s reais!\n", salario);
                    if (salario <= 0) {
                        System.out.println("O salário não pode ser menor ou igual a ZERO");
                        System.out.println("Digite novamente o salário");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                break;

            case 2:
                invalido = true;
                do {
                    System.out.println("Digite o seu salário: ");
                    float salarioVigia = sc.nextFloat();
                    salarioVigia *= 1.3;
                    System.out.printf("\t\n Seu salário teve um aumento de 30 porcento e passou a ser: %s!\n", salarioVigia);
                    if (salarioVigia <= 0) {
                        System.out.println("O salário não pode ser menor ou igual a ZERO");
                        System.out.println("Digite novamente o salário");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                break;

            case 3:
                invalido = true;
                do {
                    System.out.println("Digite o seu salário: ");
                    float salarioVigia = sc.nextFloat();
                    salarioVigia *= 1.0;
                    System.out.printf("\t\n Seu salário teve um aumento de 10 porcento e passou a ser: %s!\n", salarioVigia);
                    if (salarioVigia <= 0) {
                        System.out.println("O salário não pode ser menor ou igual a ZERO");
                        System.out.println("Digite novamente o salário");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                break;

            case 0:
                System.out.printf("Sair");
                sc.nextLine();
                break;
        }
    }
}