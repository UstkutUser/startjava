public class MyFirstGame {
    public static void main (String[] args) {
        int hiddenNumber  = 52;
        int playerNumber  = 77;
        while (true) {    
            if (playerNumber == hiddenNumber) {
                System.out.println("Вы угадали");
                break;
            } else if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше загаданного");
            } else {
                System.out.println("Число " + playerNumber + " меньше загаданного");
            }
            for (int i = 0; i < 5; i++) {
                playerNumber += 1;
                if (playerNumber > 100) {
                    playerNumber = 1;
                }
            }
        }
    }
}