## ECM251
## Atividade Individual/ Atividade Substitutiva
## Projeto Anual

> Rúbrica: evolução/funcionalidades

- Promoções:
    > mostrar jogos com descontos, aplicar o desconto no preço original do jogo, mostrar a porcentagem desconto e a duração da promoção
- Jogos:
    > biblioteca de jogos do usuário, loja de jogos, sinopse do jogo, desenvolvedora, publisher
    - Buscar:
        > buscar jogos por nome, por desenvolvedor, por publisher por preço e por categorias
    - Categorias:
        > categorias de jogos, tipos de jogos, mostrando diferentes áreas da loja para diferentes jogos, também incluindo jogos grátis e demonstrações
    - Notícias:
        > notícias sobre jogos
    - Navegação por áreas:
        > navegação por biblioteca de jogos, comunidade, suporte loja de jogos(promoções, categorias, etc)
    - Área do usuário:
        > Área onde se tem o perfil do usúario com seus troféus, jogos, email, nome, região, idioma
    - ux/ui:
        > seguindo uma experiência parecida com a steam
    - Compra:
        > diferentes formas de pagamento, aplicação de desconto em ofertas, cupons e transferência dos jogos comprados para a biblioteca do usuário
    - Devolução:
        > devolução de jogos feitas pelo usuário com a opção de reembolso caso o usuário não tenha o jogo há muito tempo e tenha jogado menos que duas horas do jogo
        - Reembolso:
            > reembolso de jogos em dinheiro virtual da loja ou por retorno do dinheiro pelo método de compra do usuário
    - Feedback:
        > reviews e análise de jogos feitas por usuários que compraram e jogaram os jogos
    - Perfil de cada jogo:
        > perfil do usuário em cada jogo, mostrando troféus, horas jogadas e dados relevantes do usuário para cada jogo
    - Sistema de troféus:
        > sistema de troféus dos jogos onde ao jogar, o usuário ganha pontos, que podem ser utilizados para conseguir descontos em outros jogos da loja

- Classes no projeto
    - Jogo
        - double preco -> preço padrão do jogo
        - String nome -> nome do jogo
        - boolean promocao -> se o jogo está em promoção ou não
        - int idadeMinima -> idade miníma para jogar
    - User
        - public static int contador = 0; -> contador gerador de id de usuario
        - String username -> username do usuario
        - LocalDate birthDate -> data de nascimento do usuario
        - String email -> email do usuario
        - int idUser -> id de usuario
        - int age -> idade do usuario, calculada a partir de sua data de nascimento e da data atual pela função calculateAge
        - Jogo jogo -> jogo que o usuario quer comprar
        - LocalDate currentDate =  LocalDate.now(); -> data atual
- Métodos do projeto
    - Métodos da classe Jogo
        - public boolean aplicaDescontoDe(double desconto) -> retorna falso caso o Jogo nao estiver em promocao ou caso o desconto for maior que 30% e verdadeiro caso contrário
        - getters e setters
    - Métodos da classe User
        - getters e setters
        - boolean podeJogar() -> retorna falso se o jogador não tem a idade requerida para jogar o jogo e verdadeiro caso contrário
        - calculateAge(LocalDate birthDate, LocalDate currentDate) -> calcula a idade do usuario a partir de sua data de nascimento e da data atual