import java.util.Scanner;

public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente(String n, Pessoa t, Data d, Gerente g) {
        super(n, t, d, g);
        this.limite = 200.0;
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("\n*** EXTRATO DE CONTA-CORRENTE ***");
        super.extrato();
    }

    void chequeEspecial(double juro) {
        if (this.saldo < 0) {
            this.saldo += (juro * this.saldo) / 100;
        }
    }

    // Com parâmetro
    void alterarLimite(String pwd, double l) {
        if (this.ger.validarAcesso(pwd)) {
            this.limite = l;
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    // Sobrecarga
    void alterarLimite() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String pwd = s.nextLine();

        System.out.print("Novo limite: ");
        double l = s.nextDouble();

        alterarLimite(pwd, l);
    }
}
