public class Usuario {
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String toString(){
        return this.nome + ";" + this.email + ";" + this.senha;
    }
    
    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
