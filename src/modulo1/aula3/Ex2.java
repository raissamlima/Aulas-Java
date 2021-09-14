package modulo1.aula3;

import java.sql.SQLOutput;
import java.util.Scanner;

class a1_console {
    public a1_console() {
    }

    public static void main(String[] args) {
        System.out.println("Olá");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Parabéns, seu cadastro foi realizado com sucesso");
        }else{
            System.out.println("Lamentamos, não podemos fazer seu cadastro, visto que, você é menor de idade");
        }
    }
}