public class Main {
    public static void main(String[] args) {

        // Pessoas
        // Pessoas
        Pessoa p1 = new Pessoa("Maria", new Data(10,5,2000), 'F', "123.456.789-00");
        Pessoa p2 = new Pessoa("João", new Data(20,3,1998), 'M', "234.567.890-11");
        Pessoa p3 = new Pessoa("Ana", new Data(1,1,2002), 'F', "345.678.901-22");
        Pessoa p4 = new Pessoa("Carlos", new Data(2,2,1999), 'M', "456.789.012-33");

// Gerentes
        Gerente g1 = new Gerente("Jose", new Data(1,1,1980), 'M', "567.890.123-44", "001", "123");
        Gerente g2 = new Gerente("Paula", new Data(2,2,1985), 'F', "678.901.234-55", "002", "456");

        // Contas Corrente
        ContaCorrente cc1 = new ContaCorrente("1234-5", p1, new Data(1,1,2020), g1);
        ContaCorrente cc2 = new ContaCorrente("2345-6", p2, new Data(2,2,2021), g2);

        // Poupança
        Poupanca cp1 = new Poupanca("3456-7", p3, new Data(3,3,2022), g1);
        Poupanca cp2 = new Poupanca("4567-8", p4, new Data(4,4,2023), g2);

        // Operações
        cc1.depositar(500);
        cc1.sacar(100);
        cc1.transferir(200, cc2);

        cp1.depositar(300);
        cp1.rendimentos(5);

        // Extratos
        cc1.extrato();
        cc2.extrato();
        cp1.extrato();
        cp2.extrato();
    }
}