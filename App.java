package ProjetoFinalJAVA;

import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class App {
    public static void main(String[] args) {

        ArrayList<String> contas = new ArrayList<>();

        CriarConta criarConta = new CriarConta();
        
        Scanner sc = new Scanner(System.in);

        boolean agencia = true;

        int cont = 0;

        while(agencia) {

           System.out.println("Bem - Vindo !!!");
           System.out.println(" O que você deseja fazer "
           +"\n0 : Sair"
           +"\n1 : Criar uma nova conta"
           +"\n2 : Acessar uma conta existente");
            int escolha = sc.nextInt();

            if ( escolha == 1 ) {
                System.out.println("Você escolheu criar uma conta ");

                System.out.println("Agora , escolha o tipo de conta que deseja criar: "
                +"\n1: Pessoa Jurídica"
                +"\n2: Pessoa Física");

                int tipoDeConta = sc.nextInt();

                if ( tipoDeConta == 1 ) {
                    criarConta.CriarContaJuridica();
                } else if ( tipoDeConta == 2) {
                    criarConta.CriarContaFisica();
                } else {
                    System.out.println("Você digitou um número inválido , tente novamente!");
                }


            } else if ( escolha == 2) {
               System.out.println("Você escolheu acessar uma conta existente ");

               
            } else if (escolha == 0){
                agencia = false;
            } else {
                System.out.println("Digite um número válido!");
            }


         cont++;
        }
    }
}
