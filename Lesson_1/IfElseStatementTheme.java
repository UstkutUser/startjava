public class IfElseStatementTheme {
    public static void main(String[] args) {

        // Task1
        System.out.println("Задача 1: Перевод псевдокода на язык Java");
        int age = 35;
        float height = 1.85f;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20\n");
        }
        if (height < 1.80) {
            System.out.println("Невысокий рост");
        } else {
            System.out.println("Высокий рост");
        }
        char firstLetterName = "Gennady".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstLetterName);
        }

        // Task2
        System.out.println("\nЗадача 2: Поиск max и min числа");
        int num1 = 7;
        int num2 = 76;
        if (num1 > num2) {
            System.out.println("max = " + num1 + ", min = " + num2);
        } else if (num2 > num1) {
            System.out.println("max = " + num2 + ", min = " + num1);
        } else {
            System.out.println("числа равны");
        }

        // Task3
        System.out.println("\nЗадача 3: Проверка числа");
        int num3 = 26;
        if (num3 == 0) {
            System.out.println("Введено число 0");
        } if (num3 % 2 == 0) {
            System.out.println("Введено четное число " + num3);
        } else {
            System.out.println("Введено нечетное число " + num3);
        } if (num3 > 0) {
            System.out.println("Введенное число " + num3 + " положительное");
        } else {
            System.out.println("Введенное число " + num3 + " отрицательное");
        }

        // Task4
        System.out.println("\nЗадача 4: Поиск одинаковых цифр в числах");
        int num4 = 333;
        int num5 = 343;
        int num4_Ones = num4 % 10;
        int num4_Tens = num4 % 100 / 10;
        int num4_Hundred = num4 / 100;
        int num5_Ones = num5 % 10;
        int num5_Tens = num5 % 100 / 10;
        int num5_Hundred = num5 / 100;
        System.out.println("Введены числа " + num4 + " " + num5);
        if (num4_Ones == num5_Ones) {
            System.out.println("Первый разряд чисел равен " + num4_Ones);
        }
        if (num4_Tens == num5_Tens) {
            System.out.println("Второй разряд чисел равен " + num4_Tens);
        }
        if (num4_Hundred == num5_Hundred) {
            System.out.println("Третий разряд чисел равен " + num4_Hundred);
        } else {
            System.out.println("Равных цифр в числах нет");
        }

        // Task5
        System.out.println("\nЗадача 5: Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol > 'a' && symbol < 'z') {
        System.out.println("Символ " + symbol + " - маленькая буква");
        } else if (symbol > 'A' && symbol < 'Z') {
        System.out.println("Символ " + symbol + " - большая буква ");
        } else if (symbol > 0 && symbol < 10) {
        System.out.println("Символ " + symbol + " - число ");
        } else {
        System.out.println("Символ " + symbol + " - не буква и не число");
        }

        // Task6
        System.out.println("\nЗадача 6: Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        float interest;
        float amount;
        if (deposit < 100000) {
        interest = deposit * 5 / 100;
        amount = interest + deposit;
        } else if (deposit >= 100000 && deposit <= 300000) {
        interest = deposit * 7 / 100;
        amount = interest + deposit;
        } else {
        interest = deposit * 10 / 100;
        amount = interest + deposit;
        }
        System.out.println("Сумма вклада " + deposit + " руб.");
        System.out.println("Начисленный процент " + interest + " руб.");
        System.out.println("Итоговая сумма с % " + amount + " руб.");

        // Task7
        System.out.println("\nЗадача 7: Определение оценки по предметам");
        int historyPercent = 59;
        int programPercent = 91;
        float historyMark;
        float programMark;
        if (historyPercent <= 60) historyMark = 2;
        else if (historyPercent < 73) historyMark = 3;
        else if (historyPercent < 91) historyMark = 4;
        else historyMark = 5;
        if (programPercent <= 60) programMark = 2;
        else if (programPercent < 73) programMark = 3;
        else if (programPercent < 91) programMark = 4;
        else programMark = 5;
        float everageMark = (historyMark + programMark) / 2;
        float everagePercent = (historyPercent + programPercent) / 2;
        System.out.println("История " + historyMark);
        System.out.println("Программирование " + programMark);
        System.out.println("Средний балл " + everageMark);
        System.out.println("Средний % по предметам " + everagePercent);

        // Task8
        System.out.println("\nЗадача 8: Расчет прибыли за год");
        int monthRent = 5000;
        int monthCostPrice = 9000;
        int monthSale = 13000;
        int annualProfit = (monthSale - monthRent - monthCostPrice) * 12;
        if (annualProfit < 0) {
        System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else if (annualProfit > 0) {
        System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        }

        // Task9
        System.out.println("\nЗадача 9: Подсчет количества банкнот");
        int have100 = 10;
        int have10 = 5;
        int have1 = 50;
        int needAmount = 567;
        int out10;
        int out1;
        int need100 = needAmount / 100; // 5
        int need10 = needAmount / 10 % 10; // 6
        int need1 = needAmount % 10; // 7
        int defic100 = need100 - have100;
        int defic10 = need10 - have10;

        System.out.println("Требуется выдать " + needAmount + " USD");

        if (need100 > have100 && have10 > defic100 * 10 + need10 && have1 > need1) {
        out10 = have10 - defic100 * 10 - need10;
        System.out.println("выдать " + have100 + " сотен");
        System.out.println("выдать " + (have10 - out10) + " десятков");
        System.out.println("выдать " + need1 + " единиц");
        } else if (need100 < have100 && have10 < need10 && have1 > defic10 * 10 + need1) {
        out1 = defic10 * 10 + need1;
        System.out.println("выдать " + need100 + " сотен");
        System.out.println("выдать " + have10 + " десятков");
        System.out.println("выдать " + out1 + " единиц");
            /*
            обратный расчет
             */
        System.out.print("Итого выдать ");
        System.out.print(need100 * 100 + have10 * 10 + out1);
        System.out.print(" USD");
        } else if (need100 < have100 && have10 < defic100 * 10 + need10 && have1 > defic10 * 10 + need1) {
        out1 = defic10 * 10 + need1;
        System.out.println("выдать " + have100 + " сотен");
        System.out.println("выдать " + have10 + " десятков");
        System.out.println("выдать " + out1 + " единиц");
        }
    }
}