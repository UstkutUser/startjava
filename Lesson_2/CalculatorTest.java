import java.util.Scanner;

public class CalculatorTest {    
    public static void main(String[] args) {
        String userAnswer;
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(console.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(console.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(console.nextInt());
            calculator.calculate();
            console.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = console.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));            
        } while (!userAnswer.equals("no"));        
    }
}