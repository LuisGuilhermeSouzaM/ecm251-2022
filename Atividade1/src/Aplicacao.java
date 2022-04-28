// Atividade T1 Luis Guilherme de Souza Munhoz 20.01937-8

public class Aplicacao {
    public static void run(){
        Veiculo veiculo = new Veiculo();
        Usuario usuario = new Usuario("Luis Guilherme", veiculo);

        System.out.println(usuario.toString()); // Para testar se o veiculo inicial do objeto usuario
        Veiculo vTeste1 = new Moto();
        Veiculo vTeste2 = new Bicicleta();
        Veiculo vTeste3 = new Carro();
        Veiculo vTeste4 = new Patinete();

        // Emprestando moto e testando
        usuario.Emprestimo(vTeste1); 
        String teste1 = vTeste1.testar();

        System.out.println(teste1); // Exibindo o teste
        System.out.println(usuario.toString()); // Para testar se o veiculo do objeto usuario foi trocado
        
        // Trocando moto por bicicleta e testando
        usuario.Troca(vTeste2);
        String teste2 = vTeste2.testar();


        System.out.println(teste2); // Exibindo o teste
        System.out.println(usuario.toString()); // Para testar se o veiculo do objeto usuario foi trocado


        // Trocando bicicleta por carro e testando
        usuario.Troca(vTeste3);
        String teste3 = vTeste3.testar();

        System.out.println(teste3); // Exibindo o teste
        System.out.println(usuario.toString()); // Para testar se o veiculo do objeto usuario foi trocado

        // Trocando carro por patinete e testando
        usuario.Troca(vTeste4);
        String teste4 = vTeste4.testar();

        System.out.println(teste4); // Exibindo o teste
        System.out.println(usuario.toString()); // Para testar se o veiculo do objeto usuario foi trocado
    }
}
