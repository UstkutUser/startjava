public class Calculator {
    public static void main (String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result = 0;
        char sign = '^';
        if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            if (num2 == 0) {
                System.out.println("На ноль делить нельзя");
            }
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;             // exponent
            for (int i = 0; i < num2; i++) {
                result = result * num1;
            }
        }
        else if (sign == '%') {
            result = num1 % num2;
        }
        else {
            result = num1 + num2;
        }
        System.out.println(result);
    }
}