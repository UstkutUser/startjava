public class MyFirstGame {
    public static void main (String[] args) {
        int hiddenNumber  = 77;
        int playerNumber  = 25;
        while (playerNumber != hiddenNumber) {    
            if (playerNumber == hiddenNumber) {
                break;
            } else if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше загаданного");
                playerNumber -= 1;
            } else {
                System.out.println("Число " + playerNumber + " меньше загаданного");
                playerNumber += 1;
            }
        }
        System.out.println("Вы угадали");
    }
}