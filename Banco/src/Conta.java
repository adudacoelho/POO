public class Conta {
    String numero;
    Pessoa titular;
    Gerente ger;
    double saldo;
    Data criacao;

    // Construtor com parâmetros
    Conta(String n, Pessoa t, Data d, Gerente g) {
        this.numero = n;
        this.titular = t;
        this.criacao = d;
        this.ger = g;
        this.saldo = 0;
    }

    // Construtor com entrada de dados
    Conta(Gerente g) {
        this.ger = g;
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("Número da conta: ");
        this.numero = s.nextLine();

        System.out.println("Dados do titular:");
        this.titular = new Pessoa();

        this.criacao = new Data();
        this.saldo = 0;
    }

    double disponivel() {
        return this.saldo;
    }

    void extrato() {
        System.out.println("Titular: " + this.titular.nome + " (CPF: " + this.titular.cpf + ")");
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo disponível para saque: R$ " + this.disponivel());
    }
    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (this.disponivel() >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}