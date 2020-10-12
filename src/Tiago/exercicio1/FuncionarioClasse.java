package Tiago.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncionarioClasse {

    public static void main(String[] args) {

      Funcionario funcionario = new Funcionario();
        //Instânciando scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ID do funcionário: ");
        funcionario.setIdFuncionario(Integer.parseInt(sc.nextLine()));

        System.out.println("Insira o nome do funcionário: ");
        funcionario.setNomeFuncionario(sc.nextLine());

        System.out.println("Insira o salario do funcionário: ");
        funcionario.setSalario(Integer.parseInt(sc.nextLine()));

        System.out.println("Insira a data de contratacao: ");
        String hoje = (sc.nextLine());

        DateTimeFormatter formatador =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(hoje, formatador);
        funcionario.setDataContratacao(localDate);

        System.out.println("digite o departamento: ");
        funcionario.setDepartamento(sc.nextLine());
        
        System.out.println("digite o documento: ");
        funcionario.setDocumento(sc.nextLine());

        funcionario.atualizarSalario(-51);

        funcionario.atualizarSalario(500);

        funcionario.imprimir();

        funcionario.demiteFuncionario();

        funcionario.imprimir();
      }
}
