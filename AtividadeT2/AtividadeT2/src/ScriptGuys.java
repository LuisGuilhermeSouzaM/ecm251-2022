public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, EnumFuncao funcao, EnumHora hora) {
        super(nome, email, funcao, hora);
    }

    @Override
    public void postarMensagem() {
        if(this.getHora() == EnumHora.TRABALHO)
            System.out.println("Prazer em ajudar novos amigos de código!");
        else if(this.getHora() == EnumHora.EXTRAS)
            System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
    
}
