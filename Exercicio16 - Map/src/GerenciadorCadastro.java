import java.util.*;

public class GerenciadorCadastro<Pessoa extends ItemLista> implements Gerenciador<Pessoa> {

    private Map<String, Pessoa> listaPessoas = new HashMap<>();
    private Integer id = 0;
    @Override
    public void salvar(Pessoa obj) {
        obj.setId(++id);
        this.listaPessoas.put(obj.getApelido(), obj);
    }

    @Override
    public void excluir(Pessoa obj) {
        this.listaPessoas.remove(obj.getApelido());
    }

    @Override
    public Pessoa pesquisar(Pessoa obj) {
        return listaPessoas.get(obj.getApelido());
    }

    @Override
    public void imprimir() {
        for (String chave : listaPessoas.keySet()) {
            System.out.println(listaPessoas.get(chave));
        }
    }

    @Override
    public Pessoa editar(Pessoa obj) {
        return listaPessoas.get(obj.getApelido());
    }

    public Pessoa buscaPorApelido(String apelido) {
        if (!listaPessoas.containsKey(apelido)) {
            System.out.println("Não contem esse apelido!");
        } else {
            return listaPessoas.get(apelido);
        }
        return null;
    }

}
