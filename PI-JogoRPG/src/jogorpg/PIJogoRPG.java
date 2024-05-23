package jogorpg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class PIJogoRPG {


    //ajuste a velocidade dos caracteres impressos
    //static int temp_dialog = 60,  temp_narrativa = 20;
    static int temp_dialog = 0, temp_narrativa = 0;

    public static void Escreva(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Menu completo do jogo
    static int menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_opcao;
        int pontos = 0;

        do {
            Escreva("\n++========================++", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("\n....: Math Adventure :.... \n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("++========================++\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_opcao = entrada.nextInt();

            if (escolha_opcao == 1) {
                jogo();
                pontos += capitulo1();
                pontos += capitulo2();
                pontos += capitulo3();
                return pontos;

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

        return pontos;
    }

    //Perguntas do jogo

    public static int treino1() throws Exception{
        Scanner entrada = new Scanner(System.in);
        Escreva("Boa Ace, agora você vai aprender um pouco sobre potenciação para conseguir a sua primeira joia!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("A potenciação é uma operação matemática. Utilizamos a potenciação para indicar multiplicações consecutivas de um mesmo fator. Por exemplo,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("3^5 representa 5 multiplicações do número 3, o que resulta em 243. Dizemos que 3 é a base, 5 é o expoente e 243 é a potência.\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("Principais propriedades da potenciação:\n x^m . x^n = x^m+n \n x^m / x^n = x^m-n \n (x^m)^n = x^m.n \n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("77435");
        alternativas.add("78125");//correta
        alternativas.add("15625");
        alternativas.add("390625");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o resultado de 5^3 . 5^4?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("78125")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontos + "!");
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        System.out.println("Parabéns, você concluiu o treino!!");

        return pontos;

    }

    public static int potencia1() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("156.250");
        alternativas.add("390.625");//correta
        alternativas.add("234.375");
        alternativas.add("312.500");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontos + "!");
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }


        return pontos;
    }

    public static int potencia2() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("x^6");//correta
        alternativas.add("x^4");
        alternativas.add("x^2");
        alternativas.add("x^10");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }


    public static int treino2() throws Exception{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Equações de 1 grau: ");
        Escreva("As equações de primeiro grau são sentenças matemáticas que estabelecem relações de igualdade entre termos conhecidos e desconhecidos, representadas sob a forma: ax+b = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("O objetivo de resolver uma equação de primeiro grau é descobrir o valor desconhecido, ou seja, encontrar o valor da incógnita que torna a igualdade verdadeira.\nPara isso, deve-se isolar os elementos desconhecidos em um dos lados do sinal de igual e os valores constantes do outro lado. Contudo, é importante observar que a mudança de posição desses elementos deve ser feita de forma que a igualdade continue sendo verdadeira. Quando um termo da equação mudar de lado do sinal de igual, devemos inverter a operação. Assim, se tiver multiplicando, passará dividindo, se tiver somando passará subtraindo e vice-versa.\n", TimeUnit.MILLISECONDS, temp_dialog);

        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        boolean acertou = false;
        int tentativas = 0;
        int pontos = 0;
        int pontosTreino;

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("1");//correta
        alternativas.add("3");
        alternativas.add("4");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Qual o valor da incógnita x que torna a igualdade 8x - 3 = 5 verdadeira?");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("1")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontosTreino = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontosTreino + "!");
        } else if (tentativas > 1 && tentativas <= 3) {
            pontosTreino = 50;
        } else {
            pontosTreino = 20;
        }


        pontos += pontosTreino;

        System.out.println();
        System.out.println("Equações de 2 grau: ");
        Escreva("A equação do segundo grau recebe esse nome porque é uma equação polinomial cujo termo de maior grau está elevado ao quadrado. Também chamada de equação quadrática, é representada por:\r\n" + //
                        "\r\n" + //
                        "ax² + bx + c = 0\r\n" + //
                        "\r\n" + //
                        "Numa equação do 2º grau, o x é a incógnita e representa um valor desconhecido. Já as letras a, b e c são chamadas coeficientes da equação.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Resolver uma equação de segundo grau, significa determinar os valores reais de x, que tornam a equação verdadeira. Esses valores são denominados raízes da equação.\n", TimeUnit.MILLISECONDS, temp_dialog);

        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        int tentativas2 = 0;
        int pontosTreino2 = 0;
        boolean acertou2= false;

        List alternativas2 = new ArrayList();
        alternativas2.add("x = 10/4 e x = 2");
        alternativas2.add("x = 5/2 e x = - 1");//correta
        alternativas2.add("x = 20 e x = 4");
        alternativas2.add("x = 15/3 e x = 1");


        do {
            tentativas2 = tentativas2 + 1;
            Collections.shuffle(alternativas2);
            System.out.println("Determine as raízes da equação 2x² - 3x - 5 = 0");
            System.out.println("a) " + alternativas2.get(0));
            System.out.println("b) " + alternativas2.get(1));
            System.out.println("c) " + alternativas2.get(2));
            System.out.println("d) " + alternativas2.get(3));

            System.out.print("Escolha uma alternativa: ");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas2.get(0).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas2.get(1).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas2.get(2).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas2.get(3).equals("x = 5/2 e x = - 1")) {
                        System.out.println("Resposta correta!");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");


            }

        } while (!acertou2);
        if (tentativas2 <= 1) {
            pontosTreino2 = 100;
            System.out.println("Boa guereirro você acertou de primeira, você ganhou " + pontosTreino2 + "!");
        } else if (tentativas2 > 1 && tentativas2 <= 3) {
            pontosTreino2 = 50;
        } else {
            pontosTreino2 = 20;
        }


        pontos += pontosTreino2;
        System.out.println("Parabéns, você concluiu o treino!!");
        return pontos;

    }

    public static int equacao1grau() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("2");
        alternativas.add("6");//correta
        alternativas.add("3");
        alternativas.add("5");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    public static int equacao2grau() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("-5");
        alternativas.add("-4");//correta
        alternativas.add("0");
        alternativas.add("-1");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }


    public static int treino3()throws Exception{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Polinômios: ");
        Escreva("Um polinômio é uma expressão matemática formada por uma soma de termos, onde cada termo é composto por um número (chamado coeficiente) multiplicado por uma variável (geralmente x) elevada a uma potência não negativa (um número inteiro).\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Exemplo: \n(2x² + 3x + 1) + (x² - 2x + 4) = 3x² + x + 5\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        

        Escreva("Agora teste o seu conhecimento com um exemplo:\n\n", TimeUnit.MILLISECONDS, temp_narrativa);


        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("-3y² + 16y - 6");
        alternativas.add("-2y² + 16y - 6");//correta
        alternativas.add("-2y² + 10y + 6");
        alternativas.add("-2y² + 12y - 4");


        do {
            tentativas = tentativas + 1;
            Collections.shuffle(alternativas);
            System.out.println("Resolva: (y² + 4y - 5) + (-3y² + 12y - 1):");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));

            System.out.print("Escolha uma alternativa: ");
            String resposta = entrada.next();


            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas.get(0).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "b":
                case "B":
                    if (alternativas.get(1).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "c":
                case "C":
                    if (alternativas.get(2).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas.get(3).equals("-2y² + 16y - 6")) {
                        System.out.println("Resposta correta!");
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");


            }

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        System.out.println("Parabéns, você concluiu o treino!!");
        return pontos;
    }

    public static int polinomios1() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("5");
        alternativas.add("4");//correta
        alternativas.add("3");
        alternativas.add("2");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
            pontos = 20;
        }
        return pontos;
    }

    public static int polinomios2() {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int tentativas = 0;
        int pontos;

        List alternativas = new ArrayList();
        alternativas.add("6x³ + 4x² - 3x + 1");
        alternativas.add("6x³ + 12x² - 9x + 3");//correta
        alternativas.add("2x² + 8x² - 5x + 3");
        alternativas.add("12x³ + 3x² - 3x + 1");


        do {
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

        } while (!acertou);
        if (tentativas <= 1) {
            pontos = 100;
        } else if (tentativas > 1 && tentativas <= 3) {
            pontos = 50;
        } else {
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
        Escreva("Pai: A primeira jóia, regida por um fulgor azul, representa a sabedoria. Quem a possuísse adquirirá uma vasta sabedoria sobre o mundo.\n", TimeUnit.MILLISECONDS, temp_dialog);
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
        do {
            Escreva("Pai: Pois bem! Após a criação de sua espada quero que você vá atrás das jóias pela honra de nossa família!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Escreva("1 - Mas parece muito perigoso...\n2 - Já nasci pronto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_3 = entrada.nextInt();

            switch (escolha_3) {
                case 1:
                    Escreva("Ace: Eu sou muito novo para enfrentar esse tipo de desafio! argh\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Na vida precisamos enfrentar desafios para um bem maior...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Esta jornada fará você ficar mais sábio, corajoso e forte...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Pai: Você irá me dar muito orgulho indo ...\n", TimeUnit.MILLISECONDS, temp_dialog);

                case 2:
                    Escreva("Ace: Mas como vou ter as instruções certas?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolha_3 != 1 && escolha_3 != 2);

        Escreva("Pai: O VIAJANTE (pássaro) é quem pode te instruir em tudo o que precisa, deixarei você nas mãos dele...!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Sabendo que você quer dar orgulho para o seu pai, siga minhas instruções!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Ao norte de Math adventure, é onde a Jóia da sabedoria está sendo guardada por Ragnar, você precsará tomar muitos cuidados..\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Será necessário muita estratégia e conhecimento para derrota-lo, já que você possui uma espada básica!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vá em busca da jóia e eu te darei mais instruções...\n\n", TimeUnit.MILLISECONDS, temp_dialog);

    }

    static int capitulo1() throws Exception {
        //Capitulo 1
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;

        Escreva("++== A JÓIA DA SABEDORIA ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace vai em direção ao Norte, atrás da pedra da sabedoria...\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Ei, viajante... Estou chegando próximo de algo diferente do que eu já havia visto antes!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Me parece um covil, estou na direção certa?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Não se assuste Ace, será necessário entrar dentro deste covil para que possa pegar a jóia.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace após entrar no covil, encontra-se de cara com Ragnar tirando uma soneca...AAUF AAUF\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_entrar;

        do {
            Escreva("1 - Pegar a jóia escondido enquanto Ragnar dorme.\n2 - Derrotar Ragnar enquanto dorme.\n", TimeUnit.MILLISECONDS, temp_dialog);
            escolha_entrar = entrada.nextInt();

            if (escolha_entrar == 1) {
                Escreva("Ace: Nunca imaginei estar em um lugar desses, preciso de coragem\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...rs\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            } else if (escolha_entrar == 2) {
                Escreva("Ace: Enquanto ele dorme é minha melhor oportunidade de derrotá-lo\n", TimeUnit.MILLISECONDS, temp_dialog);
                Escreva("Ace: Vou no estilo furtivo, Ragnar não parece fazer acordos...rs\n\n", TimeUnit.MILLISECONDS, temp_dialog);
            } else {
                Escreva("hm... essa opção não conheço, mas escolha alguma correspondente:\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha_entrar != 1 && escolha_entrar != 2);
        Escreva("Viajante: Ace, você precisa ser rápido, pois ele pode acordar a qualquer momento...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace fica muito apreensivo e acelera o passo no estilo furtivo\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Estava com tanto medo que não olhou ao seu redor... Tropeçou e caiu..PUFFFF\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_medo;

        do {
            Escreva("Ragnar acorda furioso com o extremo barulho feito por Ace e vai em direção à ele\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Correr como se não ouvesse o amanhã.\n2 - Enfrentar Ragnar.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha_medo = entrada.nextInt();

            if (escolha_medo > 0 && escolha_medo <= 2) {
                switch (escolha_medo) {
                    case 1:
                        Escreva("Ace Corre desesperadamente e novamente cai..PUFFF\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                        break;
                    case 2:
                        Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                        break;
                }
            } else {
                System.out.println("Entrada invalida, tente novamente!!");
            }
        } while (escolha_medo != 1 && escolha_medo != 2);

        Escreva("Viajante: Você será obrigado a derrotar Ragnar agora!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Necessário usar o seu pouco conhecimento em matématica para concluir a missão!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Derrote Ragnar agora!!!!!!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Acertando os cáculos de primeira, sua pontuação será a mais alta.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        pontos += potencia1();

        Escreva("Viajante: Boa Ace!!!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***RAGNAR CAI DESACORDADO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Viajante??? Será que consegui derrotá-lo de primeira???\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Ele não se mexe, não achei que seria fácil assim...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Agora posso pegar a jóia tranquilamente..UFFSS\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE VAI EM DIREÇÃO A JÓIA SEM SE PREOCUPAR***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***QUANDO ACE ESTAVA PRÓXIMO, RAGNAR ACORDA E O ATACA, IMPULSIONANDO-O PARA LONGE DA JÓIA***\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("***ACE FICA DESACORDADO POR UM MOMENTO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Ace!!!! Acorda, O Ragnar ainda esta de pé... Muito mais furioso, acerte a próxima questão para finaliza-lo!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE SEM FORÇAS SE LEVANTA E TENTA SUA ULTIMA QUESTÃO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

        pontos += potencia2();

        Escreva("Viajante: Essa foi por pouco... aparentemente estava fácil...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Creio que os próximos desafios ficarão mais difíceis\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Agora pegue a jóia da sabedoria, levaremos conosco...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Você vai precisar forjar essa pedra em sua espada, para que consiga derrotar o próximo ancião!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolha;
        int contador = 1;

        do {
            Escreva("COMO DESEJA FORJAR SUA ESPADA?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Forjar igual seu pai ensinou.\n2 - Forjar de qualquer jeito.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Ace: É... Forjar como meu pai ensinou, é o melhor método!!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Muita eficiência na hora de forjar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("PROCESSO DE FORJAMENTO CONCLUÍDO COM SUCESSO!!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;

                case 2:
                    Escreva("PROCESSO DE FORJAMENTO FALHOU!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    Escreva("Ace: Eu vou tentar novamente, esse método funciona também!! Grrr...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace forjou " + contador++ + " vez (s) e falhou.\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    if (contador == 3) {
                        Escreva("A JÓIA VAI SE DESFAZER SE CONTINUAR FORJANDO NESSE MÉTODO.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    }
                    if (contador >= 5)
                        Escreva("A ESPADA NÃO VAI SERVIR MAIS CASO CONTINUE...\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha != 1);

        Escreva("Viajante: Essa espada faz parte de você agora, jamais à perca!!", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Caso caia nas mãos de pessoas erradas, causará grandes problemas....", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Com essa jóia fincada em sua espada, a sabedoria te perseguirá!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Verdade, me sinto mais sábio e confiante!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Meu pai sentirá orgulho quando eu retornar dessa jornada!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        return pontos;

    }


    public static int capitulo2() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        int escolha;

        Escreva("++== A JÓIA DA CORAGEM ==+\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Recebi uma notícia que seu pai não está muito bem de saúde...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Caso queira dar orgulho para ele através desse feito, precisamos ir para a próxima etapa rápidamente!\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("1 - Como assim?! Ele estava tão bem...\n2 - Quanto tempo de vida ele tem? Vou terminar essa jornada antes!!\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Escreva("Viajante: Infelizmente seu pai já é um senhor de idade...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Ele esta passando por uns problemas de saúde graves e esta debilitado...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Quanto tempo de vida ele tem? Preciso honra-lo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolha != 1 && escolha != 2);

        Escreva("Viajante: Seu pai tem 3 dias de vida apenas...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Só isso?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Sim, infelizmente...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Você vai precisar usar sua sabedoria para enfrentar tudo isso...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Vamos em busca da Jóia da Coragem para encorajá-lo concluir a jornada contra o tempo!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaSeguir;

        do {
            Escreva("1 - Agora desânimei de seguir em frente...\n2 - Me conta mais sobre a história dessa jóia...\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaSeguir = entrada.nextInt();

            switch (escolhaSeguir) {
                case 1:
                    Escreva("Viajante: Lembra do que seu pai te disse?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Ele quer ser honrado por você...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Mesmo diante destas circunstâncias que vem ocorrendo...\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: É necessário sabedoria para lidar, pois caso você desista, será só mais um derrotado!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Você precisa seguir em frente!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva(" ", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolhaSeguir != 2);

        Escreva("Viajante: A jóia da coragem possuí um brilho amarelo e expele uma aura de valentia...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajane: Aquele que a possuir, encontrará coragem infinita\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Capaz de enfrentar os desafios mais temíveis sem recuar\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Protegido por um ancião chamado Orex, que acredita na justiça e no poder do heroísmo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Grande história... Mas eu não tenho muito tempo...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Me diga para onde devo ir!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Esta jóia esta protegida no leste subterraneo\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Será necessário muito empenho para percorrer este percurso\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Utilizarei da minha sabedoria para chegar lá!!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***1° DIA DE 3***", null, escolhaSeguir);
        int escolhaCaminho;

        do {
            Escreva("DESEJA IR POR QUAL CAMINHO?", TimeUnit.MILLISECONDS, temp_narrativa);
            Escreva("1 - Mais difícil.\n2 - Mais fácil.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaCaminho = entrada.nextInt();

            switch (escolhaCaminho) {
                case 1:
                    Escreva("Viajante: Talvez essa não seja a melhor escolha...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Por que?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Percorrer pelo caminho mais difícil fará você se desgastar mais,\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Estará muito mais cansado, sem contar que é mais longe...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: É... Você tem razão! Não tenho tempo para percorrer caminhos mais longos, necessito achar outro jeito!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Preciso que me guie para encontrar o caminho mais rápido, meu tempo esta contado...\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                    break;
            }
        } while (escolhaCaminho != 1 && escolhaCaminho != 2);

        Escreva("Viajante: Conheço uma trilha considera perigosa...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Mas é a alternativa mais rápida que você vai ter!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Não tenho outra escolha a não ser esta! Af...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE LEVOU MUITAS HORAS PARA CHEGAR PRÓXIMO AO DESTINO...\n\n***", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Mesmo pelo pior caminho, estou exausto, preciso descansar...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        int escolhaDescanso;

        do {
            Escreva("1 - Descansar.\n2 - Continuar mesmo assim.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaDescanso = entrada.nextInt();

            switch (escolhaDescanso) {
                case 1:
                    Escreva("Viajante: Tem certeza que deseja descansar?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: O tempo é curto, lembra do seu prósito aqui!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Você terá muito tempo para descansar quando terminar a jornada!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Utilizarei da minha sabedoria para seguir em frente, meu propósito é maior!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolhaDescanso != 1 && escolhaDescanso != 2);

        Escreva("***ACE CHEGA NA ENTRADA DO SUBTERRANEO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: É escuro assim mesmo? Não sei se quero entrar...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Mais sinto que não estou sendo sábio o suficiente para tomar decisões...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Coloque na sua cabeça apenas o propósito de tudo isso que esta acontecendo! Não irei repetir novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Pense positivo e tudo dará certo!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Vou entrar e terminar o que eu vim fazer!! Grr\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE ENTRA NO SUBTERRANEO E FICA SURPRESO***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Como assim o ancião não está aqui protegendo-a\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Ace: Serei o mais rápido dessa vez, para não levantar muitas suspeitas...\n\n", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE APÓS PEGAR A JÓIA DA CORAGEM...***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Viajante: Cuidado Ace, tem alguém na saída, me parece estranho\n\n", TimeUnit.MILLISECONDS, temp_dialog);

        do {
            Escreva("1 - Se esconder.\n2 - Averiguar o que esta acontecendo.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            escolhaDescanso = entrada.nextInt();

            switch (escolhaDescanso) {
                case 1:
                    Escreva("Viajante: Onde vai se esconder aqui?\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Viajante: Acha mesmo que o Orex não conhece todos os cantos deste subterraneo?\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    Escreva("Ace: Mas minha sabedoria é maior que a dele, jamais me pegará aqui!! *Risos\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;

                case 2:
                    Escreva("Ace: Mesmo com medo, vou em frente, sinto que é a escolha mais sábia!!\n\n", TimeUnit.MILLISECONDS, temp_dialog);
                    break;
            }
        } while (escolhaCaminho != 1 && escolhaCaminho != 2);

        Escreva("***ANTES DE ACE TENTAR FAZER ALGO, OREX ENTRA RÁPIDAMENTE E O PEGA***", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Viajante o que eu faço agora??? Me ajuda!!!!!", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("Viajante: Use sua sabedoria para lidar com este momento!!", TimeUnit.MILLISECONDS, temp_dialog);
        Escreva("***ACE PENSA NO QUE FAZER***", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Ace: Já sei!!!! utilizarei o ataque da equação!!", TimeUnit.MILLISECONDS, temp_dialog);

        pontos += equacao1grau();

        // mais historia

        pontos += equacao2grau();

        return pontos;
    }

    public static int capitulo3() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;

        // mais historia
        pontos += polinomios1();

        // mais historia

        pontos += polinomios2();

        return pontos;
    }


    //Escreva("Viajante: Ace ", TimeUnit.MILLISECONDS, temp_dialog);
    static void instrucoes() throws Exception {
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
        Escreva("Jóia da Força (VERMELHA): Relacionado diretamente com cálculos de Polinômios.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Combate ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("O combate é uma parte essencial do jogo. Enfrente os anciões acertando cálculos matemáticos, sendo necessário habilidades e estratégias.", TimeUnit.MILLISECONDS, temp_narrativa);

        Escreva("\n\n++== Conclusão ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("Encontre e reúna as Jóias perdidas do fortalecimento para restaurar a paz e a harmonia no reino. Sua sabedoria,\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("coragem e força serão testadas a cada passo da jornada.\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

    }

    static void creditos() throws Exception {
        Escreva("\n\n++== DESENVOLVEDORES ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Escreva("++== Juan Batista ==++\n++== Allan Sampaio ==++\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
    }

    



    public static void main(String[] args) throws Exception {
        int pontosJogador;
        pontosJogador = menu();
        System.out.println("Pontos do jogador: " + pontosJogador);
       
    }
}

