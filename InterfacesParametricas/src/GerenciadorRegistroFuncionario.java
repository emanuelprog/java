public class GerenciadorRegistroFuncionario implements GerenciadorRegistro<Funcionario>{

    public Funcionario funcionarios[] = new Funcionario[10];
    public Integer posicao = 0;

    @Override
    public void salvar(Funcionario obj) {
        if (posicao < 10) {
            funcionarios[posicao++] = obj;
        }
    }

    @Override
    public void excluir(Funcionario obj) {

    }

    @Override
    public int pesquisar(Funcionario obj) {
        for (int i = 0; i < posicao; i++) {
            if(funcionarios[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void imprimirTodos() {
        for (int i = 0; i < posicao; i++) {
            System.out.println(funcionarios[i]);
        }
    }
}
