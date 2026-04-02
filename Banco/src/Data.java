import java.util.Scanner;

public class Data {
    int dia, mes, ano;

    Data() {
        Scanner s = new Scanner(System.in);

        System.out.print("Dia: ");
        this.dia = s.nextInt();

        System.out.print("Mês: ");
        this.mes = s.nextInt();

        System.out.print("Ano: ");
        this.ano = s.nextInt();
    }

    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    void imprimir() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    boolean maior(Data d2) {
        if (this.ano != d2.ano) return this.ano > d2.ano;
        if (this.mes != d2.mes) return this.mes > d2.mes;
        return this.dia > d2.dia;
    }
}