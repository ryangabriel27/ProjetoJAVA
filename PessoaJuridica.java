package ProjetoFinalJAVA;

public class PessoaJuridica extends Pessoas{
    String nome;
    int numeroDaConta;
    double saldo;
    String cnpj;

    public PessoaJuridica(String nome, int numeroDaConta, String cnpj) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.cnpj = cnpj;
    }

    
}
