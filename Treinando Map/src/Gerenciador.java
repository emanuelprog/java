import java.util.HashMap;
import java.util.Map;

public class Gerenciador<String, Animal> implements GerenciadorGenerico<String, Animal> {

    private HashMap listaAnimais = new HashMap<String , Animal>();
    @Override
    public Animal adicionar(String chave, Animal valor) {
        return (Animal) this.listaAnimais.put(chave, valor);
    }

    @Override
    public Animal excluir(String chave) {
        return (Animal) this.listaAnimais.remove(chave);
    }

    @Override
    public void imprimir() {
        for (Object animal : this.listaAnimais.values()) {
            System.out.println(animal);
        }
    }

    @Override
    public Map<String, Animal> getListaAnimais() {
        return this.listaAnimais;
    }
}
