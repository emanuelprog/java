import java.util.*;

public class GerenciadorCadastro<Pessoa extends ItemLista> implements Gerenciador<Pessoa> {

    private List<Pessoa> lista = new ArrayList<>();
    private Map<String, Pessoa> apelidoParaAluno = new HashMap<>();
    private Integer id = 0;
    @Override
    public void salvar(Pessoa obj) {
        obj.setId(++id);
        lista.add(obj);
        this.apelidoParaAluno.put(obj.getApelido(), obj);
    }

    @Override
    public void excluir(Pessoa obj) {
        lista.remove(obj);
        this.apelidoParaAluno.remove(obj);
    }

    @Override
    public Pessoa pesquisar(Pessoa obj) {
        for (Pessoa objeto : lista) {
            if (objeto.equals(obj)) {
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void imprimir() {
        Iterator<Pessoa> iterator = this.lista.listIterator();

        while (iterator.hasNext()) {
            Pessoa obj = iterator.next();
            System.out.println(obj);
        }
    }

    @Override
    public Pessoa editar(Pessoa obj) {
        for (Pessoa objeto : lista) {
            if (objeto.equals(obj)) {
                return objeto;
            }
        }
        return null;
    }

    public Pessoa buscaPorApelido(String apelido) {
        if (!apelidoParaAluno.containsKey(apelido)) {
            System.out.println("Não contem esse apelido!");
        } else {
            return apelidoParaAluno.get(apelido);
        }
        return null;
    }

}
