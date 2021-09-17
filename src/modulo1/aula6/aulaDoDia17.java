package modulo1.aula6;

import java.util.Scanner;

class ForCadastroAulaDia17 {
    public static void main (String[] args) {
        for(int cont = 0; cont < 4; cont++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.printf("%s %s você acabou de ser cadastrado(a). Cadastre mais um amigo(a). \n", nome, sobrenome);
        }
        System.out.printf("Parabéns, seu cadastro foi realizado com sucesso.");
    }
}
