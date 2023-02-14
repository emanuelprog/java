import java.util.Map;

public interface GerenciadorGenerico<K, V> {
    V adicionar(K chave, V valor);

    V excluir(K chave);

    void imprimir();

    Map<K, V> getListaAnimais();
}
