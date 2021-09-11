package semanas.primeira;

import java.util.Scanner;

/**
 * 4º tópico
*/
public class Entradas {
    public static void main(String[] args) {
        /**
         * E como fazemos para armazenar algum valor do usuário? Como *ler* valores digitados?
         * É bem parecido com a saída, usaremos o mesmo meio (o mesmo stream) que é o console.
         * Para ler alguma variável, vamos começar pelo tipo da variável que iremos ler.
         * 
         * Primeiro, caso mais básico: ler um texto qualquer que o usuário digitou no console.
         * Neste tópico já é necessário importar a classe Scanner, pois iremos usá-la para
         * ler (ou scanear) os valores digitados pelo usuário. Indicaremos, entre parenteses, que
         * usaremos o console colocando System.in (a entrada padrão do sistema).
         * 
         * Armazenaremos o texto em uma variável e depois a imprimiremos novamente.
        */
        Scanner leitor = new Scanner(System.in);
        String textoDigitado = leitor.nextLine();
        System.out.println(textoDigitado);


        /**
         * E para ler algum valor inteiro?
        */
        int valorInteiroLido = leitor.nextInt();
        System.out.println(valorInteiroLido);


        // /**
        //  * E valores reais?
        // */
        double valorRealLido = leitor.nextDouble();
        System.out.println(valorRealLido);

        // /**
        //  * Por último, e os booleanos
        // */
        boolean valorBooleanoLido = leitor.nextBoolean();
        System.out.println(valorBooleanoLido);

        /**
         * Perceba que é importante fechar o leitor após completar a leitura
        */
        leitor.close();

    }
}
