

/**
 * Creates a Avian.Pigeon (Avian.Avian-class) creature
 */
public class Pigeon extends Avian {

    /**
     * Parameters for an avian creature
     *
     * @param age        Age of creature
     * @param color      Color of creature
     * @param weight     Weight of creature
     * @param endangered If creature is endangered
     * @param sleeping   If creature is sleeping
     * @param speed      Movement speed of creature
     * @param canFly     If the creature can fly
     */
    public Pigeon(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, boolean canFly, boolean inFlight) {
        super(age, color, weight, endangered, sleeping, speed, canFly, inFlight);
        System.out.println(toString());
        System.out.println(sleep());
        System.out.println(fly());
        System.out.println(wakeUp());
        System.out.println(sleep());

    }

    @Override
    public String eat() {
        return "omnom";
    }

    @Override
    public String move() {
        return fly();
    }

    @Override
    public String doSomething() {
        return "dies*";
    }

    /**
     * Returns information about Avian.Pigeon
     * @return information about Avian.Pigeon
     */
    @Override
    public String toString() {
        return "Avian.Pigeon{" +
                "age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", weight=" + getWeight() +
                ", endangered=" + isEndangered() +
                ", sleeping=" + isSleeping() +
                ", speed=" + getSpeed() +
                ", canFly=" + isCanFly() +
                '}';
    }

    /**
     * Entry point for Avian.Pigeon
     * @param args
     */
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon(10, "RED", 2, false, true, 20, true, false);
    }
}

