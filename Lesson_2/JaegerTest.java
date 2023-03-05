public class JaegerTest {

    public static void main(String[] args) {
        Jaeger HorizonBrave = new Jaeger("Mark-1", "HorizonBrave", "China", 72.54f, 7.890f, 8);
        HorizonBrave.print();
        HorizonBrave.move();
        HorizonBrave.userArmor();
        HorizonBrave.protect();
        Jaeger CoyoteTango = new Jaeger();
        CoyoteTango.setModelName("Mark-1");
        CoyoteTango.setName("Coyote Tango");
        CoyoteTango.setOrigin("Japan");
        CoyoteTango.setHeight(84.0f);
        CoyoteTango.setWeight(2312.0f);
        CoyoteTango.setSpeed(8);
        System.out.println();
        CoyoteTango.print();
        CoyoteTango.move();
        CoyoteTango.userArmor();
        CoyoteTango.protect();
    }
}