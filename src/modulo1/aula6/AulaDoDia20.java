package modulo1.aula6;

import java.util.Scanner;

class ExemploWhile {
        //----------------- EXEMPLO WHILE -----------------//

        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        while (contador <11){
        System.out.println("Repetição nr: " + contador);
        contador++;
        }
    }
}
        //----------------- EXEMPLO FOR -----------------//
        //public static void main (String[] args) {
            //for(int cont = 1; cont < 11; cont++){
                //Scanner sc = new Scanner(System.in);
                //System.out.println("Digite o nome: ");
                //String nome = sc.nextLine();
                //System.out.println("Digite o sobrenome: ");
                //String sobrenome = sc.nextLine();
                //System.out.printf("%s %s você foi cadastrado(a). Cadastre mais um amigo(a). \n", nome, sobrenome);
            //}
            //System.out.printf("Parabéns, seu cadastro foi realizado com sucesso.");
        //}
//}

