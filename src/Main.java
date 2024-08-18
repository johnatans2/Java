import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Declaração de Variáveis
        Scanner entrada = new Scanner(System.in);
        float somaNotas=0;
        //Apresentação
        System.out.println("""
▒█▀▀▀█ ░▀░ █▀▀ ▀▀█▀▀ █▀▀ █▀▄▀█ █▀▀█ 　 █▀▀▄ █▀▀ 　 ▒█▀▀█ █▀▀█ █░░ █▀▀ █░░█ █░░ █▀▀█ 　 █▀▀▄ █▀▀
░▀▀▀▄▄ ▀█▀ ▀▀█ ░░█░░ █▀▀ █░▀░█ █▄▄█ 　 █░░█ █▀▀ 　 ▒█░░░ █▄▄█ █░░ █░░ █░░█ █░░ █░░█ 　 █░░█ █▀▀
▒█▄▄▄█ ▀▀▀ ▀▀▀ ░░▀░░ ▀▀▀ ▀░░░▀ ▀░░▀ 　 ▀▀▀░ ▀▀▀ 　 ▒█▄▄█ ▀░░▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀▀▀ ▀▀▀▀ 　 ▀▀▀░ ▀▀▀
                
▒█▀▄▀█ █▀▀ █▀▀▄ ░▀░ █▀▀█
▒█▒█▒█ █▀▀ █░░█ ▀█▀ █▄▄█
▒█░░▒█ ▀▀▀ ▀▀▀░ ▀▀▀ ▀░░▀




Por favor, informe quantas notas você deseja dar para calcular a média do aluno:""");
        //Input
        int quantNotas=entrada.nextInt();
        //Processamento de Dados
        for(int i=quantNotas;i>0;i--){
            System.out.println("Digite a nota do aluno:");
            float nota = entrada.nextFloat();
            somaNotas+=nota;
        }
        //Output
        System.out.println("A média do aluno é: "+(somaNotas/quantNotas));
    }
}