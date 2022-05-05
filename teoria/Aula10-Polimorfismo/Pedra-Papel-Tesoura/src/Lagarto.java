public class Lagarto extends Jogada {
    
    public Lagarto() {
        super(EnumJogadas.PAPEL, EnumJogadas.SPOCK);
    }

    @Override
    public EnumJogadas getTipo() {
        return EnumJogadas.LAGARTO;
    }
    
}
