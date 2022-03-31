public class Conta {
    private int idConta;
    private double saldo;
    Usuario usuario;

    public Conta(int idConta, double saldo, Usuario usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }
    
    public String visualizarConta(){
        return "Conta id: " + idConta + 
        "\nSaldo: " + saldo + 
        "\nCliente: " + usuario.getNome();
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
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
}
