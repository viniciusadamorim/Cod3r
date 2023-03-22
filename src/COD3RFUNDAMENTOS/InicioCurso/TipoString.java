package COD3RFUNDAMENTOS.InicioCurso;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(3));

        String s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s.length());

        var nome = "Vinicius";
        var sobrenome = "Amorim";
        var idade = 33;
        var salario = 10000.00;

        // Esse é um exemplo de código grande que deve ser evitado
        System.out.println("Nome: " + nome +"\nSobrenome " + sobrenome + "\nIdade " + idade + "\nSalario: " + salario + "\n\n");

        // Vamos diminuir mais ainda usando PrintF
        // s = string    d = inteiro  e f = double
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

        // Outra possibilidade usando o format
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);

    }

}
//.charAt = Vai identificar qual letra esta na posição indicada.
//.concat = concatenar com algo
//.startsWith = se ela inicia ou nao com o valor indexidado
//s.lenght(); = tamanho da string
//.s endsWith();
//s.equals();
//s.equalsIgnoreCase() = vai ignorar maiusculos e minusculas
// String.format(); cria uma string que coloca os simbolos especiais dentro da string
//.contains(); = dentro de alguma frase tem tal coisa especificada
//.indexOf(); qual a posição da string
//.substring(x,y); = quero que comece a partir de tal caractere x inicio entra y final nao entra na substring