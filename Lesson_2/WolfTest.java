public class WolfTest {

    public static void main(String[] args) {

        Wolf wolfOne = new Wolf();
        
        String gender = "male";
        String nickname = "Wolfenstein";
        int weight = 45;
        int age = 4;
        String color = "grey";

        System.out.println("gender of wolf: " + gender);
        System.out.println("nickname of wolf: " + nickname);
        System.out.println("weight of wolf: " + weight);
        System.out.println("age of wolf: " + age);
        System.out.println("color of wolf: " + color);

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}