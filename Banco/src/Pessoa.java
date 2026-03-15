public class Pessoa {
        String nome;
        Data dtNasc;
        char sexo;
        String cpf;

        Pessoa(String n, Data dN, char s, String c){
                /* Construtor da classe pessoa */
                System.out.println("Nova pessoa criada no sistema.");
                this.nome = n;
                this.dtNasc = dN;
                this.sexo = s;
                this.cpf = c;
        }
        /* Métodos da classe Pessoa... */

        int retornaIdade(Data hoje){
                int idade = hoje.ano - this.dtNasc.ano;

                        if(hoje.mes < this.dtNasc.mes ||
                                (hoje.mes == this.dtNasc.mes && hoje.dia < this.dtNasc.dia)){
                                idade--;
                        }

                        return idade;
                }


        }
