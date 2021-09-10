package semanas.primeira;

/**
 * 2º tópico
 */
public class Saidas {
    public static void main(String[] args) {
        // Para mostrar na tela alguma mensagem ou o valor de alguma variável, usamos o 
        // System.out.print() ou o System.out.println(). O primeiro imprime o valor no console
        // sem dar a quebra de linha, então o cursor ficará na mesma linha, já o segundo imprime
        // também a quebra de linha.
        System.out.println("***** Primeiro enunciado *****");
        System.out.print("Ola, mundo");
        System.out.println("meu nome eh Natan!");

        // perceba que a saída acima ficou estranha pois a palavra "mundo" ficou junta à palavra "meu".
        // Chamamos isto de contatenação, ou seja, a palavra "mundo" ficou concatenada com a palavra "meu".
        // Para imprimir separado, conforme esparávamos, vamos adicionar um espaço ao final da palavra "mundo"
        // ou no começo da palavra "meu".
        System.out.println("***** Segundo enunciado *****");
        System.out.print("Ola, mundo ");
        System.out.println("meu nome eh Natan!");

        // também poderíamos imprimir no mesmo texto com a quebra de linha ao final
        System.out.println("Ola, mundo meu nome eh Natan!");

        // E com variáveis? Como funcionaria? Bom, também podemos concatenar textos entre aspas com variáveis
        // de diversos tipos adicionando o sinal "+" entre as strings.
        System.out.println("***** Terceiro enunciado *****");
        String meuNome = "Natan";
        System.out.println("Ola, mundo meu nome eh "+meuNome+"!");

        // perceba que a saída acima ficou bem parecida com a saída anterior.
    }
}
