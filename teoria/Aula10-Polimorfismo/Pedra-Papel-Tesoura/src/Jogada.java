public class Jogada {
    private final EnumJogadas[] venco = new EnumJogadas[2];
    
    public Jogada(EnumJogadas venco, EnumJogadas venco2) {
        this.venco[0] = venco;
        this.venco[1] = venco2;
    }

    public boolean verifificarVenceu(Jogada jogada) {
        if (jogada.getTipo().equals(venco[0]) || jogada.getTipo().equals(venco[1]))
            return true;
        return false;
    }

    public EnumJogadas getTipo(){
        return EnumJogadas.PAPEL;
    }
}
