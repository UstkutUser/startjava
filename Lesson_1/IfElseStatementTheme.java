public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Task1
        System.out.println("Задача 1: Перевод псевдокода на язык Java");
        int age = 35;
        float height = 1.85f;
        char firstLetterName = "Gennady".charAt(0);
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
        int num3 = 0;
        if (num3 != 0) {
            if (num3 % 2 == 0) {
                System.out.println("Введено четное число " + num3);
            } else {
                System.out.println("Введено нечетное число " + num3);
            } 
            if (num3 > 0) {
                System.out.println("Введенное число " + num3 + " положительное");
            } else {
                System.out.println("Введенное число " + num3 + " отрицательное");
            }
        } else {
            System.out.println("Введено число 0");
        }

        // Task4
        System.out.println("\nЗадача 4: Поиск одинаковых цифр в числах");
        int num4 = 645;
        int num5 = 728;
        int num4Ones = num4 % 10;
        int num4Tens = num4 % 100 / 10;
        int num4Hundred = num4 / 100;
        int num5Ones = num5 % 10;
        int num5Tens = num5 % 100 / 10;
        int num5Hundred = num5 / 100;
        System.out.println("Введены числа " + num4 + " " + num5);
        if (num4Ones != num5Ones && num4Tens != num5Tens && num4Hundred != num5Hundred) {
            System.out.println("Равных цифр в числах нет");
        } else { 
            if (num4Ones == num5Ones) {
                System.out.println("Первый разряд чисел равен " + num4Ones);
            }
            if (num4Tens == num5Tens) {
                System.out.println("Второй разряд чисел равен " + num4Tens);
            }
            if (num4Hundred == num5Hundred) {
                System.out.println("Третий разряд чисел равен " + num4Hundred);
            }
        }

        // Task5
        System.out.println("\nЗадача 5: Определение символа по его коду");
        char symbol = '\u0057';
        String type;
        if (symbol >= 'a' && symbol <= 'z') {
            type = "буква";
        } else if (symbol >= 'A' && symbol <= 'Z') {
            type = "большая буква";
        } else if (symbol >= 0 && symbol <= 9) {
            type = "число";
        } else {
            type = "не буква и не число";
        }
        System.out.println("Символ " + symbol + " " + type);

        // Task6
        System.out.println("\nЗадача 6: Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        float interest = 0.07f;
        float interestSumm = deposit * interest;
        float amount = interest * deposit + deposit;
        if (deposit < 100000) {
            interest = 0.05f;
        } else if (deposit > 300000) { 
            interest = 0.1f; 
        }
        System.out.println("Сумма вклада " + deposit + " руб.");
        System.out.println("Начисленный процент " + interestSumm + " руб.");
        System.out.println("Итоговая сумма с % " + amount + " руб.");

        // Task7
        System.out.println("\nЗадача 7: Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        float historyMark = 2.0f;
        float programmingMark = 4.0f;        
        if (historyPercent > 91) {
            historyMark = 5;
        } else if (historyPercent > 73 && historyPercent <= 91) {  
            historyMark = 4;  
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;            
        }
        
        if (programmingPercent <= 60) {
            programmingMark = 2;
        } else if (programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 91) {
            programmingMark = 5;
        }
        float averageMark = (historyMark + programmingMark) / 2;
        float averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("История " + historyMark);
        System.out.println("Программирование " + programmingMark);
        System.out.println("Средний балл " + averageMark);
        System.out.println("Средний % по предметам " + averagePercent);

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
        int inside100 = 10;
        int inside10 = 5;
        int inside1 = 50;
        int needAmount = 567;
        int out100;
        int out10;
        int need100 = needAmount / 100; // 5
        int need10 = needAmount / 10 % 10; // 6
        int need1 = needAmount % 10; // 7
        int out1;
        int defic100 = need100 - inside100;
        int defic10 = need10 - inside10;

        System.out.println("Требуется выдать " + needAmount + " USD");

        if (need100 >= inside100 && need10 >= inside10 && need1 >= inside1) {
            out100 = need100;
            out10 = need10;
            out1 = need1;
            if ((out100 + out10 + out1) >= (need100 + need10 + need1)) {
                System.out.println("Средств достаточно");
            }
        } else if (need100 > inside100) {
            out100 = inside100;
            out10 = need10 + defic100 * 10;
            out1 = need1;
            System.out.println("выдать " + out100 + " сотен");
            System.out.println("выдать " + out10 + " десятков");
            System.out.println("выдать " + out1 + " единиц");
            if ((out100 + out10 + out1) >= (need100 + need10 + need1)) {
                System.out.println("Средств достаточно");
            }
        } else if (need10 > inside10) {
            out100 = need100;
            out10 = inside10;
            out1 = need1 + defic10 * 10;
            System.out.println("выдать " + out100 + " сотен");
            System.out.println("выдать " + out10 + " десятков");
            System.out.println("выдать " + out1 + " единиц");
            if ((out100 + out10 + out1) >= (need100 + need10 + need1)) {
                System.out.println("Средств достаточно");
            }
        } else if (need1 > inside1 && (inside10 - need10) > inside1 * 10 && (inside10 - need10) % 10 == 0) {
            out100 = inside100;
            out10 = inside10 + need1;
            out1 = need1;
            System.out.println("выдать " + out100 + " сотен");
            System.out.println("выдать " + out10 + " десятков");
            if ((out100 + out10 + out1) >= (need100 + need10)) {
                System.out.println("Средств достаточно");
            }
        }
    }
}