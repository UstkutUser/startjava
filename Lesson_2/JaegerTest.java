public class JaegerTest {

    public static void main(String[] args) {
        Jaeger horizonBrave = new Jaeger("Mark-1", "HorizonBrave", "China", 72.54f, 7.890f, 8);
        horizonBrave.print();
        horizonBrave.move();
        horizonBrave.userArmor();
        horizonBrave.protect();
        
        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModelName("Mark-1");
        coyoteTango.setName("Coyote Tango");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(84.0f);
        coyoteTango.setWeight(2312.0f);
        coyoteTango.setSpeed(8);

        System.out.println();

        coyoteTango.print();
        coyoteTango.move();
        coyoteTango.useArmor();
        coyoteTango.protect();
    }
}