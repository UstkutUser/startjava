import java.util.Scanner;
import java.lang.Math;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число от 0 до  100\"");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String nameOne = console.nextLine();
        Player playerOne = new Player(nameOne);

        System.out.print("Введите имя второго игрока: ");
        String nameTwo = console.nextLine();
        Player playerTwo = new Player(nameTwo);

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        String userAnswer = "yes";

        do {
            if (userAnswer.equals("yes")) {
                guessNumber.guessNumber();
            }

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            userAnswer = console.nextLine();
            if (userAnswer.equals("no")) {
                break;
            }
        } while (!userAnswer.equals("no"));
    }
}
