package ClassesEObjetos;


public class Data {
   int dia, mes,ano;   // Variavel de instancia usa o THIS para acessar.


    Data(){
        ///dia = 1;
        //mes = 1;
        //ano = 1970;

        this(1,1,1970);  // Pode escrever assim tb
    }

    /*
    Data (int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }
     */
    Data (int dia, int mes, int ano){  //pode colocar os nomes exatamente iguais aos atributos da instancia
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String obterDataFormatada(){
        String formato = "%d/%d/%d"; //Variavel local, se for fora é atributo de instancia só é visualizada aqui dentro.
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    /*
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
     */
}

// this só funciona em métodos nao staticos.(ele é uma instancia da classe)