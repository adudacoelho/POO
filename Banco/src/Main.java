public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa

        Data d1 = new Data(10, 5, 2007);
        Data d2 = new Data(20, 3, 2003);

        d1.imprimirData();
        d2.imprimirData();

        Pessoa p1 = new Pessoa ("Maria", d1, 'F', "123.456.789.00");
        Pessoa p2 = new Pessoa("João", d2, 'M', "234.567.890-00");

        Data hoje = new Data(15, 3, 2026);

        System.out.println("Idade da Maria: " + p1.retornaIdade(hoje));
        System.out.println("Idade de João: " + p2.retornaIdade(hoje));

        Conta c1 = new Conta(" 1234-5 ", p1);
        Conta c2 = new Conta(" 2345-6 ", p2);

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
        System.out.println("Saldo da conta p/ saque: " + c2.saldo + "\n");


        for(int i = 1; i <= 120; i++) {
            c1.chequeEspecial(0.5);

            if(i%30 == 0) {
                System.out.println("Saldo após " + i + " dia(s): " + c1.saldo);
            }
        }


    }
}
