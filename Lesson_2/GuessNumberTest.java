import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число от 0 до  100\"");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name = console.nextLine();
        Player player1 = new Player(name);

        System.out.print("Введите имя второго игрока: ");
        name = console.nextLine();
        Player player2 = new Player(name);

        GuessNumber game = new GuessNumber(player1, player2);

        String playerAnswer = "yes";

        do {
            if (playerAnswer.equals("yes")) {
                game.start();
            }

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = console.nextLine();
            
        } while (!playerAnswer.equals("no"));
    }
}