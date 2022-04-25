public class Jogo {
    private double preco;
    private String nome;
    private boolean promocao;
    private int idadeMinima;
    public Jogo(double preco, String nome, boolean promocao, int idadeMinima) {
        this.preco = preco;
        this.nome = nome;
        this.promocao = promocao;
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean aplicaDescontoDe(double desconto){
        if(!isPromocao() || desconto > 0.30) return false;
        setPreco(preco - getPreco() * desconto);
        return true;
    }
}
