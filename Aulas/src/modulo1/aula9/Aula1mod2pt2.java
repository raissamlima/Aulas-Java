
                    /* ================= EXERCÍCIO 21/09/2021 - DOUBLE =================

        Crie um programa em linguagem Java que atenda aos seguintes requisitos:
        _ Leia dois valores do tipo double, digitados pelo usuário.
                _ Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado.
        _ Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado.
                _ Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado.
        _ Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado.*/


package modulo1.aula9;

       import java.util.Scanner;

       class a9_2_metodos_nome {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    /* ================= RETORNANDO AS EQUAÇÕES =================*/

    // DECLAREI DOUBLE
    double n1, n2;

    // Leia dois valores do tipo double | Declarei como: n1 e n2
    n1 = lendoDouble();
    n2 = lendoDouble();

    // ================= RETORNANDO RESULTADO DA SOMA =================
    impressaoOp(soma(n1, n2));

    // ================= RETORNANDO RESULTADO DA SUBTRAÇÃO =================
    impressaoOp(sub(n1, n2));

    // ================= RETORNANDO RESULTADO DA DIVISÃO =================
    impressaoOp(div(n1, n2));

    // ================= RETORNANDO RESULTADO DA MULTIPLICAÇÃO =================
    impressaoOp(mult(n1, n2));

    // ================= EQUAÇÕES =================

    } //declarando "lendoDouble" e o "Return"
    static double lendoDouble() {
    System.out.println("Digite um número: ");
    double n = sc.nextDouble();
    return n;
    }

    // ================= SOMA PT 1 OPERAÇÕES =================
    static double soma(double n1, double n2) {
        return n1 + n2;
    }
    // ================= SUBTRAÇÃO PT 2 OPERAÇÕES =================
    static double sub(double n1, double n2) {
        return n1 - n2;
    }
    // ================= DIVISÃO PT 3 OPERAÇÕES ==================
    static double div(double n1, double n2) {
        return n1 / n2;
    }
    // ================= MULTIPLICAÇÃO PT 4 OPERAÇÕES ==================
    static double mult(double n1, double n2) {
        return n1 * n2;
    }
    static void impressaoOp(double n){
        System.out.printf("O resultado da equação %.2f \n", n);
    }
}



/*
       package modulo1.aula9;

       import java.util.Scanner;

       class a9_2_metodos_nome {
       chamando o metodo imprimir_nome e passando dois argumentos do tipo string

        imprimir_nome("Maykon", "Granemann");
        String nc = retorna_nome_completo("Maykon", "Granemann");
        double taxa = converte_taxa_juro(2);
        System.out.println(taxa);
    }

    // Metodo imprimir_nome - que recebe dois parametros string e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s \n", nome, sobrenome);
    }

    static String retorna_nome_completo(String nome, String sobrenome){
        String nome_completo = nome + " " + sobrenome;
        return nome_completo;
    }

    static double converte_taxa_juro(int juros_int){
        double juros_double = juros_int;
        double percentual = juros_double/100;
        return percentual;
    }
}*/


                    /* Dia 2021-09-21
// Modulo 2 - Aula 9 - Procedimentos, Funções e Métodos
//SRP - Single-Responsability Principle - Principio da responsabilidade única

package modulo1.aula9;

import java.util.Scanner;

class a9_1_metodos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    static void cabecalho(){
        System.out.println("======= Calculadora =========\n");
    }
    static void imprime_menu(){
        System.out.println("Menu");
        System.out.println("\t1-Soma");
        System.out.println("\t2-Subtração");
        System.out.println("\t3-Divisão");
        System.out.println("\t4-Multiplicação");
        System.out.println("\t0-Sair");

    }
    static void escolha_menu(){
        int op = ler_numero("Digite uma opção do menu:");
        int n1=0, n2=0, r=0;

        if(op > 0){
            n1 = ler_numero("Digite o primeiro numero: ");
            n2 = ler_numero("Digite o segundo numero: ");
        }
        switch (op){
            case 1: // soma
                r = soma(n1, n2);
                break;
            case 2: // subtracao
                r = subtracao(n1, n2);
                break;
            case 3: // divisão
                r = divisao(n1, n2);
                break;
            case 4: // multiplicacao
                r = multiplicacao(n1, n2);
                break;
            case 0: // sair
                return;
        }
        System.out.printf("O resultado da operação é %d :", r);
    }
    static int ler_numero(String mensagem){
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    // ===== operacões
    static int soma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    static int subtracao(int num1, int num2){
        int resultado =  num1 - num2;
        return resultado;
    }
    static int divisao(int num1, int num2){
        int resultado = num1 / num2;
        return  resultado;
    }
    static int multiplicacao(int num1, int num2){
        int resultado = num1 * num2;
        return  resultado;
    }
}*/