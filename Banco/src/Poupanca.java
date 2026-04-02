public class Poupanca extends Conta {

    Poupanca(String n, Pessoa t, Data d, Gerente g) {
        super(n, t, d, g);
    }

    void extrato() {
        System.out.println("\n*** EXTRATO DE POUPANCA ***");
        super.extrato();
    }

    void rendimentos(double juro) {
        this.saldo += (juro * this.saldo) / 100;
    }
}