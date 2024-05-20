package Teste;
import java.util.Scanner;

public class EscolhaEspada {
    public static void main(String[] args) {
        String[] espadas = {"Espada Longa", "Espada Curta", "Espada Bastarda", "Katana", "Sabre"};
        int escolha = obterEscolhaUsuario(espadas);
        String espadaEscolhida = escolherEspada(espadas, escolha);
        System.out.println("Você escolheu: " + espadaEscolhida);
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
}

