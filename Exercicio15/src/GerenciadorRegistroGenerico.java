import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorRegistroGenerico<T extends ItemLista> implements GerenciadorRegistro<T> {

    private List<T> lista = new ArrayList<>();
    private Integer id = 0;
    @Override
    public void salvar(T obj) {
        obj.setId(++id);
        lista.add(obj);
    }

    @Override
    public void excluir(T obj) {
        lista.remove(obj);
    }

    @Override
    public T pesquisar(T obj) {
        for (T objeto : lista) {
            if (objeto.equals(obj)) {
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void imprimirTodos() {
        Iterator<T> iterator = this.lista.listIterator();
        while (iterator.hasNext()) {
            T obj = iterator.next();
            System.out.println(obj);
        }
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}