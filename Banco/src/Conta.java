public class Conta {
    String numero;
    Pessoa titular;
    double saldo, limite;

    public Conta(String numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.limite = 200.0;
        System.out.println("Nova conta adicionada ao sistema.");
    }

    double disponivel(){
        return this.saldo + this.limite;
    }


    void extrato(){
        System.out.println("\nEXTRATO DA CONTA \n");
        System.out.println("Número:" + this.numero);
        System.out.println("Titular:" + this.titular.cpf);
        System.out.println("Disponível: R$" + this.disponivel() + "\n");
    }


    void depositar(double v){
        this.saldo += v;
        System.out.println("Depósito realizado com sucesso!" + "\n");
    }


    boolean sacar(double v){
        if (this.disponivel() >= v){
            this.saldo -= v;
            System.out.println("Saque realizado com sucesso na conta " + this.numero + "Novo saldo: " + this.saldo + "\n");
            return true;


        }
        else{
            System.out.println("ERRO: Saque na conta " + this.numero + " não foi realizado. Valor disponível: " + this.disponivel() + "\n");
            return false;
        }
    }


    boolean transf (double v, Conta dest){
        if(this.sacar(v)){
            dest.depositar(v);
            System.out.println("Transferência de " + v + " da conta " + this.numero + " para a conta " + dest.numero + " foi realizado com sucesso." + "\n");
            return true;
        }
        else {
            System.out.println("ERRO: Não foi possível transferir " + v + " da conta " + this.numero + " para a conta " + dest.numero + ".  Valor disponível: " + this.disponivel() + "\n");
            return false;


        }
    }


    void chequeEspecial(double juro){
        if (this.saldo < 0){
            this.saldo = this.saldo + (this.saldo * (juro/100));


        }
    }


}


