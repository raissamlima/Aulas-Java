package modulo1.aula3;

import java.util.Scanner;

class Produtos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¨¨¨¨¨¨¨¨Cadastro de PRODUTOS¨¨¨¨¨¨¨¨\n");
        System.out.println("Introdução ao JAVA");
        System.out.println("\tBem-Vindo. Digite as informações das categorias.");
        System.out.print("\tDigite o nome do produto: ");
        String nomeProduto = sc.next();
        System.out.print("\tDigite a descrição do produto: ");
        String descricaoProduto = sc.next();
        System.out.println("\tDigite o valor do produto: ");
        short valorProduto = sc.nextShort();
        System.out.println("\tDigite a categoria do produto: ");
        String categoriaProduto = sc.next();

        System.out.printf("\tO produto %s com a descrição %s, no valor de %d e da categoria %s foi cadastrado com sucesso!\n",nomeProduto, descricaoProduto, valorProduto, categoriaProduto);
    }
}
