import java.util.Scanner;

public class Pessoa {
        String nome, cpf;
        Data nasc;
        char sexo;

        Pessoa() {
                Scanner s = new Scanner(System.in);

                s.nextLine();

                System.out.print("Nome: ");
                this.nome = s.nextLine();

                System.out.print("CPF: ");
                this.cpf = s.nextLine();

                this.nasc = new Data();

                System.out.print("Sexo: ");
                this.sexo = s.nextLine().charAt(0);
        }

        Pessoa(String n, Data d, char s, String c) {
                this.nome = n;
                this.nasc = d;
                this.sexo = s;
                this.cpf = c;
        }

        int idade(Data hoje) {
                int idade = hoje.ano - this.nasc.ano;

                if (hoje.mes < this.nasc.mes ||
                        (hoje.mes == this.nasc.mes && hoje.dia < this.nasc.dia)) {
                        idade--;
                }

                return idade;
        }
}