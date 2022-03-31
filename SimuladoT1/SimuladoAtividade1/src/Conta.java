public class Conta {
    private String idConta;
    private float saldo;
    
    public Conta(String idConta, float saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
    }
    public String toString(){
        return this.idConta + ";" + this.saldo;
    }
    public String getIdConta() {
        return idConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }
}
