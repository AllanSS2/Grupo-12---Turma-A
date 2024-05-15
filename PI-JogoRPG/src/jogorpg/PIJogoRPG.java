
package jogorpg;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;


public class PIJogoRPG {

    static int temp_dialog = 0, temp_narrativa = 75, temp_transicao = 40;

    public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    static void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_opcao;

        do {

            Escreva("\n++========================++", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Capítulos\n3 - Créditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_dialog);
            escolha_opcao = entrada.nextInt();

            if (escolha_opcao == 1) {
                jogo();

            } else if (escolha_opcao == 2) {
                //capitulos();

            } else if (escolha_opcao == 3) {
                creditos();
            } else if (escolha_opcao == 4) {
                Escreva("\nNão seja fraco, volte e conquiste o mundo!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            } else {
                Escreva("\nhm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_dialog);
            }

        } while (escolha_opcao != 1 && escolha_opcao != 2 && escolha_opcao != 3 && escolha_opcao != 4);
    }

    static void jogo() throws Exception {
        Scanner entrada = new Scanner(System.in);
        Escreva("Narrador: Espera... Quem é você? Não, vou tentar adivinhar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Devo chamá-lo de Ace? hmmm... Jovem Ace, um ótimo nome para um guerreiro como você!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Narrador: Mas não se deixe enganar só pelo elogio... os desafios serão grandes! você irá precisar de coragem!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Narrador: Não fique com medo, um guerreiro não desiste fácil!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_opcao;

        do{
        Escreva("Se sente preparado?\n1 - Medo? Eu? Jamais!\n2 - Não estou confiante, desisto!\n", TimeUnit.MILLISECONDS, temp_dialog);
        escolha_opcao = entrada.nextInt();

        switch (escolha_opcao) {
            case 1:
                Escreva("\nNarrador: Hahaha, jovem e destemido, não esperava menos de um grande guerreiro!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
            case 2:
                Escreva("\nNarrador: Atitude de um derrotado!\n", TimeUnit.MILLISECONDS, temp_dialog);
                menu();
                break;
                default:
                Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
        }
        }while(escolha_opcao != 1 && escolha_opcao != 2);

        Escreva("\nNarrador: Aqui se inicia sua jornada, desejo-lhe boa sorte!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: Ei Ace, acorde seu preguiçoso!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nAce: argh... Deixe eu continuar descansando pai...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: ACEEEEEE, por que você é tão preguiçoso???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: Na sua idade eu já desbravava o mundo!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha;
        int contador = 1;

        do{
        Escreva("\nVocê vai querer levantar?\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\n1- Sim | 2- Não\n", TimeUnit.MILLISECONDS, temp_dialog);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("\nAce: argh... que saco, eu vou me lavantar\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("\nMãe: ACEEEEEE, EU VOU TE BATEEEEEEEEER!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("\nNarrador: Após Ace ter sua coluna fraturada, ele entendeu que tinha que levantar hahaha\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Apanhou " + contador++ + " vez (s)", TimeUnit.MILLISECONDS, temp_dialog);
                    if (contador > 2)
                        Escreva("\nPara! irei levantar... argh!", TimeUnit.MILLISECONDS, temp_dialog);
                        default:
                        Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_dialog);
            }
        } while (escolha == 2 || escolha > 2);

        Escreva("\nNarrador: Ace levanta como se não tivesse acontecido nada..", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nNarrador: Depois de ter um grande bom dia de seus pais, tomar seu café da manhã, Ace foi ajudar seu pai em seu trabalho...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: Ace, venha ajudar seu velho na forja, eu estou velho...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: E também quero te contar uma grande história\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha2;
        int escolha_forja;

        do{
        Escreva("\nVocê vai querer ouvir essa história misteriosa...?\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\n1- Sim | 2- Não\n", TimeUnit.MILLISECONDS, temp_dialog);
            escolha2 = entrada.nextInt();

            switch (escolha2) {
                case 1:
                    Escreva("\nAce: Estou indo pai, no mínimo essa história tem que ser interessante... :p\n ", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("\nAce: Estou cansado e não estou muito interessado nessa história...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("\nPai: Cansado? Não faz nada e esta cansado...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("\nVocê já viu alguém trabalhando com forja antes?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("\n1 - Claro! Você mexe com isso todo dia!\n2 - Não, parece sem graça...", TimeUnit.MILLISECONDS, temp_dialog);
            escolha_forja = entrada.nextInt();

            if (escolha_forja == 1) {
                Escreva("\nPai: Todo conhecimento é válido! Então deixa eu te ensinar mais um pouco...\n", TimeUnit.MILLISECONDS, temp_dialog);

            }else if (escolha_forja == 2){
                Escreva("\nPai: Sem graça? venha comigo! Sem graça é ficar procrastinando!\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            }else{
                Escreva("\nNão conheço essa opção... Escolha outra!\n", null, escolha_forja);
            }
                default:
                    break;
            }
        }while (escolha2 == 2 || escolha > 2);
    }


    static void creditos() throws Exception {
        Escreva("++== DESENVOLVEDORES ==++ \n\n++== Juan Batista ==++\n" +
                "++== Allan Sampaio ==++\n++== Iran Vieira ==++", TimeUnit.MILLISECONDS, temp_dialog);
    }


    public static void main(String[] args) throws Exception {
        menu();
    }


}
    
