import java.util.Date;
import java.util.Objects;

public class Matricula {
    private Integer codigo;
    private Date data;
    private Curso curso;
    private Aluno aluno;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matricula)) return false;
        Matricula matricula = (Matricula) o;
        return codigo.equals(matricula.codigo) && data.equals(matricula.data) && curso.equals(matricula.curso) && aluno.equals(matricula.aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, data, curso, aluno);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", curso=" + curso +
                ", aluno=" + aluno +
                '}';
    }

    public Matricula(Date data, Curso curso, Aluno aluno) {
        this.codigo = -1;
        this.data = data;
        this.curso = curso;
        this.aluno = aluno;
    }
}
