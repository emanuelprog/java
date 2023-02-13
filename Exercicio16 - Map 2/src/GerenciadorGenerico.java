import java.util.Map;

public interface GerenciadorGenerico<K, V> {

    Map<K, V> getLista();

    Integer getId();

    void setId(Integer id);

    void imprimir();

    V adicionar(K chave, V valor);

    V editar(K chave, V valor);

    V excluir(K chave);
}
