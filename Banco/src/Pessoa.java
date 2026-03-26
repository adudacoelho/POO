public class Pessoa {
        String nome;
        Data dtNasc;
        char sexo;
        String cpf;

        Pessoa(String nome, int dia, int mes, int ano, char sexo, String cpf){
                this.nome = nome;
                this.dtNasc = new Data(dia, mes, ano);
                this.sexo = sexo;
                this.cpf = cpf;
        }
        /* Métodos da classe Pessoa... */

        int idade(Data dataAtual){
                int x = dataAtual.ano - this.dtNasc.ano;

                if(dataAtual.mes < this.dtNasc.mes) return x - 1;
                if(dataAtual.mes > this.dtNasc.mes) return x;

                if(dataAtual.dia < this.dtNasc.dia) return x - 1;
                return x;
        }

        int retornaIdade(Data hoje){
                int idade = hoje.ano - this.dtNasc.ano;

                        if(hoje.mes < this.dtNasc.mes ||
                                (hoje.mes == this.dtNasc.mes && hoje.dia < this.dtNasc.dia)){
                                idade--;
                        }

                        return idade;
                }


        }
