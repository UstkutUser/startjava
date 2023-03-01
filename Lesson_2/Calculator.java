public class Calculator {    
    private int number1;
    private char operation;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void calculate() {
        int result = 1;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;               
            case '-':
                result = number1 - number2;
                break;        
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
        }
        System.out.println("Первое число " + number1 + " второе число " + number2 + 
                " результат " + result);
    }
}