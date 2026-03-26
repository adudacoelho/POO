public class Gerente  extends Pessoa {
    String matricula;
    String senha;

    Gerente(String nome, int dia, int mes, int ano, char sexo, String cpf, String matricula, String senha){
        super(nome, dia, mes, ano, sexo, cpf);
        this.matricula = matricula;
        this.senha = senha;
    }

    boolean validarAcesso(String senha) {
        return (this.senha.equals(senha));
    }
}
