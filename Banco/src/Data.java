public class Data {

    int dia, mes, ano;

    Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    void imprimirData() {
        System.out.println("Data de Nascimento: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
}
