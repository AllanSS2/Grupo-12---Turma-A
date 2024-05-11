
package jogorpg;




import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;


public class PIJogoRPG {

     
    
        static int temp_dialog = 50, temp_narrativa = 50, temp_transicao = 50;



        
    
        public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
            for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
            }
        }


        static void jogo() throws Exception{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bem vindo ao game");
        }

        static void historia() throws Exception{
            Scanner entrada = new Scanner(System.in);   
        }

        static void creditos()throws Exception{
            
        }



        public static void main(String[] args) throws Exception {
            jogo(); 
            Scanner entrada = new Scanner(System.in);
    
            Escreva("Narrador: Bem-vindo(a) ao mundo de Math Adventure, voce está preparado para essa grande jornada?",TimeUnit.MILLISECONDS, temp_dialog);
    
            System.out.println("\n1 - Sim | 2 - Com certeza! |3 - Eu ainda estou com receio...");
    
            int escolha_qual = entrada.nextInt();
    
            if(escolha_qual  == 1 || escolha_qual == 2){
                Escreva("\nNarrador: Vejo que você está confiante guerreiro(a), Eu confio muito em seu potencial!\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            }else if(escolha_qual == 3){
                Escreva("\nNarrador: Não precisa se preocupar nobre guerreiro(a), a aventura está só começando!\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            }else{
                Escreva("\nNarrador: Vejo que optou por uma opcao invalida, mas não se preocupe a história se iniciara mesmo assim! Boa sorte!\n", TimeUnit.MILLISECONDS, temp_dialog);
    
            }
    
            Escreva("++========================++", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Historia\n3 - Creditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            int escolha_opcao = entrada.nextInt();
    
            do{
                if(escolha_opcao == 1){
                    Escreva("Narrador: Você iniciara essa grande jornada agora, aventureiro!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    jogo();
    
                }
                else if(escolha_opcao == 2){
                    historia();
    
                }
                else if(escolha_opcao == 3){
                    creditos();
    
                }
                else if(escolha_opcao == 4){
    
    
                }
                else{
                    System.out.println("Opcao invalida, digite novamente!");
                }
    
            }while(escolha_opcao !=1 && escolha_opcao !=2 && escolha_opcao !=3 && escolha_opcao !=4);
    
                
        }
    
        
    }
    
