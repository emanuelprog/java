import java.util.ArrayList;
import java.util.List;

public class GerenciadorRegistroCliente extends GerenciadorRegistroGenerico<Cliente>{

    public List<Cliente> getListaHomens() {
        ArrayList listHomens = new ArrayList<>();
        for (Cliente cliente : getLista()) {
            if (cliente.getSexo().equals("Masculino")) {
                listHomens.add(cliente);
            }
        }
        return listHomens;
    }

    public List<Cliente> getListaMulheres() {
        ArrayList listMulheres = new ArrayList<>();
        for (Cliente cliente : getLista()) {
            if (cliente.equals("Feminino")) {
                listMulheres.add(cliente);
            }
        }
        return listMulheres;
    }

    public List<Cliente> getLista(Cidade cidade) {
        ArrayList listCidades = new ArrayList<>();
        for (Cliente cliente : getLista()) {
            if (cliente.getCidade().equals(cidade)) {
                listCidades.add(cliente);
            }
        }
        return listCidades;
    }
}
