
package net.tiago.prjapolice;

public class Apolice {
    //Atributos
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    //Construtor
    public Apolice(String nomeSegurado, int idade, float valorPremio){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public String getNome() {
        return nomeSegurado;
    }

    public void setNome(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir() {
        System.out.printf("Nome do Segurado: %s \n Idade do segurado: %s \n Valor do prêmio: %s \n", getNome(), getIdade(), getValorPremio());
    }
}