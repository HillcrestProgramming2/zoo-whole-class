public class Goose extends Avian {
    /**
     * builds a zoo resident
     *
     * @param age        the age of the resident
     * @param color      the color of the resident
     * @param weight     the weight of the resident
     * @param endangered is the resident endangered
     * @param sleeping   is the resident sleeping
     * @param speed
     * @param legs
     * @param canFly
     */
    public Goose(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, double legs, boolean canFly, boolean inFlight) {
        super(10, "white", 2, false, true, 40, true,true);
    }
}
    /**
     * Animal is eating
     * @return
     */
    public String eat(){
        return "corn"
    }
    /**
     * How the animal moves
     * @return
     */
    public String move(){
        return "Fly"
    }

    /**
     * The animal doing something
     * @return
     */
    public String doSomething(){
        return "honk"
    }