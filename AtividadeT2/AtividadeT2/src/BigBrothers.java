public class BigBrothers extends Membro {

    public BigBrothers(String nome, String email, EnumFuncao funcao, EnumHora hora) {
        super(nome, email, funcao, hora);
    }

    @Override
    public void postarMensagem() {
        if(this.getHora() == EnumHora.REGULAR)
            System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        else if(this.getHora() == EnumHora.EXTRAS)
            System.out.println("...");
    }
    
}
