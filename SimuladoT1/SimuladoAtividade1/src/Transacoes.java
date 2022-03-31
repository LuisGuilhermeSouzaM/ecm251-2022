public class Transacoes {
    public static String gerarQRCode(int idConta, String recebedor, double valor){
        return idConta + ";" + recebedor + ";" + valor;
    }
    

}
