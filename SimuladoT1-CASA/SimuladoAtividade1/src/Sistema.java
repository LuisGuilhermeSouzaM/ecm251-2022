public class Sistema {
    public void run(){
        Usuario user1 = new Usuario("All Might", "allmight@outlook.com", "1234");
        Usuario user2 = new Usuario("Jon Snow", "jonsnow@outlook.com", "1234");
        Usuario user3 = new Usuario("Bruce Wayne", "brucewayne@wayneenterprises.com", "1234");
        
        Conta conta1 = new Conta(10.0, user1);
        Conta conta2 = new Conta(250.0, user2);
        Conta conta3 = new Conta(1000000000.0, user3);

        String conta11 = conta1.visualizarConta();
        String conta22 = conta2.visualizarConta();
        String conta33 = conta3.visualizarConta();
        
        System.out.println("Antes da Transação");
        System.out.println(conta11);
        System.out.println(conta22);
        System.out.println(conta33);
        
        String qrcode1 = Transacoes.gerarQRCode(conta1.getIdConta(), user1.getNome(), 250.0);

        pagarQRCode(qrcode1, conta2, conta1);

        pagarQRCode(qrcode1, conta3, conta1);

        pagarQRCode(qrcode1, conta2, conta1);

        String qrcode2 = Transacoes.gerarQRCode(conta2.getIdConta(), user2.getNome(), 1000.0);

        pagarQRCode(qrcode2, conta3, conta2);

        conta11 = conta1.visualizarConta();
        conta22 = conta2.visualizarConta();
        conta33 = conta3.visualizarConta();
        System.out.println("====================================================================================");
        System.out.println("Depois da Transação");
        System.out.println(conta11);
        System.out.println(conta22);
        System.out.println(conta33);
    }

    private boolean pagarQRCode(String qRCode,  Conta contaPagante, Conta contaRecebe){
        String[] dados = qRCode.split(";");
        double valor = Double.parseDouble(dados[2]);
        double saldo = contaPagante.getSaldo();
        int id = Integer.parseInt(dados[0]);
        String nome = dados[1];
        if(id != contaRecebe.getIdConta() || !(nome.equals(contaRecebe.getUsuario().getNome()))) return false;
        if(valor >= 0 && valor < contaPagante.getSaldo()){
            contaPagante.setSaldo(saldo - valor);
            contaRecebe.setSaldo(contaRecebe.getSaldo() + valor);
        } else{
            return false;
        }
        return true;
    }
}