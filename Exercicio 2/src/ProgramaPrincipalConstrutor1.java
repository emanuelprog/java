import Progama1.Calculadora;
import Progama1.Cidade;
import Progama1.Cliente;
import Progama1.Estado;

public class ProgramaPrincipalConstrutor1 {
    public static void main(String[] args) {
        //Sobrecarga do método soma
        System.out.println(Calculadora.soma(1,2));

        System.out.println(Calculadora.soma(2.5, 3.5,4.0));

        //Calculadora multiplica
        double valor = Calculadora.multiplica(Calculadora.soma(1,2), Calculadora.soma(1.5,2.5,1.0));
        System.out.println(valor);

        //Sobrecarga de construtor
        System.out.println(new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));

        //Progama1.Cliente
        Cliente cliente1 = new Cliente("Edson", "708.241.561-37", "79010040 MS",
                new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));

        System.out.println(cliente1);
    }
}