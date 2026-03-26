public class ContaCorrente extends Conta{
    double limite;

    ContaCorrente(String numero, Pessoa titular, Gerente ger, int dia, int mes, int ano, Double limite){
        super(numero, titular, ger, dia, mes, ano);
        this.limite = limite;
    }
}
