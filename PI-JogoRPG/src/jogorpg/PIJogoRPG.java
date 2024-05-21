package jogorpg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class PIJogoRPG {

    //ajuste a velocidade dos caracteres impressos
    //static int temp_dialog = 60,  temp_narrativa = 0;
    static int temp_dialog = 0,  temp_narrativa = 0;

    public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Menu completo do jogo
    static void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_opcao;

        do {
            Escreva("\n++========================++", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao = entrada.nextInt();

            if (escolha_opcao == 1) {
                jogo();

            } else if (escolha_opcao == 2) {
                instrucoes();

            } else if (escolha_opcao == 3) {
                creditos();

            } else if (escolha_opcao == 4) {
                Escreva("Viajante: Não seja fraco, volte e conquiste o mundo!\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else {
                Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

        } while (escolha_opcao != 4);
    }

    //Perguntas do jogo
    public static int potencia1(){
            Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("156.250");
            alternativas.add("390.625");//correta
            alternativas.add("234.375");
            alternativas.add("312.500");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("Sabendo que o valor de 5^7 é 78.125, qual o resultado de 5^8?");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("390.625")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("390.625")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("390.625")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("390.625")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou "+pontos+"!");
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }

        
        return pontos;
    }

    public static int potencia2(){
        Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("x^6");//correta
            alternativas.add("x^4");
            alternativas.add("x^2");
            alternativas.add("x^10");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("Qual o valor da expressão x^8/x^2");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("x^6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("x^6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("x^6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("x^6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }
        return pontos;
    }

    public static int equação1grau(){
        Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("2");
            alternativas.add("6");//correta
            alternativas.add("3");
            alternativas.add("5");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("Qual o valor de x: 3x+4=5x-8");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("6")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }
        return pontos;
    }

    public static int equação2grau(){
        Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("-5");
            alternativas.add("-4");//correta
            alternativas.add("0");
            alternativas.add("-1");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("A soma das soluções da equação x² + 4x - 5 = 0 é igual a:");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("-4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("-4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("-4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("-4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }
        return pontos;
    }

    public static int polinomios1(){
        Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("5");
            alternativas.add("4");//correta
            alternativas.add("3");
            alternativas.add("2");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("Dados os polinômios p(x) = 2x³ + 3x² + 1 e q(x) = 3x² + 5x - 15, a soma p(-2) + q(2) é igual a:");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("4")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }
        return pontos;
    }
    public static int polinomios2(){
        Scanner entrada = new Scanner(System.in);
            boolean acertou = false;
            int tentativas =0 ;
            int pontos;

            List alternativas = new ArrayList();
            alternativas.add("6x³ + 4x² - 3x + 1");
            alternativas.add("6x³ + 12x² - 9x + 3");//correta
            alternativas.add("2x² + 8x² - 5x + 3");
            alternativas.add("12x³ + 3x² - 3x + 1");

            
            do{
                tentativas = tentativas + 1;
                Collections.shuffle(alternativas);
                System.out.println("O triplo do polinômio 2x³ + 4x² -3x + 1 é:");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));

                System.out.print("Escolha uma alternativa: ");
                String resposta = entrada.next();
                

                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("6x³ + 12x² - 9x + 3")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("6x³ + 12x² - 9x + 3")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("6x³ + 12x² - 9x + 3")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("6x³ + 12x² - 9x + 3")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                        } else {
                            System.out.println("Resposta incorreta!");
                        }
                        break;
                    default:
                    System.out.println("Escolha inválida!");

                    
            }

        }while(!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        }else if (tentativas > 1 && tentativas <=3) {
            pontos = 50;
        }else{
            pontos = 20;
        }
        return pontos;
    }




    // Função do jogo 
    static void jogo() throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        Escreva("Viajante: Espera... Quem é você? Não, vou tentar adivinhar...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Devo chamá-lo de Ace? hmmm... Jovem Ace, um ótimo nome para um guerreiro como você!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Mas não se deixe enganar só pelo elogio... os desafios serão grandes! você irá precisar de coragem!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não fique com medo, um guerreiro não desiste fácil!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_opcao;

        do {
            Escreva("\nSe sente preparado?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Medo? Eu? Jamais!\n2 - Não estou confiante, desisto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao = entrada.nextInt();

            switch (escolha_opcao) {
                case 1:
                    Escreva("Viajante: Hahaha, jovem e destemido, não esperava menos de um grande guerreiro!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Escreva("Viajante: Atitude de um derrotado!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    menu();
                    break;
                default:
                    Escreva("Não conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolha_opcao != 1 && escolha_opcao != 2);

        int escolha;
        int contador = 1;

        Escreva("Viajante: VAI PRECISAR DE SORTE NESSA JORNADA!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Ei Ace, acorde seu preguiçoso!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: argh... Deixe eu continuar descansando pai...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: ACEEEEEE, por que você é tão preguiçoso???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Na sua idade eu já desbravava o mundo!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("Você vai querer levantar?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1- Sim\n2- Não\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Ace: argh... que saco, eu vou me levantar!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Mãe: ACEEEEEE, EU VOU TE BATEEEEEEEEER!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Após Ace levar umas palmadas, ele entendeu que precisava se levantar...\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace apanhou " + contador++ + " vez (s).\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    if (contador >= 3) {
                        Escreva("Ace: Paraaa...! irei levantar... argh!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    }
            }
        } while (escolha != 1);

        Escreva("Ace levanta como qualquer dia normal...\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("\nPai: Ace, venha ajudar seu velho na forja! Eu estou velho.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: E também quero te contar uma história passada de gerações...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha2;
        int escolha_forja;

        do {
            Escreva("Você vai querer ouvir a história mística??\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

            Escreva("1- Mas é claro! Jamais negaria!\n2- Não parece ser muito atraente...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha2 = entrada.nextInt();

            switch (escolha2) {
                case 1:
                    Escreva("Ace: Estou indo pai, no mínimo essa história tem que ser interessante... :p\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Estou cansado e não estou muito interessado nessa história...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Cansado? Não faz nada e esta cansado...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Você já viu alguém trabalhando com forja antes?\n\n", TimeUnit.MILLISECONDS, temp_dialog);

                    Escreva("1 - Claro! Você mexe com isso todo dia!\n2 - Não, parece sem graça...\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    escolha_forja = entrada.nextInt();

                    if (escolha_forja == 1) {
                        Escreva("Pai: Todo conhecimento é válido! Então deixa eu te ensinar mais um pouco...\n", TimeUnit.MILLISECONDS, temp_dialog);

                    } else if (escolha_forja == 2) {
                        Escreva("Pai: Sem graça? venha comigo! Sem graça é ficar procrastinando!!\n", TimeUnit.MILLISECONDS, temp_dialog);

                    } else {
                        Escreva("Não conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    }
            }
        } while (escolha2 != 1);

        Escreva("Pai: seu avô me contava uma história mitologica quando eu era pequeno...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Há muito tempo, em um reino distante, existiam três jóias mágicas de fortalecimento\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Diziam as lendas que essas pedras eram presentes dos deuses, concedidas aos mortais como uma prova de sua " +
                "confiança e habilidade para moldar o destino.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Cada pedra fica protegida por um ancião, e para conquista-lá, é necessário derrotá-lo...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Eu tinha medo e por isso nunca quis procurar saber mais dessa história...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Venha, vou te ensinar a forjar uma espada!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_historia;

        do {
            Escreva("\n1 - Mas é só isso a história? me conta mais sobre os detalhes!\n2 - Essa história parece mentira..\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_historia = entrada.nextInt();

            switch (escolha_historia) {
                case 1:
                    Escreva("Pai: As pedras possuem cores, cada cor representa um nível de dificuldade...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: É impossível derrotar os anciões sem o devido conhecimento sobre eles...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
                case 2:
                    Escreva("Pai: Hahaha, Ace, Ace, até a mais maluca das histórias podem se tornar verdade, se você acreditar nela\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: E quem sabe... Você pode ser o primeiro à torna-lá real, vou te convencer !\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Eu quero ver você tentar... \n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolha_historia != 1 && escolha_historia != 2);

        Escreva("Pai: Como eu já havia dito, existem três jóias perdidas, cada uma delas se encontram em lugares distintos do reino de Math Adventure...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Há um ancião guardião protegendo-as de malfeitores nos locais...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: A primeira jóia, regida por um fulgor azul, representa a sabedoria. Quem a possuísse adquirirá um vasto conhecimento sobre o mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Mas ela é guardada por um ancião chamado Ragnar, cuja sabedoria está além dos limites humanos.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_opcao2;

        do {
            Escreva("Acha que consegue encarar?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1- Claro, mas...\n2- Não...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao2 = entrada.nextInt();

            if (escolha_opcao2 == 1) {
                Escreva("Ace: Se a sabedoria dele está além dos limites humanos, como conseguiremos derrotar-lo?\n\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else if (escolha_opcao2 == 2) {
                Escreva("\nAce: Eu estou realmente assustado que possa existir algo assim!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

            } else {
                Escreva("\nNão conheço essa opção... Escolha outra!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

        } while (escolha_opcao2 != 1 && escolha_opcao2 != 2);

        Escreva("\nPai: São questões que só enfrentando-o para conseguir tais respostas\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Isso é só o começo de uma jornada complicada e desafiadora!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Pai: Eu quero que você venha me ajudar a confeccionar espadas..!!\n", TimeUnit.MILLISECONDS, temp_dialog);

        Escreva("Escolha sua espada:\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_3;
        do{
        Escreva("Pai: Pois bem! Após a criação de sua espada quero que você vá atrás das jóias pela honra de nossa família!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("1 - Mas parece muito perigoso...\n2 - Já nasci pronto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
        escolha_3 = entrada.nextInt();

        switch(escolha_3){
            case 1:
                Escreva("Ace: Eu sou muito novo para enfrentar esse tipo de desafio! argh\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Pai: Na vida precisamos enfrentar desafios para um bem maior...\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Pai: Esta jornada fará você ficar mais sábio, corajoso e forte...\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Pai: Você irá me dar muito orgulho indo ...\n", TimeUnit.MILLISECONDS, temp_dialog);

            case 2:
                Escreva("Ace: Mas como vou ter as instruções certas?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                break;
        }
    }while (escolha_3 != 1 && escolha_3 != 2);

        Escreva("Pai: O VIAJANTE é quem pode te instruir em tudo o que precisa, deixarei você nas mãos dele...!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Sabendo que você quer dar orgulho para o seu pai, siga minhas instruções!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Ao norte de Math adventure, é onde a Jóia da sabedoria está sendo guardada por Ragnar, você precsará tomar muitos cuidados..\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Será necessário muita estratégia e conhecimento para derrota-lo, já que você possui uma espada básica!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vá em busca da jóia e eu te darei mais instruções...\n\n", TimeUnit.MILLISECONDS, temp_dialog);

    }

    static void capitulo1() throws Exception{
        Scanner entrada = new Scanner(System.in);

        Escreva("++== A JÓIA DA SABEDORIA ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace vai em direção ao Norte, atrás da pedra da sabedoria...\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Ei, viajante... Estou chegando próximo de algo diferente do que eu já havia visto antes!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Me parece um covil, estou na direção certa?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não se assuste Ace, será necessário entrar dentro deste covil para que possa pegar a jóia.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace após entrar no covil, encontra-se de cara com Ragnar tirando uma soneca...AAUF AAUF\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_entrar;

        do{
        Escreva("1 - Pegar a jóia escondido enquanto Ragnar dorme.\n2 - Derrotar Ragnar enquanto dorme.\n", TimeUnit.MILLISECONDS, temp_dialog);
        escolha_entrar = entrada.nextInt();

        if (escolha_entrar == 1) {
            Escreva("Ace: Nunca imaginei estar em um lugar desses, preciso de coragem\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...rs\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        } else if (escolha_entrar == 2) {
            Escreva("Ace: Enquanto ele dorme é minha melhor oportunidade de derrotá-lo\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...rs\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        }else {
            Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_narrativa);
        }
    }while(escolha_entrar != 1 && escolha_entrar != 2);
        Escreva("Viajante: Ace, você precisa ser rápido, pois ele pode acordar a qualquer momento...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace fica muito apreensivo e acelera o passo no estilo furtivo\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Estava com tanto medo que não olhou ao seu redor... Tropeçou e caiu..PUFFFF\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_medo;

        do{
        Escreva("Ragnar acorda furioso com o extremo barulho feito por Ace e vai em direção à ele\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("1 - Correr como se não ouvesse o amanhã.\n2 - Enfrentar Ragnar.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        escolha_medo = entrada.nextInt();

        if(escolha_medo > 0 && escolha_medo <= 2){
            switch (escolha_medo){
            case 1:
                Escreva("Ace Corre desesperadamente e novamente cai..PUFFF\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                break;
            case 2:
                Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                break;
            }
        }else{
            System.out.println("Entrada invalida, tente novamente!!");
        }
    }while(escolha_medo != 1 && escolha_medo != 2);

        Escreva("Viajante: Você será obrigado a derrotar Ragnar agora!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Necessário usar o seu pouco conhecimento em matématica para concluir a missão!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Derrote Ragnar agora!!!!!!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Acertando os cáculos de primeira, sua pontuação será a mais alta.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        potencia1();


    }

    //Escreva("Viajante: Ace ", TimeUnit.MILLISECONDS, temp_dialog);
    static void instrucoes() throws Exception{
        Escreva("\n\n++== Introdução ao Jogo ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Bem-vindo ao Math Adventure, um mundo de coragem, sabedoria e força. Neste jogo RPG,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("você embarcará em uma jornada épica para encontrar e reunir as três Jóias de fortalecimento: a Pedra da\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Sabedoria, a Jóia da Coragem e a Jóia da Força. Cada Jóia é guardada por poderosos desafios\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("e inimigos, e só os mais bravos heróis conseguirão restaurar a harmonia e prosperidade ao reino.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Objetivo do Jogo ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O objetivo principal do jogo é encontrar as três Jóias e uni-las em sua espada para seu fortalecimento.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Para isso, você precisará explorar diferentes partes do reino, resolver contas matemáticas, lutar contra\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("inimigos, e superar desafios mortais acumulando pontuação no final.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Exploração do Reino ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O reino de Math Adventure é vasto e cheio de locais misteriosos e perigosos. Você precisará explorar\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("florestas densas, montanhas traiçoeiras, cidades antigas e masmorras escuras.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Tipos de Missões ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Sabedoria (AZUL): Relacionado diretamente com cálculos de Potenciação.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Coragem (AMARELA): Relacionado diretamente com cálculos de Equações.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Jóia da Forçã (VERMELHA): Relacionado diretamente com cálculos de Polinômios.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Combate ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O combate é uma parte essencial do jogo. Enfrente os anciões acertando cálculos matemáticos, sendo necessário habilidades e estratégias.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Conclusão ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Encontre e reúna as Jóias perdidas do fortalecimento para restaurar a paz e a harmonia no reino. Sua sabedoria,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("coragem e força serão testadas a cada passo da jornada.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        
    }

    static void creditos() throws Exception {
        Escreva("\n\n++== DESENVOLVEDORES ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("++== Juan Batista ==++\n++== Allan Sampaio ==++\n++== Iran Vieira ==++", TimeUnit.MILLISECONDS, temp_narrativa);
    }

    // Função para exibir as opções de espadas e obter a escolha do usuário
    public static int obterEscolhaUsuario(String[] espadas) {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        while (escolha < 0 || escolha >= espadas.length) {
            System.out.println("Escolha uma espada:");
            for (int i = 0; i < espadas.length; i++) {
                System.out.println(i + ": " + espadas[i]);
            }
            System.out.print("Digite o número da espada escolhida: ");

            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                if (escolha < 0 || escolha >= espadas.length) {
                    System.out.println("Escolha inválida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        return escolha;
    }

    // Função que retorna a espada escolhida com base no índice
    public static String escolherEspada(String[] espadas, int escolha) {
        if (escolha >= 0 && escolha < espadas.length) {
            return espadas[escolha];
        }
        throw new IllegalArgumentException("Escolha inválida");
    }


    public static void main(String[] args) throws Exception {
        menu();
        /*String[] espadas = {"Espada Longa", "Espada Curta", "Espada Bastarda", "Katana", "Sabre"};
        int escolha = obterEscolhaUsuario(espadas);
        String espadaEscolhida = escolherEspada(espadas, escolha);
        System.out.println("Você escolheu: " + espadaEscolhida);*/
    }
}

