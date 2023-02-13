import java.util.HashMap;
import java.util.Map;

public class Gerenciador<String, Cliente> implements GerenciadorGenerico<String, Cliente>
{

    private HashMap lista = new HashMap<String, Cliente>();

    private Integer id = 0;
    @Override
    public Map<String, Cliente> getLista() {
        return this.lista;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void imprimir() {
        for (Object cliente : this.lista.values()) {
            System.out.println(cliente);
        }
    }

    @Override
    public Cliente adicionar(String chave, Cliente valor) {
        return (Cliente) this.lista.put(chave, valor);
    }

    @Override
    public Cliente editar(String chave, Cliente valor) {
        if (this.lista.containsKey(chave)) {
            return (Cliente) this.lista.put(chave, valor);
        }
        return null;
    }

    @Override
    public Cliente excluir(String chave) {
        return (Cliente) this.lista.remove(chave);
    }
}
