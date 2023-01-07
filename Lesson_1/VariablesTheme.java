public class VariablesTheme {
    
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1. Вывод значений переменных на консоль");
        byte cpuCore = 4; 
        short yearProd = 2022;
        int socket = 1200;
        long amount = 90000;
        float cpuFreq = 2.666f;
        double memFrec = 3.202447804575;
        char cpuLable = 'i';
        boolean isHappy = true;
        System.out.println("Количество ядер процессора - " + cpuCore);
        System.out.println("Год выпуска компьютера - " + yearProd);
        System.out.println("Сокет - " + socket);
        System.out.println("Цена, руб. - " + amount);
        System.out.println("Тактовая частота процессора, МГц. - " + cpuFreq);
        System.out.println("Тактовая частота памяти, ГГц. - " + memFrec);
        System.out.println("Индекс марки процессора Intel core - " + cpuLable);
        System.out.println("Пользователь счастлив - " + isHappy + "\n");
        
        // Task 2+
        System.out.println("Задача 2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discountSum = (int) ((penPrice + bookPrice) * 0.11);
        int discountPrice = (int) (penPrice + bookPrice - discountSum);
        System.out.println("Сумма скидки " + discountSum + " руб.");
        System.out.println("Общая стоимость товаров со скидкой " + discountPrice + " руб.\n");
        
        // Task 3
        System.out.println("Задача 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");
        
        // Task 4
        System.out.println("Задача 4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127; // -128 до 127
        short maxShort = 32767; // -32 768 до 32 767
        int maxInt = 2147483647; // -2 147 483 648 до 2 147 483 647
        long maxLong = 9223372036854775807l; // - 9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        System.out.printf("byte = %d, byte++ = %d, byte-- = %d\n", maxByte, ++maxByte, --maxByte);
        System.out.printf("short = %d, short++ = %d, short-- = %d\n", maxShort, ++maxShort, --maxShort);
        System.out.printf("int = %d, int++ = %d, int-- = %d\n", maxInt, ++maxInt, --maxInt);
        System.out.printf("long = %d, long++ = %d, \nlong-- = %d\n\n", maxLong, ++maxLong, --maxLong);
        
        // Task 5
        System.out.println("Задача 5. Перестановка значений переменных");
        int num1 = 2, num2 = 5, num3;
        System.out.println("a. C помощью третьей переменной:");
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2 + "\n");
        System.out.println("b. C помощью арифметических операций:");
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);
        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2 + "\n");
        System.out.println("с. C помощью побитовой операции ^:");
        System.out.println("Исходные значения переменных: num1 = " + num1 + "; " + "num2 = " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + "; " + "num2 = " + num2 + "\n");
        
        // Task 6
        System.out.println("Задача 6. Вывод кодов и их символов ASCII");
        char hash = '#';
        char ampersand = '&';
        char atSimbol = '@';
        char xor = '^';
        char underscore = '_';
        System.out.printf("Код\tСимвол\n");
        System.out.printf("%d\t%c\n", (int)hash, hash);
        System.out.printf("%d\t%c\n", (int)ampersand, ampersand);
        System.out.printf("%d\t%c\n", (int)atSimbol, atSimbol);
        System.out.printf("%d\t%c\n", (int)xor, xor);
        System.out.printf("%d\t%c\n\n", (int)underscore, underscore);
        
        // Task 7
        System.out.println("Задача 7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\'; 
        char slash = '/'; 
        char leftPar = '('; 
        char rightPar = ')'; 
        System.out.printf("     %s%s      \n", slash, backSlash);
        System.out.printf("    %s  %s     \n", slash, backSlash);
        System.out.printf("   %s%s%s %s%s   \n", slash, underscore, leftPar, rightPar, backSlash);
        System.out.printf("  %s      %s  \n", slash, backSlash);
        System.out.printf(" %s%s%s%s%s%s%s%s%s%s\n\n", slash, underscore, underscore, underscore, 
                underscore, slash, backSlash, underscore, underscore, backSlash);
        
        // Task 8
        System.out.println("Задача 8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int ten = number / 10 % 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.printf("\t%d сотен\n", hundred);
        System.out.printf("\t%d десятков\n", ten);
        System.out.printf("\t%d единиц\n\n", ones);
        
        // Task 9
        System.out.println("Задача 9. Вывод времени");
        int time = 86399;
        System.out.println(time / 3600 + ":" + time / 60 % 60 + ":" + time % 60 + "\n");
    }
}