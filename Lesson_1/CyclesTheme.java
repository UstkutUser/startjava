public class CyclesTheme {
    public static void main(String[] args) {
        // Task1
        System.out.println("\nЗадача 1: Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        }
        while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        // Task2
        System.out.println("\nЗадача 2: Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num2;
        int min = num1;
        if (num1 > num2) {
            max = num1;
        } if (num2 > num1) {
            max = num2;
        } if (num3 > num2) {
            max = num3;
        } if (num1 < num2) {
            min = num1;
        } if (num2 < num1) {
            min = num2;
        } if (num3 < num2) {
            min = num3;
        }
        System.out.println("max = " + max + ", " + " min = " + min);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // Task3
        System.out.println("\n\nЗадача 3: Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            System.out.print(reminder);
            sum += reminder;
            number /= 10;
        }
        System.out.println("\n" + sum);

        // Task4
        System.out.println("\nЗадача 4: Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2, count++) {
            if (count == 5) {
                System.out.println();
                count = 0;
            }
            System.out.printf("%4d", i);
        }
        for (int i = count; i < 5; i++) {
            System.out.printf("%4d", 0);
        }

        // Task5
        System.out.println("\n\nЗадача 5: Проверка количества двоек на четность/нечетность");
        number = 3242592;
        int copyNumber = number;
        count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 2) {
                count++;
            }
            number /= 10;
        }
        System.out.println("Число " + copyNumber + " содержит " + count +
                (count % 2 == 0 ? " (четное) " : " (нечетное) ") + "количество двоек");

        // Task6
        System.out.println("\nЗадача 6: Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int c = 1;
        while (c <= 5) {
            int d = 5;
            while (d >= c) {
                System.out.print("#");
                d--;
            }
            System.out.println();
            c++;
        }

        int e = 1;
        do {
            int f = 0;
            do {
                System.out.print("$");
                f++;
            } while (f < e);
            e++;
            System.out.println();
        } while (e < 4);

        do {
            int k = 6;
            do {
                System.out.print("$");
                k--;
            } while (k > e);
            e++;
            System.out.println();
        } while (e < 6);

        // Task7
        System.out.println("\nЗадача 7: Отображение ASCII-символов");
        System.out.printf("%5s", "Dec");
        System.out.printf("%5s", "Char");
        System.out.println();
        for (int i = 1; i < 48; i += 2) {
            for (int j = 1; j <= 1; j++) {
                System.out.printf("%5d", i);
                for (int k = 1; k <= 1; k++) {
                    System.out.printf("%5c", (char)i);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("%5s", "Dec");
        System.out.printf("%5s", "Char");
        System.out.println();
        for (int i = 98; i < 123; i += 2) {
            for (int j = 1; j <= 1; j++) {
                System.out.printf("%5d", i);
                for (int k = 1; k <= 1; k++) {
                    System.out.printf("%5c", (char)i);
                }
            }
            System.out.println();
        }

        // Task8
        System.out.println("\nЗадача 8: Проверка, является ли число палиндромом");
        int num = 1234321;
        int firstNum = num;
        int rev = 0;
        int lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        System.out.println("Число " + firstNum + ((rev == firstNum) ? " палиндром" : " не палиндром"));

        //Task9
        System.out.println("\nЗадача 9: Определение, является ли число счастливым");
        int number1 = 798789;
        int digit1;
        int digit2;
        int res1 = 0;
        int res2 = 0;
        for (int i = 1; i <= 3; i++) {
            digit1 = number1 % 10;
            res1 += digit1;
            number1 /= 10;
        }
        for (int i = 1; i <= 3; i++) {
            digit2 = number1 % 10;
            res2 += digit2;
            number1 /= 10;
        }
        System.out.println("Сумма цифр 'abc' = " + res1 + "; Сумма цифр 'def' = " + res2);
        System.out.println((res1 == res2) ? "счастливое число" : "несчастливое число");

        //Task10
        System.out.println("\nЗадача 10: Вывод таблицы умножения Пифагора");
        System.out.printf("%S%n", "          таблица пифагора");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("%n");
        for (int i = 2; i <= 10; i++) {
            System.out.printf("----");
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * i);
            }
            System.out.println();
        }
    }
}