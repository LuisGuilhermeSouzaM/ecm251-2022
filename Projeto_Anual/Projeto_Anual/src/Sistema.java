import java.time.LocalDate;

public class Sistema {
    public static void run(){
        Jogo batman = new Jogo(200, "Batman Arkham Knight", true, 14, "Batman");
        System.out.println("Preco antes do desconto: " + batman.getPreco() + "\n");
        batman.aplicaDescontoDe(0.30);
        System.out.println("Preco depois do desconto: " + batman.getPreco() + "\n");

        batman.addTipo(EnumTipoDeJogo.ACAO);
        batman.addTipo(EnumTipoDeJogo.AVENTURA);

        batman.showTipos();

        User louie = new User("Louie", LocalDate.of(2001,4,21), "batman@yahoo.com");
        System.out.println("Ola " + louie.getUsername() + " " + "de " + louie.getAge() + " " + "anos\n");

        if(louie.podeJogar(batman)){
            System.out.println(louie.getUsername() + " " + "Pode jogar " + batman.getNome() + "\n");
        } else {
            System.out.println(louie.getUsername() + " Nao " + "Pode jogar " + batman.getNome() + "\n");
        };
        
        Jogo haloInf = new Jogo(200, "Halo Infinite", false, 18, "Master Chief");
        haloInf.addTipo(EnumTipoDeJogo.ACAO);
        haloInf.addTipo(EnumTipoDeJogo.AVENTURA);
        haloInf.addTipo(EnumTipoDeJogo.FPS);
        haloInf.addTipo(EnumTipoDeJogo.SHOOTER);

        if(louie.podeJogar(haloInf)){
            System.out.println(louie.getUsername() + " " + "Pode jogar " + haloInf.getNome() + "\n");
        } else {
            System.out.println(louie.getUsername() + " Nao " + "Pode jogar " + haloInf.getNome() + "\n");
        };

        Review review1 = louie.writeReview(haloInf, 5, "Gode");
        haloInf.addReview(review1);

        User zeca = new User("zeca", LocalDate.of(2001,4,21), "batman@yahoo.com");
        
        Review review2 = zeca.writeReview(haloInf, 3, "mais ou menos");
        haloInf.addReview(review2);

        haloInf.showTipos();
        haloInf.showReviews();
    }
}
