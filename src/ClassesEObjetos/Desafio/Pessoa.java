package ClassesEObjetos.Desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso){  //pode colocar os nomes exatamente iguais aos atributos da instancia
        this.nome = nome;
        this.peso = peso;
    }


    void  comer (Comida comida){
        if(comida != null){
            this.peso = this.peso + comida.pesoComida;
        }
    }

    String apresentacao (){
        return "Olá meu nome é " + nome + " e meu peso é " + peso;
    }

}