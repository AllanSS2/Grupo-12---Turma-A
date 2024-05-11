
package jogorpg;




import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;


public class PIJogoRPG {


        static int temp_dialog = 20, temp_narrativa = 75, temp_transicao = 40;



        public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
            for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
            }
        }

        static void menu() throws Exception{
            Scanner entrada = new Scanner(System.in);
            int escolha_opcao;

            do{

                Escreva("\n++========================++", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Capítulos\n3 - Créditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_dialog);

                escolha_opcao = entrada.nextInt();
                if(escolha_opcao == 1){
                    jogo();

                }
                else if(escolha_opcao == 2){
                    //capitulos();

                }
                else if(escolha_opcao == 3){
                    creditos();
                }
                else if (escolha_opcao == 4){
                    Escreva("Não seja fraco, volte e conquiste o mundo!", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                else{
                    Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:", TimeUnit.MILLISECONDS, temp_dialog);
                }

            }while(escolha_opcao !=3 );
        }


        static void jogo() throws Exception{
            Scanner entrada = new Scanner(System.in);
            Escreva("Narrador: Espera... Quem é você? Não vou tentar adivinhar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Prefiro te chamar de Ace, um ótimo nome para um guerreiro como você!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Mas não se deixe enganar só pelo elogio... os desafios serão grandes! Vai precisar de culhão!\n\n",TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Não fique com medo, um guerreiro não desiste fácil!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Se sente preparado?\n1 - Porque eu teria medo?\n2 - Pega leve\n", TimeUnit.MILLISECONDS, temp_dialog);
            int escolha_opcao = entrada.nextInt();

            switch(escolha_opcao){
                case 1:
                    break;
                case 2:
                    menu();
                    break;
            }
        }

        
        static void creditos()throws Exception{
            Escreva("++== DESENVOLVEDORES ==++ \n\n++== Juan Batista ==++\n" +
                    "++== Allan Sampaio ==++\n++== Iran Vieira ==++", TimeUnit.MILLISECONDS, temp_dialog);
        }



        public static void main(String[] args) throws Exception {
                menu();
        }
    
        
    }
    
