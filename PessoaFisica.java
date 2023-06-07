package ProjetoFinalJAVA;

public class PessoaFisica extends Pessoas {
    String nome;
    int numeroDaConta;
    double saldo;
    String cpf;

    public PessoaFisica(String nome, int numeroDaConta, String cpf) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.cpf = cpf;
    }

    
}
