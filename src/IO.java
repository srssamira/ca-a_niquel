import java.util.Scanner;

public class IO {

    public static Scanner input(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int menu() {
        System.out.println("\nJOGAR NOVAMENTE?" +
                            "\n1 - SIM" +
                            "\n2 - SAIR DO JOGO");
        return input("").nextInt();
    }

    public static int chooseDifficulty() {
        System.out.println("==============================" +
                "\nNÍVEL DE DIFICULDADE:" +
                "\n1 - FÁCIL ------------ (3 SLOTS)" +
                "\n2 - MÉDIO ------------ (6 SLOTS)" +
                "\n3 - DIFÍCIL ---------- (9 SLOTS)" +
                "\n4 - MUITO DIFÍCIL ---- (12 SLOTS)");

        return input("").nextInt();
    }
}
