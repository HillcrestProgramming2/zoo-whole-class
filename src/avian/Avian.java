package avian;

/**
 * The bird people
 */
public abstract class Avian extends ZooResident{
    private double speed;
    private boolean canFly;
    private boolean inFlight;

    /**
     * Parameters for an avian creature
     *
     * @param age           Age of creature
     * @param color         Color of creature
     * @param weight        Weight of creature
     * @param endangered    If creature is endangered
     * @param sleeping      If creature is sleeping
     * @param speed         Movement speed of creature
     * @param canFly        If the creature can fly
     */
    public Avian(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, boolean canFly) {
        super(age, color, weight, endangered, sleeping);
        this.speed = speed;
        this.canFly = canFly;
    }

    /**
     * Returns information of the Avian.Avian
     * @return information of the Avian.Avian
     */
    @Override
    public String toString() {
        return "Avian.ZooResident{" +
                "age=" + super.getAge() +
                ", color='" + super.getColor() + '\'' +
                ", weight=" + super.getWeight() +
                ", endangered=" + super.isEndangered() +
                ", sleeping=" + super.isSleeping() +
                ", speed=" + speed +
                ", canFly=" + canFly +
                '}';
    }

    /**
     * Lets the bird fly
     * @return if the bird starts flying
     */
    public String fly(){
        if(canFly = true){
            inFlight = true;
            return "I'm flying!";
        }
        return "I tried to fly but I'm too heavy";
    }

    /**
     * Returns speed of the resident
     * @return The speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets speed of creature
     * @param speed The speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Returns if the creature can fly
     * @return If the creature can fly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * Returns if the creature is flying
     * @return If the creature is flying
     */
    public boolean isInFlight() {
        return inFlight;
    }

    /**
     * Sets if the creature can fly
     * @param canFly If the creature can fly
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
