import java.util.Scanner;
public class CalculatorTest {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String check;
        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(console.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(console.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(console.nextInt());
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                check = console.nextLine();
            }
            while (!check.equals("yes") && !check.equals("no"));
        }
        while (!check.equals("no"));
    }
}