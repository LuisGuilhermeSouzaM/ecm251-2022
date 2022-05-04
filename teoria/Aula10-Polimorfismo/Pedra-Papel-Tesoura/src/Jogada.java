public class Jogada {
    private String venco;
    public Jogada(String venco) {
        this.venco = venco;
    }

    public boolean verifificarVenceu(Jogada jogada) {
        if (jogada.getTipo().equals(venco))
            return true;
        return false;
    }

    public String getTipo(){
        return "Jogada";
    }
}
