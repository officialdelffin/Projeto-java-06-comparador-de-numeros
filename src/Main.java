/* Projeto : Comparador de numeros
 *
 * Sistema em Java desenvolvido para consolidar o uso de estruturas condicionais e operadores relacionais.
 * O programa recebe dois números inteiros via terminal e compara seus valores para informar se são iguais, diferentes ou qual deles é o maior. Pratica a interação com o usuário através da classe Scanner
 * e o controle de fluxo para tomada de decisões. */


// Importações :
import java.util.Scanner;


// Classe de execução :
public class Main {


    // Função que executa o sistema
    public static void main( String[] args ) {


        // Criando o objeto de execução :
        ComparadorNumeros execucao = new ComparadorNumeros();


        // Executando o objeto para o sistema rodar :
        execucao.verificadorDoSistema();

    }


}


// Classe onde o sistema roda :
class ComparadorNumeros {


    // Atributos :

    int numeroUm   = 0;
    int numeroDois = 0;

    String verificacaoDeLoop = "";


    // Métodos :

    // Função que faz o sistema funcionar
    public void verificadorDoSistema () {


        // Objeto  que armazena dados em um atributo :
        Scanner inputUsuario = new Scanner( System.in );


        // Texto de apresentação :
        System.out.println( "Olá, seja bem-vindo ao comparador numerico, onde ele avisa qual número é maior ou se eles são números iguais." );


        // Pede o usuário para que escolha se começa uma consulta ou se encerra o sistema :
        System.out.println( "Digite COMEÇAR para fazer uma nova consulta ou ENCERRAR para que o sistema para de rodar :" );


        // Recebe a escolha do usuário :
        verificacaoDeLoop = inputUsuario.nextLine();


        // Se o usuário digitou COMEÇAR o sistema inicia
        if ( verificacaoDeLoop.equals( "COMEÇAR" ) ) {


            // Pedindo o usuário para escolher o primeiro número :
            System.out.println( "Digite o primeiro número : " );


            // Recebenco o primeiro número :
            numeroUm = inputUsuario.nextInt();


            // Pedindo o usuário para escolher o segundo número :
            System.out.println( "Digite o segundo número : " );


            // Recebenco o primeiro número :
            numeroDois = inputUsuario.nextInt();


            System.out.println( numeroUm + numeroDois );


        }


    }


}