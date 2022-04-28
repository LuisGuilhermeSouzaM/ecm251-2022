// Atividade T1 Luis Guilherme de Souza Munhoz 20.01937-8

import java.util.concurrent.ThreadLocalRandom;

public class Veiculo{
    private int idVeiculo;
    private String tipoDeVeiculo;
    public Veiculo() {
        this.idVeiculo = ThreadLocalRandom.current().nextInt(10000, 99999);
        this.tipoDeVeiculo = null;
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }


    @Override
    public String toString() {
        return "Veiculo [idVeiculo=" + idVeiculo + "]";
    }

    public String testar(){
       return ("=====================================================" + "\nId do Veiculo: " + idVeiculo + "\nTipo de veiculo: " + getTipoDeVeiculo()+ "\n" + "=====================================================" + "\n");
    }
}