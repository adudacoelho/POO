import java.util.Scanner;

public class Gerente extends Pessoa {
    String matricula;
    String senha;

    Gerente() {
        super();
        Scanner s = new Scanner(System.in);

        System.out.print("Matrícula: ");
        this.matricula = s.nextLine();

        this.senha = "123456"; // padrão
    }

    Gerente(String n, Data d, char s, String c, String m, String p) {
        super(n, d, s, c);
        this.matricula = m;
        this.senha = p;
    }

    boolean validarAcesso(String pwd) {
        return pwd.equals(this.senha);
    }

    boolean validarAcesso() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String pwd = s.nextLine();

        return validarAcesso(pwd);
    }
}