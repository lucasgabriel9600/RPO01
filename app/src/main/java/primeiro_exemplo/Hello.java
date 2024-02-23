package primeiro_exemplo;
import modelos.Pessoa;
import modelos.PessoaFisica;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");
        PessoaFisica p1 = new PessoaFisica();
        p1.setIdade(18);


        System.out.println(p1.getIdade());
    }
}