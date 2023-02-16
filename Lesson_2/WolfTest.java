public class WolfTest {
        public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("female");
        wolfOne.setNickname("Wolfy");
        wolfOne.setWeight(38);
        wolfOne.setAge(3);
        wolfOne.setColor("white");

        System.out.println("gender of wolf: " + wolfOne.getGender());
        System.out.println("nickname of wolf: " + wolfOne.getNickname());
        System.out.println("weight of wolf: " + wolfOne.getWeight());
        System.out.println("age of wolf: " + wolfOne.getAge());
        System.out.println("color of wolf: " + wolfOne.getColor());

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}