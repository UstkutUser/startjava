public class MyFirstGame {
    public static void main (String[] args) {
        int hiddenNumber  = 35;
        int userNumber  = 77;
        if (userNumber > hiddenNumber) {
            System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
        }
        userNumber = userNumber - 25;
        if (userNumber > hiddenNumber) {
            System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
        }
        userNumber = userNumber - 43;
        if (userNumber < hiddenNumber) {
            System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
        }
        userNumber = userNumber * 4;
        if (userNumber > hiddenNumber) {
            System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
        }
        userNumber = userNumber - 21;
        if (userNumber < hiddenNumber) {
            System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
        }
        userNumber = userNumber + 10;
        if (userNumber < hiddenNumber) {
            System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
        }
        userNumber = userNumber + 8;
        if (userNumber < hiddenNumber) {
            System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
        }
        userNumber = userNumber + 2;
        if (userNumber == hiddenNumber) {
            System.out.println("Вы победили!");
        }        
    }
}