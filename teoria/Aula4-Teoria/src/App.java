public class App {
    public static void main(String[] args){
        //Declara e Instancia um objeto do tipo caneta
        Caneta c1 = new Caneta();
        c1.iniciarCaneta("azul", "BIC", 1.0);
        Caneta c2 = new Caneta();
        c2.iniciarCaneta("vermelha", "Stabillo", 0.4);

        c1.escrever("Olá Mundo, o Batman novo é um bom filme");
        c2.escrever("Missão Impossível pode mesmo ser o homem de ferro?");
        c2.escrever("Missão Impossível pode mesmo ser o homem de ferro?");
        c2.escrever("Missão Impossível pode mesmo ser o homem de ferro?");
    }
}
