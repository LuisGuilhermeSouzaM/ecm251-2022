public class Conta {
    public static int contador = 0;
    private int idConta;
    private double saldo;
    private Usuario usuario;

    public Conta(double saldo, Usuario usuario) {
        contador++;
        this.idConta = contador;
        this.saldo = saldo;
        this.usuario = usuario;
        
    }
    
    public String visualizarConta(){
        return "Conta id: " + idConta + 
        "\nSaldo: " + saldo + 
        "\nCliente: " + usuario.getNome() +"\n";
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
