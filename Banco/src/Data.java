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

    boolean maior(Data data){
        if(this.ano > data.ano) return true;
        if(this.ano < data.ano) return false;
        if(this.mes > data.mes) return true;
        if(this.mes < data.mes) return false;
        return this.dia > data.dia;
    }
}
