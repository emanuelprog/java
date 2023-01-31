public interface GerenciadorRegistro<T> {

    public void salvar(T obj);

    public void excluir(T obj);

    public int pesquisar(T obj);

    public void imprimirTodos();
}
