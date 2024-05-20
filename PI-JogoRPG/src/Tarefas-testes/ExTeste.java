import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExTeste {
        
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

    public static void jogo(){
        int pontos = 100;
        int ex1 = polinomios2();
        pontos = ex1 + pontos;
        System.out.println(ex1);
        System.out.println(pontos);
    }



    public static void main(String[] args) {
        jogo();
    }
}
