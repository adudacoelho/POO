public class Conta {
    String numero;
    Pessoa titular;
    double saldo, limite;

    double disponivel (){
        return this.saldo + this.limite;
    }

    void extrato(){
        System.out.println("\nEXTRATO DA CONTA \n");
        System.out.println("Número:" + this.numero);
        System.out.println("Nome:" + this.titular.nome);
        System.out.println("Disponível: R$" + this.disponivel()+ "\n");
    }

    void depositar(double v){
        this.saldo += v;
        System.out.println("Deposito realizado com sucesso!" + "\n");
    }

    boolean sacar(double v){
        if (this.disponivel() >= v){
            this.saldo -= v;
            System.out.println("Saque realizado com sucesso, na conta: " + this.numero + "no valor de " + v + "\n");
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
            System.out.println("Transferencia de " + v + " da conta " + this.numero + " para a conta " + dest.numero + " foi realizado com sucesso." + "\n");
            return true;
        }
        else {
            System.out.println("ERRO: Não foi possível transferir " + v + " da conta " + this.numero + " para a conta " + dest.numero + ".  Valor disponível: " + this.disponivel() + "\n");
            return false;

        }
    }


}

