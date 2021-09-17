package modulo1.aula1;

import java.util.Scanner;

public class a1_console {
    public static void main(String args[]){
        System.out.println("Olá");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e sobrenome digitado foi: "+nome +" "+ sobrenome);

        //System.out.print("Digite a sua idade: ");
        //int idade = scanner.int();

        // println o ln serve para uma quebra de linha
        // print serve também para "printar" porém não quebra a linha
        // mais que um caracter "aspas duplas" 'apenas para um caracter' '5'
        // string aceita nome e números
        // clica na linha + ctrl shift para baixo/cima (mover o código)
    }
}