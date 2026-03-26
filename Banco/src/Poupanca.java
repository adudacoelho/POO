public class Poupanca extends Conta{
    Poupanca(String numero, Pessoa titular, Gerente ger, int dia, int mes, int ano){
        super(numero, titular, ger, dia, mes, ano);
    }

    void rendimentos(double juro){
        this.saldo += (this.saldo * juro / 100);
    }
}
