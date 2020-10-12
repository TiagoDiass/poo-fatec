package Tiago.exercicio1;

import java.time.LocalDate;

public class Funcionario {

    public int idFuncionario;
    public String nomeFuncionario;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;


    public int getIdFuncionario() {

        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {

        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {

        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {

        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamento() {

        return departamento;
    }

    public void setDepartamento(String departamento) {

        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {

        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {

        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public String getDocumento() {

        return documento;
    }

    public void setDocumento(String documento) {

        this.documento = documento;
    }

    public boolean isAtivo() {

        return ativo;
    }

    public void setAtivo(boolean ativo) {

        this.ativo = ativo;
    }

    void atualizarSalario(double valor){
    if (valor > 0){
        salario += valor;
        System.out.println("Valor adicionado");
    }
    else {
        System.out.println("Valor negativo");
    }
    }

    void demiteFuncionario(){

        ativo = false;
    }

    void imprimir(){
        System.out.println("idFuncionario = " + idFuncionario);
        System.out.println("nomeFuncionario = " + nomeFuncionario);
        System.out.println("departamento = " + departamento);
        System.out.println("dataContratacao = " + dataContratacao);
        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);
        System.out.println("ativo = " + ativo);
    }

}
