public class Item extends Produto{
    String nome;
    Produto produto;
    public Item(String nome, String id, int valor, int estoque, String nome1, int valor1) {
        super(nome, id, valor, estoque);
        this.nome = nome1;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
