public class Comida extends Produto {
    public final EnumCategoriaComida categoria;
    public final EnumAlergicos alergicos;
    public final EnumPimenta pimentas;
    
    public Comida(double preco, String nome, int quantidade, String descricao, EnumCategoriaComida categoria,
            EnumAlergicos alergicos, EnumPimenta pimentas) {
        super(preco, nome, quantidade, descricao);
        this.categoria = categoria;
        this.alergicos = alergicos;
        this.pimentas = pimentas;
    }

    @Override
    public double gerarDesconto() {
        return 0.95 * getPreco();
    }

    
    
}
