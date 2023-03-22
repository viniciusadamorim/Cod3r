package ClassesEObjetos;

public class DataTeste {
    public static void main(String[] args) {

        Data calendario1 = new Data();
        calendario1.dia = 30;
        calendario1.mes = 9;
        calendario1.ano = 1999;

        System.out.printf("%d/%d/%d \n", calendario1.dia, calendario1.mes, calendario1.ano);

        ///////////////////////////////////////////////////

        Data calendari2 = new Data(1,1, 1970);
        System.out.printf("%d/%d/%d \n", calendari2.dia, calendari2.mes, calendari2.ano);
        System.out.println(calendari2.obterDataFormatada());
    }
}
