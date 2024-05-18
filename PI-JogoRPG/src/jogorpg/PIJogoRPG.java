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

        int escolha;
        int contador = 1;
        
        Escreva("\nNarrador: Aqui se inicia sua jornada, desejo-lhe boa sorte!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: Ei Ace, acorde seu preguiçoso!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nAce: argh... Deixe eu continuar descansando pai...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: ACEEEEEE, por que você é tão preguiçoso???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nPai: Na sua idade eu já desbravava o mundo!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        
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
                        break;
                        default:
                        Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_dialog);
            }
        } while (escolha != 1 || escolha > 2);

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
                    Escreva("\n1 - Claro! Você mexe com isso todo dia! | 2 - Não, parece sem graça...", TimeUnit.MILLISECONDS, temp_dialog);
            escolha_forja = entrada.nextInt();

            if (escolha_forja == 1) {
                Escreva("\nPai: Todo conhecimento é válido! Então deixa eu te ensinar mais um pouco...\n", TimeUnit.MILLISECONDS, temp_dialog);

            }else if (escolha_forja == 2){
                Escreva("\nPai: Sem graça? venha comigo! Sem graça é ficar procrastinando!\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            }else{
                Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_dialog);
            }
                default:
                    break;
            }
        }while (escolha2 == 2 || escolha > 2);

        Escreva("\nPai: seu avô me contava uma história mitologica quando eu era pequeno...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Há muito tempo, em um reino distante, existiam três jóias mágicas de fortalecimento", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nDiziam as lendas que essas pedras eram presentes dos deuses, concedidas aos mortais como uma prova de sua confiança e habilidade para moldar o destino.", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nCada pedra fica protegida por um ancião, e para conquista-lá, é necessário derrotá-lo...Eu tinha medo e por isso nunca quis procurar saber mais dessa história...", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("\nVenha, vou te ensinar a forjar uma espada!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_historia;

        do{
        Escreva("\n1 - Mas é só isso a história? me conta mais sobre os detalhes!\n2 - Essa história parece mentira..\n", TimeUnit.MILLISECONDS, temp_dialog);
        escolha_historia = entrada.nextInt();

        
            switch(escolha_historia){
                case 1:
                Escreva("\nPai: As pedras possuem cores, cada cor representa um nível de dificuldade...", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nÉ impossível derrotar os anciões sem o devido conhecimento sobre eles...", TimeUnit.MILLISECONDS, temp_dialog);
                break;
                case 2:
                Escreva("\nPai: Hahaha, Ace, Ace, até a mais maluca das histórias podem se tornar verdade, se você acreditar nela", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nPai: E quem sabe... Você pode ser o primeiro à torna-lá real, vou te convencer !", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("\nAce: Eu quero ver você tentar... \n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
                
                
            }
        }while(escolha_historia != 1 && escolha_historia != 2);

            Escreva("\nPai: Como eu havia dito antes, existem três jóias perdidas, e cada uma delas se encontram em lugares distintos", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: E cada uma delas há um ancião guardião, sua função é protegê-las de malfeitores", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: A primeira jóia regida por um fulgor azul, representando a sabedoria, e quem à possuísse irá adquirir um vasto conhecimento sobre o mundo ", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("\nPai: Mas ela é guardada por um Ancião chamado, Ragnar, cuja a sabedoria está além dos limites humanos.", TimeUnit.MILLISECONDS, temp_dialog);
            int escolha_opcao2;
            do{
            
            Escreva("\nPai: Acha que consegue encarar?\n\n1- Claro, mas... | 2- Não...\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            escolha_opcao2 = entrada.nextInt();
            
            
            if(escolha_opcao2 == 1){
                Escreva("\nAce: Se a sabedoria dele está além dos limites humanos, como conseguiremos derrotar-lo?", TimeUnit.MILLISECONDS, temp_dialog);

            }else if(escolha_opcao2 == 2){
                Escreva("\nAce: Eu estou realmente assustado que possa existir alguém assim!", TimeUnit.MILLISECONDS, temp_dialog);

            }else{
                Escreva("\nNão conheço essa opção... Escolha outra!", TimeUnit.MILLISECONDS, temp_dialog);
            }

    }while(escolha_opcao2 !=1 && escolha_opcao2 !=2);

            Escreva("\nPai: São questões que só enfrentando-o para conseguir tais respostas\n", TimeUnit.MILLISECONDS, escolha_opcao2);
            Escreva("\nPai: Isso é só o começo de uma jornada complicada e desafiadora!", TimeUnit.MILLISECONDS, temp_dialog);

}

    static void creditos() throws Exception {
        Escreva("++== DESENVOLVEDORES ==++ \n\n++== Juan Batista ==++\n" +
                "++== Allan Sampaio ==++\n++== Iran Vieira ==++", TimeUnit.MILLISECONDS, temp_dialog);
    }


    public static void main(String[] args) throws Exception {
        menu();
    }


}
    
