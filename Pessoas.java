package ProjetoFinalJAVA;

public class Pessoas {
    // superclasse
    // atributos
    String nome;
    int numeroDaConta;
    double saldo;
    String cpf;
    String cnpj;
    // métodos

    // construtor

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // métodos diversos


    public double VerificarSaldo() {

        return saldo;
    }

    public double Saque(double valorSacado) {
        saldo -= valorSacado;

        return saldo;
    }

    public double Deposito(double valorDepositado) {
        saldo += valorDepositado;

        return saldo;
    }

    public double Emprestimo(double valorEmprestimo) {
        if ( valorEmprestimo > 0 && valorEmprestimo < 20000) {
        System.out.println("Digite um valor válido ao banco");
        } else {
            saldo += valorEmprestimo;
        }

      return saldo;
    }
}
