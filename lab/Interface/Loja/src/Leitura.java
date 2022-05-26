public class Leitura extends Produto {

    public Leitura(double preco, String nome, int quantidade, String descricao) {
        super(preco, nome, quantidade, descricao);
    }

    @Override
    public double gerarDesconto() {
        return 0.95 * getPreco();
    }
    
}
