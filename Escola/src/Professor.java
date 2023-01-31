import java.util.Objects;

public class Professor extends Funcionario{
    private Disciplina disciplina;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return disciplina.equals(professor.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), disciplina);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina=" + disciplina +
                '}';
    }

    public Professor(String cpf, String rg, Integer codigo, String nome, Cidade cidade, String cargo, Double salario, Disciplina disciplina) {
        super(cpf, rg, codigo, nome, cidade, cargo, salario);
        this.disciplina = disciplina;
    }

    public Professor() {}
}
