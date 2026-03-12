//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Criando um objeto da classe Pessoa
    Pessoa p1 = new Pessoa ();
    p1.nome = " Maria ";
    p1.idade = 18;
    p1.sexo = 'F';
    p1.cpf = "123.456.789-00";

    //Criando outro objeto da classe Pessoa
    Pessoa p2 = new Pessoa();
    p2.nome = " João ";
    p2.idade = 22;
    p2.sexo = 'M';
    p2.cpf = "234.567.890-00";

    //Criando um objeto da classe Conta
    Conta c1 = new Conta();
    c1.numero = " 1234-5 ";
    c1.titular = p1;
    c1.saldo = 100.0;
    c1.limite = 200.0;

    //Criando outro objeto da classe Conta
    Conta c2 = new Conta();
    c2.numero = " 2345-6 ";
    c2.titular = p2;
    c2.saldo = 150.0;
    c2.limite = 200.0;

    c1.extrato();
    c2.extrato();

    c1.sacar(150);
    c1.transf(100, c2);
    c1.sacar(100);
    c1.depositar(100);
    c1.transf(200, c2);

    //Executando o metodo que imprime o extrato
    System.out.println("\nEXTRATO DA CONTA \n");

    System.out.println("Conta: " + c1.numero);
    System.out.println("Titular: " + c1.titular.cpf);
    System.out.println("Saldo da conta p/ saque: " + c1.saldo);

    System.out.println("\nEXTRATO DA CONTA\n ");

    System.out.println("Conta: " + c2.numero);
    System.out.println("Titular: " + c2.titular.cpf);
    System.out.println("Saldo da conta p/ saque: " + c2.saldo);

    }
}
