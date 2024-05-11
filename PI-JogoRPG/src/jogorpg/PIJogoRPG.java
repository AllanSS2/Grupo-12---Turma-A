
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

                Escreva("++========================++", TimeUnit.MILLISECONDS, temp_dialog);
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
                    System.out.println("Não seja fraco, volte e conquiste o mundo!");
                    break;
                }
                else{
                    System.out.println("hm... essa opção não conheço, mas escolha alguma correspondente:");
                }

            }while(escolha_opcao !=3 );
        }


        static void jogo() throws Exception{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Olha só o que temos por aqui... \n");
           
            Escreva("Narrador: Um mundo de desafios te aguarda, esteja pronto!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Bem-vindo(a) ao mundo de Math Adventure, voce está preparado para essa grande jornada?\n",TimeUnit.MILLISECONDS, temp_dialog);
        }

        
        static void creditos()throws Exception{
            Escreva("++== DESENVOLVEDORES ==++ \n\n++== Juan Batista ==++\n" +
                    "++== Allan Sampaio ==++\n++== Iran Vieira ==++", TimeUnit.MILLISECONDS, temp_dialog);
        }



        public static void main(String[] args) throws Exception {
                menu();
        }
    
        
    }
    
