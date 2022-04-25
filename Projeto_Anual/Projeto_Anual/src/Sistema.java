import java.time.LocalDate;

public class Sistema {
    public static void run(){
        Jogo batman = new Jogo(200, "Batman Arkham Knight", true, 30);
        System.out.println("Preco antes do desconto: " + batman.getPreco());
        System.out.println("\n\n");
        batman.aplicaDescontoDe(0.30);
        System.out.println("Preco depois do desconto: " + batman.getPreco());

        User louie = new User("Louie", LocalDate.of(2001,4,21), "mnomeluisguilherme@yahoo.com");
        System.out.println("Ola " + louie.getUsername() + " " + "de " + louie.getAge() + " " + "anos");

        if(louie.podeJogar(batman)){
            System.out.println(louie.getUsername() + " " + "Pode jogar " + batman.getNome());
        } else {
            System.out.println(louie.getUsername() + " Nao " + "Pode jogar " + batman.getNome());
        };
        

    }
}
