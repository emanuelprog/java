public class Curso implements ItemPedido{

    private Integer codigo;
    private Double valor;
    private String descricao;

    private String conteudo;
    private Double cargaHoraria;
    private String publicoAlvo;

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(ItemPedido itemPedido) {
        return this.getCodigo() == itemPedido.getCodigo();
    }

    /*
    *  O METODO COMPARE DEVE COMPARAR O OBJETO IMPLICITO THIS COM O ITEM PEDIDO RECEBIDO COMO PARAMETRO
    * O METODO IRÁ RETORNAR -1 QUANDO O OBJETO IMPLICITO FOR MENOR QUE O OBJETO PASSADO COMO PARAMETRO
    * O METODO IRA RETORNAR 1 NO CASO CONTRARIO
    * O METODO IRA RETORNAR 0 QUANDO OS ELEMENTOS FOREM IGUAIS
    * */

    @Override
    public int compare(ItemPedido itemPedido) {
        return 0;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", publicoAlvo='" + publicoAlvo + '\'' +
                '}';
    }


    @Override
    public int compareTo(ItemPedido itemPedido) {
        return this.getValor().compareTo(itemPedido.getValor());
    }
}
