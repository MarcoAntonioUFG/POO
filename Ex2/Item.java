public class Item extends Produto{
    String nome;
    Produto produto;
    public Item(String nome, String id, int valor, int estoque, int qnt, String nome1, int valor1) {
        super(nome, id, valor, estoque, qnt);
        this.nome = nome1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
