public interface GerenciadorRegistro<T extends ItemLista> {

    public void salvar(T obj);

    public void excluir(T obj);

    public T pesquisar(T obj);

    public void imprimirTodos();
}
