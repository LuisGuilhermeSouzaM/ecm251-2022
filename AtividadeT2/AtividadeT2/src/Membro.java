public abstract class Membro implements PostarMensagem{
    private final String nome;
    private final String email;
    private final EnumFuncao funcao;
    private EnumHora hora;
    
    public Membro(String nome, String email, EnumFuncao funcao, EnumHora hora) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
        this.hora = hora;
    }

    public EnumHora getHora() {
        return hora;
    }

    public void mudaTurno(EnumHora hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public EnumFuncao getFuncao() {
        return funcao;
    }

}
