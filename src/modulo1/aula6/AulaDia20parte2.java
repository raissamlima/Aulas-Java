package modulo1.aula6;

import java.util.Scanner;

                    // ----------- CADASTRANDO NÚMERO DE 1 A 100 ----------- //

public class AulaDia20parte2 {
    //public static void main (String[] args) {
        //System.out.println("-------CADASTRANDO NÚMEROS DE 1 A 100 NO MÉTODO FOR-------");
        //for (int cont = 1; cont < 101; cont++) {
            //Scanner sc = new Scanner(System.in);
            //System.out.printf("\n" + cont);
        //}
        //System.out.printf("\nParabéns, seu cadastro de números de 1 a 100 foi realizado com sucesso.");
    //}
//}


                    //-------- CADASTRANDO APENAS NÚMEROS PRIMOS --------//

        //public static void main(String args []){
            //int end = 150;
            //for(int i = 2; i < end; i++){
                //boolean primo = true;
                //for( int p = 2; p < i; p++ ){
                    //if(i % p == 0){
                        //primo = false;
                    //}
                //}
            //if(primo){
                //System.out.println( i + " é primo" );
            //}
        //}
    //}
//}

                    //----------- RETORNO DE INVESTIMENTO -----------//

    public static void main(String args []){
        double investimento = 5000.00;
        double novoInvestimento = investimento;
        for (int mes = 1; mes < 25; mes++){
            novoInvestimento = (novoInvestimento * 0.02) + novoInvestimento;
            System.out.printf("Mes %d : %.2f \n", mes, novoInvestimento);
        }
    }
}

