import java.util.ArrayList;
import java.util.Collections;

public class Jogo {
    private double preco;
    private String nome;
    private boolean promocao;
    private int idadeMinima;
    private String descricao;
    private ArrayList<EnumTipoDeJogo> tipos;
    private ArrayList<Review> reviews;

    public Jogo(double preco, String nome, boolean promocao, int idadeMinima, String descricao) {
        this.preco = preco;
        this.nome = nome;
        this.promocao = promocao;
        this.idadeMinima = idadeMinima;
        this.descricao = descricao;
        this.tipos = new ArrayList<EnumTipoDeJogo>();
        this.reviews = new ArrayList<Review>();
    }

    public void addTipo(EnumTipoDeJogo tipo){
        this.tipos.add(tipo);
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }
    public void sortTipos(){
        Collections.sort(this.tipos);
    }

    public void showTipos(){
        this.sortTipos();
        for(EnumTipoDeJogo tipo : this.tipos){
            System.out.print("" + tipo + "; ");
        }
        System.out.println("\n");
    }

    public void showReviews() {
        System.out.print("\n\n Reviews do jogo: " + this.getNome() + "\n\n");
        for (Review review : this.reviews) {
            System.out.print(" " + review + "\n\n");
        }
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean aplicaDescontoDe(double desconto){
        if(!isPromocao() || desconto > 0.30) return false;
        setPreco(preco - getPreco() * desconto);
        return true;
    }
}
