public class Tesoura extends Jogada {

    public Tesoura() {
        super(EnumJogadas.LAGARTO, EnumJogadas.PAPEL);
    }

    @Override
    public EnumJogadas getTipo() {
        return EnumJogadas.TESOURA;
    }
    
    
}
