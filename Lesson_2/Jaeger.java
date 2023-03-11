public class Jaeger {
    private String modelName;
    private String name;
    private String origin;
    private float height;
    private float weight;
    private int speed;

    public Jaeger() {}

    // parameterized constructor
    public Jaeger(String modelName, String name, String origin, float height, float weight, int speed) {
        this.modelName = modelName;
        this.name = name;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " moved forward to fight");
    }

    public void useArmor() {
        System.out.println(name + " applied super strong armor");
    }

    public void protect() {
        System.out.println(name + " will protect the base.");
    }    

    public void print() {
        System.out.println("Name: " + name + " modelName: " + modelName + " origin: " + origin + 
                "\n" + "height: " + height + " weight: " + weight + " speed: " + speed);
    }
}