public interface Gerenciador<T extends ItemLista> {
    public void salvar(T obj);

    public void excluir(T obj);

    public T pesquisar(T obj);

    public void imprimir();

    public T editar(T obj);

}
