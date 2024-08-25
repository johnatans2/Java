//Importando bibliotecas
import java.util.Scanner;
//Início do Programa
public class SistemaMatematico{
    //Declaranção de Funções
    public static int retornoAoMenu(){
        Scanner inputFuncao=new Scanner(System.in);
        System.out.println("""

Escolha uma das opções abaixo:

1 - Verificar outro número
0 - Retornar ao menu
""");
        int selecao=inputFuncao.nextInt();
        while(selecao!=1&&selecao!=0){
            System.out.println("""

Você selecionou uma opção inválida, por favor, escolha apenas uma das opções abaixo:

1 - Verificar outro número
0 - Retornar ao menu
""");
            selecao=inputFuncao.nextInt();
        }
        if(selecao==1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        //Declaração de Variáveis
        Scanner input = new Scanner(System.in);
        int opcao;
        int numeroPrimo;
        int numeroPar;
        float numeroNegativo;
        int retornoMenu=1;
        //Apresentação
        System.out.println("""
                
                🅂🄸🅂🅃🄴🄼🄰 🄼🄰🅃🄴🄼🄰🅃🄸🄲🄾
                
                Olá, seja bem vindo ao Sistema Matemático!""");
        //Inputs e Processamento de Dados
        do {
            System.out.println("""

Por favor, escolha uma das opções abaixo:

1 - Verificar se o número é primo
2 - Verificar se o número é par
3 - Verificar se o número é negativo
4 - Criar tabuada
5 - Calculadora
0 - Sair do programa""");
            if(retornoMenu==0){
                retornoMenu=1;
            }
            opcao=input.nextInt();
                switch (opcao){
                    case 0:
                        System.out.println("Muito Obrigado por usar o Sistema Matemático! Volte sempre que precisar!");
                        break;
                    case 1:
                        while(retornoMenu==1) {
                        System.out.println("Por favor, informe o número que deseja verificar(Obs:Número>1):");
                        numeroPrimo = input.nextInt();
                        int divisoesExatas = 0;
                        while (numeroPrimo <= 1) {
                            System.out.println("""
                                    
                                    Você digitou um número que não se enquadra nas regras para a verificação de um número primo!
                                    Por favor, digite novamente:
                                    
                                    Lembre-se, para ser um número primo ele deve ser maior que 1.
                                    
                                    """);
                            numeroPrimo = input.nextInt();
                        }
                        for (int i = numeroPrimo; i > 1; i--) {
                            if (numeroPrimo % i == 0) {
                                divisoesExatas++;
                            }
                        }
                        if (divisoesExatas > 1) {
                            System.out.println("O número " + numeroPrimo + " não é primo e possui " + divisoesExatas + " divisões exatas.");
                        } else {
                            System.out.println("O número " + numeroPrimo + " é primo!");
                        }
                        retornoMenu=retornoAoMenu();
                    }
                        break;
                    case 2:
                        while(retornoMenu==1){
                            System.out.println("Por favor, digite o número que deseja verificar(Obs:o número deve ser inteiro):");
                            numeroPar=input.nextInt();
                            if(numeroPar%2==0){
                                System.out.println("O número "+numeroPar+" é par!");
                            }else{
                                System.out.println("O número "+numeroPar+" é ímpar!");
                            }
                            retornoMenu=retornoAoMenu();
                        }
                        break;
                    case 3:
                        while(retornoMenu==1){
                            System.out.println("Por favor, digite o número que deseja verificar:");
                            numeroNegativo=input.nextFloat();
                            if(numeroNegativo<0){
                                System.out.println("O número "+numeroNegativo+" é negativo!");
                            }else if(numeroNegativo>0){
                                System.out.println("O número "+numeroNegativo+" é positivo!");
                            }else{
                                System.out.println("O número digitado é 0, portanto não é considerado negativo e nem positivo, e sim neutro");
                            }
                            retornoMenu=retornoAoMenu();
                        }
                        break;
                        //Criarei o sitema de tabuadas separadamente
                    default:
                        System.out.print("A opção selecionada é inválida");
                        break;
                }
        }while(opcao!=0);
        //Fim do Programa
    }
}