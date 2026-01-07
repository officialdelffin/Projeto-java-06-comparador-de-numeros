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

    String verificacaoDeLoop = "SIM";


    // Métodos :

    // Função que faz o sistema funcionar
    public void verificadorDoSistema () {


        // Objeto  que armazena dados em um atributo :
        Scanner inputUsuario = new Scanner( System.in );


        // Texto de apresentação :
        System.out.println( "Olá, seja bem-vindo ao comparador numerico, onde ele avisa qual número é maior ou se eles são números iguais." );

        while ( verificacaoDeLoop.equals( "SIM" ) ) {


            // Pedindo o usuário para escolher o primeiro número e armazendo ele:
            System.out.println( "Digite o primeiro número : " );
            numeroUm = inputUsuario.nextInt();


            // Pedindo o usuário para escolher o segundo número e armazendo ele :
            System.out.println( "Digite o segundo número : " );
            numeroDois = inputUsuario.nextInt();


            // Solução para o Bug do Scanner :
            verificacaoDeLoop = inputUsuario.nextLine();


            // Se o primeiro e segundo número são iguais :
            if ( numeroUm == numeroDois ) {


                // Avisa o usuário que os número são iguais :
                System.out.println( "O número " + numeroUm + " é igual ao número " + numeroDois + "." );


            }


            // Se o primeiro número for maior que o segundo :
            else if ( numeroUm > numeroDois ) {


                // Avisa que o primeiro número é maior que o segundo :
                System.out.println( "O número " + numeroUm + " é maior que o numero " + numeroDois + "." );


            }


            // Se o numero for diferente dessas duas ultimas verificações :
            else {


                // Avisa que o primeiro numero é menor que o segundo :
                System.out.println( "O número " + numeroUm + " é menor que o numero " + numeroDois + "." );


            }


            // Pede ao usuário para escolher se vai fazer uma nova comparaçao :
            System.out.println( "Se quer tentar novamente digite SIM, se não aperte em qualquer outra tecla. " );


            // Recebe a escolha do usuário :
            verificacaoDeLoop = inputUsuario.nextLine();


        }


        // Assim que sair do loop avisa o encerramento :
        System.out.println( "Sistema encerrado!" );


    }


}