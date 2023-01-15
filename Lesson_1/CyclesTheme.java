public class CyclesTheme {
    public static void main(String[] args) {
        // Task1
        System.out.println("\nЗадача 1: Подсчет суммы четных и нечетных чисел");
        int evenSumm = 0;
        int oddSumm = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                evenSumm = evenSumm + i;
            } else {
                oddSumm = oddSumm + i;
            }
            i++;
        }
        while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenSumm + ", а нечетных = " + oddSumm);

        // Task2
        System.out.println("\nЗадача 2: Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2 && num1 > num3 && num2 < num3) {
            max = num1;
            min = num2;
        } else if (num1 > num2 && num1 > num3 && num3 < num2) {
            max = num1;
            min = num3;
        } else if (num2 > num1 && num2 > num3 && num3 < num1) {
            max = num2;
            min = num3;
        } else if (num2 > num1 && num2 > num3 && num1 < num3) {
            max = num2;
            min = num1;
        } else if (num3 > num1 && num3 > num2 && num2 < num1) {
            max = num3;
            min = num2;
        } else {
            max = num3;
            min = num1;
        }
        System.out.println("max = " + max + ", " + " min = " + min);
        for (int x = max; x >= min; x--) {
            System.out.print(x + " ");
        }

        // Task3
        System.out.println("\n\nЗадача 3: Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        int newNumber;
        while (number > 0) {
            newNumber = number % 10;
            System.out.print(newNumber);
            sum = sum + newNumber;
            number = number / 10;
        }
        System.out.println("\n" + sum);

        // Task4
        System.out.println("\nЗадача 4: Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int k = 1; k < 24; k += 2, count++) {
            if (count == 5) {
                System.out.println();
                count = 0;
            }
            System.out.printf("%4d", k);
        }
        for (int k = count; k < 5; k++) {
            System.out.printf("%4d", 0);
        }

        // Task5
        System.out.println("\n\nЗадача 5: Проверка количества двоек на четность/нечетность");
        int newNum = 3242592;
        int initialNum = newNum;
        int digit;
        int sum1 = 0;
        while (newNum > 0) {
            digit = newNum % 10;
            if (digit == 2) {
                sum1++;
            }
            newNum = newNum / 10;
        }
        System.out.println("Число " + initialNum + " содержит " + sum1 +
                (sum1 % 2 == 0 ? " (четное) " : " (нечетное) ") + "количество двоек");

        // Task6
        System.out.println("\nЗадача 6: Отображение фигур в консоли");
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 10; b++) {
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
        for (int x = 1; x < 48; x += 2) {
            for (int y = 1; y <= 1; y++) {
                System.out.printf("%5d", x);
                for (int z = 1; z <= 1; z++) {
                    System.out.printf("%5c", (char)x);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("%5s", "Dec");
        System.out.printf("%5s", "Char");
        System.out.println();
        for (int p = 98; p < 123; p += 2) {
            for (int q = 1; q <= 1; q++) {
                System.out.printf("%5d", p);
                for (int r = 1; r <= 1; r++) {
                    System.out.printf("%5c", (char)p);
                }
            }
            System.out.println();
        }
    }
}