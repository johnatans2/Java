//Importação de Bibliotecas
import java.util.Scanner;
//Início do Programa
public class SistemaParaDescobrirSeONumeroEhPrimo{
    public static void main(String[] args){
        //Declaração de Variáveis
        Scanner input=new Scanner(System.in);
        String opcao;
        int numero;
        int divisoesExatas=0;
        //Apresentação
        System.out.println("""
                
                ╔═══╗
                ║╔══╝
                ║╚══╗╔══╦═╦╦╗╔╦══╗╔══╦╗╔╗╔═╗╔══╦══╗
                ║╔══╝║╔╗║╔╬╣╚╝║╔╗║║╔╗║║║║║╔╗╣╔╗║╔╗║
                ║╚══╗║╚╝║║║║║║║╚╝║║╚╝║╚╝║║║║║╔╗║╚╝║
                ╚═══╝║╔═╩╝╚╩╩╩╩══╝╚══╩══╝╚╝╚╩╝╚╩══╝
                ─────║║
                ─────╚╝
                

Olá, seja bem vindo ao sistema verificador de número primo!
""");
        //Input e Processamento de Dados
        do{
            System.out.println("""

Por favor, Selecione uma das opções abaixo:

V - Verificar se o número é primo
S - Sair

""");
            opcao=input.nextLine().toUpperCase();
            if(opcao.equals("V")){
                System.out.println("Por favor, informe o número que deseja verificar: Obs:Número>1");
                numero=input.nextInt();
                while(numero<=1){
                    System.out.println("""

Você digitou um número que não se enquadra nas regras para a verificação de um número primo!
Por favor, digite novamente:

Lembre-se, para ser um número primo ele deve ser maior que 1.

""");
                    numero=input.nextInt();
                }
                for(int i=numero;i>1;i--){
                    if(numero%i==0){
                        divisoesExatas++;
                    }
                }
                if(divisoesExatas>1){
                    System.out.println("O número "+numero+" não é primo e possui "+divisoesExatas+" divisões exatas.");
                }else{
                    System.out.println("O número "+numero+" é primo!");
                }
                divisoesExatas=0;
            }else if (!opcao.equals("V")&&!opcao.equals("S")) {
                System.out.println("Você digitou uma opção inválida!");
            }
        }while(!opcao.equals("S"));
        input.close();
        //Fim do Programa
        System.out.println("Obrigado por utilizar o Sistema Verificador de Número Primo! Volte sempre que precisar");
    }
}