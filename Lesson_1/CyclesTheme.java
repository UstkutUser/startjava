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
        }
        if (num3 > num2) {
            max = num3;
        }
        if (num2 < num1) {
            min = num2;
        }
        if (num3 < num2) {
            min = num3;
        }
        System.out.println("max = " + max + ", " + " min = " + min);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // Task3
        System.out.println("\n\nЗадача 3: Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            System.out.print(remainder);
            sum += remainder;
            num /= 10;
        }
        System.out.println("\n" + sum);

        // Task4
        System.out.println("\nЗадача 4: Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            if (count == 5) {
                System.out.println();
                count = 0;
            }
            count++;
            System.out.printf("%4d", i);
        }
        for (int i = count; i < 5; i++) {
            System.out.printf("%4d", 0);
        }

        // Task5
        System.out.println("\n\nЗадача 5: Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int copyNumber = num;
        int countTwos = 0;
        while (num > 0) {
            int remainder = num % 10;
            if (remainder == 2) {
                countTwos++;
            }
            num /= 10;
        }
        System.out.println("Число " + copyNumber + " содержит " + countTwos +
                (countTwos % 2 == 0 ? " (четное) " : " (нечетное) ") + "количество двоек");

        // Task6
        System.out.println("\nЗадача 6: Отображение фигур в консоли");
        // прямоугольник
        for (int rowCount = 0; rowCount < 5; rowCount++) {
            for (int columnCount = 0; columnCount < 10; columnCount++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // прямоугольный треугольник
        System.out.println();
        int rowCount = 1;
        while (rowCount <= 5) {
            int columnCount = 5;
            while (columnCount >= rowCount) {
                System.out.print("#");
                columnCount--;
            }
            System.out.println();
            rowCount++;
        }

        // треугольник
        System.out.println();
        rowCount = 5;
        int columnCount = 1;
        do {
            if (rowCount < 3) {
                columnCount = rowCount;
            } else {
                columnCount = 6 - rowCount;
            }
            do {
                System.out.print("$");
            } while (--columnCount > 0);
            System.out.println();
            rowCount--;
        } while (rowCount > 0);

        // Task7
        System.out.println("\nЗадача 7: Отображение ASCII-символов");
        System.out.printf("%5s %5s \n", "Dec", "Char");
        for (int i = 1; i < 123; i++) {
            if (i > 1 && i < 48 && i % 2 != 0) {
                System.out.printf("%5d %5c\n", i, i);
            }
            if (i > 97 && i < 123 && i % 2 == 0) {
                System.out.printf("%5d %5c\n", i, i);
            }
        }

        // Task8
        System.out.println("\nЗадача 8: Проверка, является ли число палиндромом");
        num = 1234321;
        int copyNum = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Число " + copyNum + ((reverse == copyNum) ? " палиндром" : " не палиндром"));

        //Task9
        System.out.println("\nЗадача 9: Определение, является ли число счастливым");
        num = 987789;
        int firstThreeSum = 0;
        int secondThreeSum = 0;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                int firstDigit = num % 10;
                firstThreeSum += firstDigit;
                num /= 10;
            } else {
                int secondDigit = num % 10;
                secondThreeSum += secondDigit;
                num /= 10;
            }
        }
        System.out.println("Сумма цифр = " + firstThreeSum + "; Сумма цифр = " + secondThreeSum);
        System.out.println((firstThreeSum == secondThreeSum) ? "счастливое число" : "несчастливое число");

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