import Progama2.Aluno;
import Progama2.Curso;
import Progama2.Matricula;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramaPrincipalConstrutor2 {
    public static void main(String[] args) {

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String data = formater.format(new Date());
        Matricula matricula = new Matricula(new Aluno("Pedro"), new Curso("Programação", 1000d), data);
        System.out.println(matricula);


    }
}
