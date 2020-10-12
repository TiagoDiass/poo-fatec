package Tiago.exercicio3;

public class PortaClasse {
    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.setDimensaoX(4);

        porta.setCor("Azul");

        porta.setDimensaoY(2);

        porta.setDimensaoZ(0.6);

        porta.setAberta(true);

        System.out.println(porta.isAberta());
        System.out.println(porta.toString());
    }
}
