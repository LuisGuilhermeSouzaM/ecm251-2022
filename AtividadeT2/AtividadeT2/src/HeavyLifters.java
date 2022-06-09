public class HeavyLifters extends Membro{

    public HeavyLifters(String nome, String email, EnumFuncao funcao, EnumHora hora) {
        super(nome, email, funcao, hora);
    }

    @Override
    public void postarMensagem() {
        if(this.getHora() == EnumHora.REGULAR)
            System.out.println("Podem contar conosco!");
        else if(this.getHora() == EnumHora.EXTRAS)
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
    
}
