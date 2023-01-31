import java.sql.Array;

public class GerenciadorMatricula {
    private Matricula matriculas[] = new Matricula[10];
    private Integer codigoSeq = 0;


    public void cadastrar(Matricula matricula) {
        int codigo = gerarCodigoSequencialMatricula();
        matricula.setCodigo(codigo);
        matriculas[codigo] = matricula;
    }

    private Integer gerarCodigoSequencialMatricula() {
            return codigoSeq++;
    }

    public Matricula[] buscarMatriculas(Aluno aluno) {
        int count = 0;
        Matricula[] matriculaFiltradasAlunos = new Matricula[10];
        for (int i = 0; i < this.codigoSeq - 1; i++) {
                if(matriculas[i].getAluno().equals(aluno)) {
                    matriculaFiltradasAlunos[count] = matriculas[i];
                    count++;
                }
        }
        return matriculaFiltradasAlunos;
    }

    public Matricula[] buscarMatriculas(Curso curso) {
        int count = 0;
        Matricula[] matriculaFiltradasCursos = new Matricula[10];
        for (int i = 0; i < this.codigoSeq -1; i++) {
                if (matriculas[i].getCurso().equals(curso)) {
                    matriculaFiltradasCursos[count] = matriculas[i];
                    count++;
                }
            }
        return matriculaFiltradasCursos;
    }

    public void imprimirMatriculas() {
        for (Matricula mat : matriculas) {
            if(mat != null) {
                System.out.println(mat + "\n");
            }
        }
    }

    public void imprimirMatriculas(Matricula[] matriculasFilter) {
        for (Matricula mat : matriculasFilter) {
            if(mat != null) {
                System.out.println(mat + "\n");
            }
        }
    }

    public Matricula[] getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

    public Integer getCodigoSeq() {
        return codigoSeq;
    }

    public void setCodigoSeq(Integer codigoSeq) {
        this.codigoSeq = codigoSeq;
    }
}
