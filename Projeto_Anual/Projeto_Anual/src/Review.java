public class Review {
    private int stars;
    private String avaliacao;
    private EnumFeedback feedback;    
    private Jogo jogo;
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Jogo getJogo() {
        return jogo;
    }
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    public int getStars() {
        return stars;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public EnumFeedback getFeedback() {
        return feedback;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setFeedback(EnumFeedback feedback) {
        this.feedback = feedback;
    }
    @Override
    public String toString() {
        return "Review [avaliacao=" + avaliacao + ", feedback=" + feedback + ", jogo=" + jogo.getNome() + ", stars=" + stars
                + ", username=" + user.getUsername() + "]";
    }
    
}
