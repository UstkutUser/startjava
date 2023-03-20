import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    
    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }    

    public void start() {
        while (true) {
            Scanner console = new Scanner(System.in);
            int hiddenNum = 1 + (int) (Math.random() * 1);
            System.out.print(pl1.getName() + ", введите ваше число: ");
            int number = console.nextInt();
            if (number == hiddenNum) {
                System.out.println("Победил игрок " + pl1.getName());
                break;
            } 
            if (number > hiddenNum) {
                System.out.println("Введенное число больше загаданного");
            } else {
                System.out.println("Введенное число меньше загаданного");
            }
            
            System.out.print(pl2.getName() + ", введите ваше число: ");
            number = console.nextInt();
            if (number == hiddenNum) {
                System.out.println("Победил игрок " + pl2.getName());
                break;
            } 
            if (number > hiddenNum) {
                System.out.println("Введенное число больше загаданного");
            } else {
                System.out.println("Введенное число меньше загаданного");
            }
        }
    }
}