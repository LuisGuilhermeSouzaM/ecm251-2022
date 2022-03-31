public class Transacoes {
    public String gerarQRCode(String idConta, String recebedor, double valor){
        return idConta + ";" + recebedor + ";" + valor;
    }
    

}
