package ProjetoFinalJAVA;

import java.util.Random;
import java.util.Scanner;

public class CriarConta extends Pessoas {

    Pessoas conta;

    Random rd = new Random();

    Scanner sc = new Scanner(System.in);
    //atributos

    //método
    public void CriarContaJuridica() {
        System.out.println("Você escolheu criar uma conta Jurídica, então vamos lá");

        System.out.print("Primeiro , Digite o seu nome:");
        nome = sc.next();

        System.out.print("Agora, digite o seu CNPJ: ");
        cnpj = sc.next();

        numeroDaConta = (rd.nextInt(500)+1000);
        System.out.println("O número da sua conta é: "+numeroDaConta);

        conta = new PessoaJuridica(nome, numeroDaConta, cnpj);
    
    }

    public void CriarContaFisica() {
        System.out.println("Você escolheu criar uma conta Jurídica, então vamos lá");

        System.out.print("Primeiro , Digite o seu nome:");
        nome = sc.next();

        System.out.print("Agora, digite o seu CPF: ");
        cpf = sc.next();

        numeroDaConta = (rd.nextInt(500)+2000);
        System.out.println("O número da sua conta é: "+numeroDaConta);

        conta = new PessoaFisica(nome, numeroDaConta, cpf);
    
    }
}
