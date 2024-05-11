
package jogorpg;




import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;


public class PIJogoRPG {


        static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;



        public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
            for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
            }
        }


        static void jogo() throws Exception{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bem vindo ao game");
           
            Escreva("Narrador: Você iniciara essa grande jornada agora, aventureiro!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Bem-vindo(a) ao mundo de Math Adventure, voce está preparado para essa grande jornada?",TimeUnit.MILLISECONDS, temp_dialog);
        }

        
        static void creditos()throws Exception{
            System.out.println("Créditos do jogo");
        }



        public static void main(String[] args) throws Exception {
           Scanner entrada = new Scanner(System.in);
            int escolha_opcao;
            
            do{
                
                Escreva("++========================++", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Créditos\n3 - Sair\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_dialog);

                escolha_opcao = entrada.nextInt();
                if(escolha_opcao == 1){
                    
                    jogo();
    
                }
                else if(escolha_opcao == 2){
                    creditos();
    
                }
                else if(escolha_opcao == 3){
                    
                }
                else{
                    System.out.println("Opcao invalida, digite novamente!");
                }
    
            }while(escolha_opcao !=3 );
    
                
        }
    
        
    }
    
