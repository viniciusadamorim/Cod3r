package ClassesEObjetos;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //Atribuicao por valor (primitivos)

        Data d1 = new Data(1,6,2022);
        Data d2 = d1;  // Atribuicao por referencia (objetos)

        d1.dia = 31;
        d1.mes = 12;

        //Se voce passa um objeto para um metodo voce ta passando uma referencia (nao é copia) e se mexer no dado
        // dos objetos, vai mudar
    }
}
