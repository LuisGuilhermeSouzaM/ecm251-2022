public class Sistema {
    public void run(){
        Usuario user1 = new Usuario("All Might", "allmight@outlook.com", "1234");
        Usuario user2 = new Usuario("Jon Snow", "jonsnow@outlook.com", "1234");
        Usuario user3 = new Usuario("Bruce Wayne", "brucewayne@wayneenterprises.com", "1234");
        
        Conta conta1 = new Conta(1,10.0, user1);
        Conta conta2 = new Conta(2,250.0, user2);
        Conta conta3 = new Conta(3,1000000000.0, user3);

        String conta11 = conta1.visualizarConta();
        String conta22 = conta2.visualizarConta();
        String conta33 = conta3.visualizarConta();
        
        System.out.println("Antes da Transação");
        System.out.println(conta11);
        System.out.println(conta22);
        System.out.println(conta33);
        
        String qrcode1 = Transacoes.gerarQRCode(1, user1.getNome(), 250.0);

        pagarQRCode(qrcode1, conta2);
        receber(qrcode1, conta1);

        pagarQRCode(qrcode1, conta3);
        receber(qrcode1, conta1);

        pagarQRCode(qrcode1, conta2);
        receber(qrcode1, conta1);

        String qrcode2 = Transacoes.gerarQRCode(2, user2.getNome(), 1000.0);

        pagarQRCode(qrcode2, conta3);
        receber(qrcode2, conta2);

        conta11 = conta1.visualizarConta();
        conta22 = conta2.visualizarConta();
        conta33 = conta3.visualizarConta();
        System.out.println("Depois da Transação");
        System.out.println(conta11);
        System.out.println(conta22);
        System.out.println(conta33);
    }

    private boolean pagarQRCode(String qRCode,  Conta contaPagante){
        String[] dados = qRCode.split(";");
        double valor = Double.parseDouble(dados[2]);
        double saldo = contaPagante.getSaldo();
        int id = Integer.parseInt(dados[0]);
        if(id == contaPagante.getIdConta()) return false;
        if(valor >= 0 && valor < contaPagante.getSaldo()){
            contaPagante.setSaldo(saldo - valor);
        } else{
            return false;
        }
        return true;
    }

    private boolean receber(String qRCode,  Conta contaReceba){
        String[] dados = qRCode.split(";");
        double valor = Double.parseDouble(dados[2]);
        int id = Integer.parseInt(dados[0]);
        String nome = dados[1];
        
        if(id != contaReceba.getIdConta() && nome != contaReceba.getUsuario().getNome()) return false;
        if(valor >= 0){
            contaReceba.setSaldo(contaReceba.getSaldo() + valor);   
        } else{
            return false;
        }
        return true;
    }
}