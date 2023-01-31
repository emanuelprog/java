import Progama1.Calculadora;
import Progama2.Aluno;
import Progama2.Curso;
import Progama2.Matricula;
import Programa3.Funcionario;
import Programa3.Programador;

import java.util.Date;

public class ProgramaPrincipalConstrutor3 {
    public static void main(String[] args) {
        double salarioFuncionario = new Funcionario("Pedro", 1200.0).getSalario();
        double salarioProgramador = new Programador("João", 1000.0).getSalario();

        double diferença = Calculadora.subtrair(salarioFuncionario, salarioProgramador);
        System.out.println(diferença);


        double salarioCalculado = new Funcionario("Zé", 1000.0).calcularSalario();
        System.out.println(salarioCalculado);

        double valor = new Matricula(new Aluno("Jorge"), new Curso("Ciencias", 2000d), "01/12/2022").calcularDesconto();
        System.out.println(valor);
    }
}
