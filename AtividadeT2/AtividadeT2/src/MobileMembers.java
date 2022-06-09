public class MobileMembers extends Membro{

    public MobileMembers(String nome, String email, EnumFuncao funcao, EnumHora hora) {
        super(nome, email, funcao, hora);
    }

    @Override
    public void postarMensagem() {
        if(this.getHora() == EnumHora.TRABALHO)
            System.out.println("Happy Coding!");
        else if(this.getHora() == EnumHora.EXTRAS)
            System.out.println("MAsK_S0c13ty");
    }
    
}
