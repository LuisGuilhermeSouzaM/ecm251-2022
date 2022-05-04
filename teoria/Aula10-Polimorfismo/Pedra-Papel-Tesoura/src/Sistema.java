import java.util.concurrent.ThreadLocalRandom;

public class Sistema {
    public static void rodar(){
        //usuario escolhe a jogadas
        Jogada jogada1 = new Tesoura();
        //sorteio da jogada para o pc
        Jogada jogada2 = sortearJogada();
        //Avaliacao das jogadas
        String resultado = avaliaJogadas(jogada1, jogada2);
        //exibicao do resultado
        System.out.println("Resultado: " + resultado);
    }

    private static Jogada sortearJogada() {
        Jogada jogadas[] = new Jogada[3];
        jogadas[0] = new Pedra();
        jogadas[1] = new Papel();
        jogadas[2] = new Tesoura();
        return jogadas[ThreadLocalRandom.current().nextInt(jogadas.length)];
    }

    private static String avaliaJogadas(Jogada jogada1, Jogada jogada2) {
        if(jogada1.verifificarVenceu(jogada2))
            return "Jogada 1";
        if(jogada2.verifificarVenceu(jogada1))
            return "Jogada 2";
        else
            return "Empate";
    }
    
}
