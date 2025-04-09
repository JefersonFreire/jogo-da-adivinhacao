import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int qtdTentativas = 0;

        System.out.println("""
                Seja bem-vindo ao jogo da adivinhação.
                Escolha um número entre 0 e 100.
                Você terá 5 tentativas, boa sorte!        
                """);

        while (qtdTentativas < 5) {
            System.out.println("Digite o número escolhido: ");
            int numeroInserido = sc.nextInt();
            qtdTentativas++;

            if (numeroInserido == numeroAleatorio) {
                System.out.println("Você acertou! O número sorteado é " + numeroAleatorio + ".");
                break;
            } else if(qtdTentativas < 5){
                if(numeroInserido < numeroAleatorio){
                System.out.println("O número sorteado é maior que o escolhido, tente novamente!");
                }else {
                    System.out.println("O número sorteado é menor que o escolhido, tente novamente!");
                }
            }else {
                System.out.println("Você falhou! Limite de tentativas atingido!");
                break;
            }
        }
    }
}
