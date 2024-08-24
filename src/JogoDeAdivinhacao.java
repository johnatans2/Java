//Importando bibliotecas
import java.util.Scanner;
import java.util.Random;
//Início do Programa
public class JogoDeAdivinhacao{
    public static void main(String[] args){
        //Declaração de Variáveis
        Scanner input=new Scanner(System.in);
        String opcao;
        boolean acertou;
        int palpite;
        int tentativas=0;
        //Apresentação
        System.out.println("""

𝕁𝕠𝕘𝕠 𝕕𝕖 𝔸𝕕𝕚𝕞𝕚𝕟𝕙𝕒𝕔̧𝕒̃𝕠

Olá, e seja bem vindo ao Jogo de Adivinhação!

""");
        //Input e Processamento de Dados
        do{
            System.out.println("""

Por favor, escolha uma das opções abaixo:

I - Iniciar o jogo
S - Sair do jogo

""");
            opcao=input.nextLine().toUpperCase();
            if(opcao.equals("I")){
                int aleatorio=new Random().nextInt(100);
                tentativas++;
                acertou=false;
                while(!acertou){
                    if(tentativas==1){
                        System.out.println("O jogo foi iniciado! Digite um número inteiro de 1 a 100 e veja se você acerta ou não!");
                    }
                    palpite=input.nextInt();
                    if(palpite==aleatorio){
                        acertou=true;
                        System.out.println("Parabéns, você acertou! O número era " + aleatorio + " e você ganhou o jogo em " + tentativas + " tentativas!");
                        System.out.println("Retornando ao menu...");
                        tentativas=0;
                    }else{
                        tentativas++;
                        if(palpite>aleatorio){
                            System.out.println("Quase lá! Tente um número menor!");
                        }else{
                            System.out.println("Não foi dessa vez, tente um número maior!");
                        }
                    }
                }
            }
        }while(!opcao.equals("S"));
        //Fim do Programa
        System.out.println("Encerrando o jogo... volte sempre!");
    }
}