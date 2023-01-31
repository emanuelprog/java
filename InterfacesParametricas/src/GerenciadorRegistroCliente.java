public class GerenciadorRegistroCliente implements GerenciadorRegistro<Cliente>{

    public Cliente clientes[] = new Cliente[10];
    public Integer posicao = 0;

    @Override
    public void salvar(Cliente obj) {
        if (posicao < 10) {
            clientes[posicao++] = obj;
        }
    }

    @Override
    public void excluir(Cliente obj) {

    }

    @Override
    public int pesquisar(Cliente obj) {
        for (int i = 0; i < posicao; i++) {
           if(clientes[i].equals(obj)) {
               return i;
           }
        }
        return -1;
    }

    @Override
    public void imprimirTodos() {
        for (int i = 0; i < posicao; i++) {
                System.out.println(clientes[i]);
            }
        }
    }