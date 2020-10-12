package Tiago.exercicio2;

public class PessoaClasse {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Tiago da Costa Dias");
        pessoa1.setIdade(18);

        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();

        System.out.println(pessoa1.toString());


    }
}
