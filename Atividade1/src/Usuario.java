// Atividade T1 Luis Guilherme de Souza Munhoz 20.01937-8

public class Usuario {
    private String nome;
    private Veiculo veiculo;
    
    public Usuario(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public void Emprestimo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public void Troca(Veiculo veiculo){
        Veiculo aux = this.veiculo;
        this.veiculo = veiculo;
        veiculo = aux;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", veiculo=" + veiculo.getTipoDeVeiculo() + "]";
    }
}
