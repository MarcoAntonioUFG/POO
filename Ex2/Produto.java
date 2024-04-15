public class Produto {
    String nome, id;
    int valor, estoque, qnt;

    public Produto(String nome, String id,int valor, int estoque, int qnt) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
        this.estoque = estoque;
        this.qnt = qnt;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        setEstoque(estoque-qnt);
        return valor*qnt;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
