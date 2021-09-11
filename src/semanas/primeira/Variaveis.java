package semanas.primeira;

/**
 * 3º tópico
 */
public class Variaveis {
    public static void main(String[] args) {

        // int: variável inteira. armazena números inteiros como 1, -2, 10, -59, 29, 134 e 1028.
        // Serve para armazenarmos a idade de uma pessoa, a vida de um personagem em um jogo ou
        // o número de cliques que um usuário deu em um determinado botão. 
        int quantidadeDeVidaDoHeroi = 999999;
        System.out.print("A quantidade de vida do heroi eh de: ");
        System.out.println(quantidadeDeVidaDoHeroi);

        // double: variável real. Armazena númeiros reais (decimais) como 1,234; 3,1415 e -3,10.
        // Serve para armazenar informações como altura de uma pessoa (tenho 1,79 metro) ou até mesmo
        // o preço de um produto (meu caderno custou R$ 10,20 reais).
        double precoDoCarro = 10000.20;
        System.out.print("O preco do meu saveiro foi de: ");
        System.out.println(precoDoCarro);

        // string: variável textual. Assim como podemos armazenar a quantidade de vida de um heroi
        // ou sua altura, podemos também armazenar seu nome (ou um texto qualquer!)
        String nomeDoHeroi = "Super Hacker 666";
        System.out.print("O nome do heroi eh: ");
        System.out.println(nomeDoHeroi);

        // boolean: variável de valor binário. Armazena dados binários, isto é, verdadeiro ou falso.
        boolean valorVerdadeiro = true;
        boolean valorFalso = false;
        System.out.print("O valor verdadeiro eh: ");
        System.out.println(valorVerdadeiro);
        System.out.print("O valor falso eh: ");
        System.out.println(valorFalso);

        // Você sabia que é possível transaformar uma variável em outra de tipos diferentes?
        // por exemplo, eu tenho uma variável inteira com o valor 6, eu posso transformá-la para
        // real como 6.0 fazendo o casting dela!
        int variavelInteira = 6;
        double variavelReal = Double.valueOf(variavelInteira);
        System.out.println(variavelReal);

        // E se for um número qualquer (real ou inteiro) e quero transformar para texto?
        String valorEmTexto = String.valueOf(variavelInteira);
        System.out.println(valorEmTexto);

        // Mas por que fazer isto? E se for uma porcentagem de algo? Como temos 2 strings, podemos
        // concatenar, certo?
        System.out.println(valorEmTexto+"%");
    }
}
