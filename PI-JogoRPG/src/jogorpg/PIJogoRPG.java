
package jogorpg;




import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;


public class PIJogoRPG {


        static int temp_dialog = 50, temp_narrativa = 75, temp_transicao = 40;



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
                    Escreva("\nNão seja fraco, volte e conquiste o mundo!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                }
                else{
                    Escreva("\nhm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_dialog);
                }

            }while(escolha_opcao != 1 && escolha_opcao != 2 && escolha_opcao != 3 && escolha_opcao != 4 );
        }


        static void jogo() throws Exception{
            Scanner entrada = new Scanner(System.in);
            Escreva("Narrador: Espera... Quem é você? Não, vou tentar adivinhar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Devo chamá-lo de Ace? hmmm... Jovem Ace, um ótimo nome para um guerreiro como você!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Mas não se deixe enganar só pelo elogio... os desafios serão grandes! você irá precisar de coragem!\n\n",TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Narrador: Não fique com medo, um guerreiro não desiste fácil!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Se sente preparado?\n1 - Porque eu teria medo?\n2 - Pega leve\n", TimeUnit.MILLISECONDS, temp_dialog);
            int escolha_opcao = entrada.nextInt();

            switch(escolha_opcao){
                case 1:
                    Escreva("\nNarrador: Hahaha, jovem e destemido, não esperava menos de um grande guerreiro!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Escreva("\nNarrador: Hahaha, não se preocupe meu jovem, você irá gostar...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
            Escreva("\nNarrador: Aqui se inicia sua jornada, desejo-lhe boa sorte!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: Ei Ace, acorde seu preguiçoso!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nAce: argh... Deixe eu continuar descansando pai...\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: ACEEEEEE, por que você é tão preguiçoso???\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: Na sua idade eu já viajava cidades!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nVocê vai querer levantar?\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\n1- Sim | 2- Não\n", TimeUnit.MILLISECONDS, temp_dialog);
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                Escreva("\nAce: argh... que saco, eu vou me lavantar\n", TimeUnit.MILLISECONDS, temp_dialog);    
                    break;
                
                case 2:
                Escreva("\nMãe: ACEEEEEE, EU VOU TE BATEEEEEEEEER!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nNarrador: Após Ace ter sua coluna fraturada, ele entendeu que tinha que levantar hahaha\n", TimeUnit.MILLISECONDS, temp_dialog);
                default:
                    break;
            }
            Escreva("\nNarrador: Depois de ter um grande bom dia de seus pais, tomar seu café da manhã, Ace foi ajudar seu pai em seu trabalho\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: Ace, venha ajudar seu velho a carregar uns pesos, eu estou velho...\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: E também quero te contar uma grande história\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nVocê vai querer ouvir essa história misteriosa...?\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\n1- Sim | 2- Não\n", TimeUnit.MILLISECONDS, temp_dialog);
            int escolha2 = entrada.nextInt();
            switch (escolha2) {
                case 1:
                Escreva("\nAce: Estou indo pai, espero que essa história seja interessante... :p\n ", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                
                case 2:
                Escreva("\nAce: Eu te ajudo velhote, mas não estou muito interessado nessa história...\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nPai: Hahaha, eu tenho certeza que você vai achar-lá muito interessante\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nAce: Hmpf...\n", TimeUnit.MILLISECONDS, temp_dialog);
                default:
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
    
