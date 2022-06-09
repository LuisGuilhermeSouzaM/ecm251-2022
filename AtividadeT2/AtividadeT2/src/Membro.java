public abstract class Membro {
    private final String nome;
    private final String email;
    private final EnumFuncao funcao;

    public Membro(String nome, String email, EnumFuncao funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
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
