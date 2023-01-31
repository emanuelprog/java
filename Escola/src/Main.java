import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Cidade cidadePrincipal = new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS"));
        Cidade cidadeIgual = new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS"));
        Cidade cidadeDiferente = new Cidade("Governador Valadares", new Estado("Minas Gerais", "MG"));
        Cidade cidadeReferencia = cidadePrincipal;

        //COMPARANDO CIDADES COM O MESMO VALOR
//        System.out.println(cidadePrincipal.equals(cidadeIgual));
//        System.out.println(cidadePrincipal == cidadeIgual);
//        System.out.println(cidadePrincipal.hashCode());
//        System.out.println(cidadeIgual.hashCode());
//        System.out.println(cidadeDiferente.hashCode());

        GerenciadorMatricula gerenciador = new GerenciadorMatricula();

        Aluno aluno1 = new Aluno("123123", "12312", 28, "Joao", cidadePrincipal);
        Curso curso1 = new Curso("Ciencias", 23);

        Aluno aluno2 = new Aluno("33333", "33333", 22, "Pedro", cidadeDiferente);
        Curso curso2 = new Curso("Artes", 23);

        Aluno aluno3 = new Aluno("44444", "44444", 28, "Arthur", cidadePrincipal);
        Curso curso3 = new Curso("Portugues", 23);

        Matricula matricula = new Matricula(new Date(), curso1, aluno1);
        Matricula matricula2 = new Matricula(new Date(), curso2, aluno2);
        Matricula matricula3 = new Matricula(new Date(), curso2, aluno1);
        Matricula matricula4 = new Matricula(new Date(), curso3, aluno3);

        gerenciador.cadastrar(matricula);
        gerenciador.cadastrar(matricula2);
        gerenciador.cadastrar(matricula3);
        gerenciador.cadastrar(matricula4);

        System.out.println("Matriculas Geral:");
        gerenciador.imprimirMatriculas();
        System.out.println("Matriculas João");
        gerenciador.imprimirMatriculas(gerenciador.buscarMatriculas(aluno1));
        System.out.println("Matriculas Artes");
        gerenciador.imprimirMatriculas(gerenciador.buscarMatriculas(curso2));
    }
}