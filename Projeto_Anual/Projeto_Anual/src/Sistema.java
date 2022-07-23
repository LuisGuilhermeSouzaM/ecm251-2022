import java.time.LocalDate;

public class Sistema {
    public static void run(){
        Jogo batman = new Jogo(200, "Batman Arkham Knight", true, 14);
        System.out.println("Preco antes do desconto: " + batman.getPreco());
        System.out.println("\n\n");
        batman.aplicaDescontoDe(0.30);
        System.out.println("Preco depois do desconto: " + batman.getPreco());

        User louie = new User("Louie", LocalDate.of(2001,4,21), "batman@yahoo.com");
        System.out.println("Ola " + louie.getUsername() + " " + "de " + louie.getAge() + " " + "anos");

        if(louie.podeJogar(batman)){
            System.out.println(louie.getUsername() + " " + "Pode jogar " + batman.getNome());
        } else {
            System.out.println(louie.getUsername() + " Nao " + "Pode jogar " + batman.getNome());
        };
        
        Jogo haloInf = new Jogo(200, "Halo Infinite", false, 18);

        if(louie.podeJogar(haloInf)){
            System.out.println(louie.getUsername() + " " + "Pode jogar " + haloInf.getNome());
        } else {
            System.out.println(louie.getUsername() + " Nao " + "Pode jogar " + haloInf.getNome());
        };

        Review review1 = louie.writeReview(haloInf, 5, "Gode");

        System.out.println(review1);
    }
}
