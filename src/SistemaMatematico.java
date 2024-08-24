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
        int retornoMenu=1;
        //Apresentação
        System.out.println("""
                
                🅂🄸🅂🅃🄴🄼🄰 🄼🄰🅃🄴🄼🄰🅃🄸🄲🄾
                
                Olá e seja bem vindo ao Sistema Matemático!
                
                """);
        //Inputs e Processamento de Dados
        do {
            System.out.println("""

Por favor, escolha uma das opções abaixo:

1 - Verificar se o número é primo
2 - Verificar se o número é par
3 - Verificar se o número é negativo
4 - Criar tabuada
5 - Calculadora
0 - Sair do programa

""");
            if(retornoMenu==0){
                retornoMenu=1;
            }
            opcao=input.nextInt();
            if(opcao>5||opcao<0){
                System.out.println("Você selecionou uma opção inválida...");
            }else{
                if(opcao==1){
                    while(retornoMenu==1) {
                        System.out.println("Por favor, informe o número que deseja verificar: Obs:Número>1");
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
                }
            }
        }while(opcao!=0);
        //Fim do Programa
        System.out.println("Muito Obrigado por usar o Sistema Matemático! Volte sempre que precisar!");
    }
}