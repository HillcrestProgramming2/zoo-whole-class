public class Duck extends Avian {
    /**
     * builds a zoo resident
     *
     * @param age        the age of the resident
     * @param color      the color of the resident
     * @param weight     the weight of the resident
     * @param endangered is the resident endangered
     * @param sleeping   is the resident sleeping
     * @param speed      speed of resident
     * @param canFly     can resident fly
     */
    public Duck(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, boolean canFly) {
        super(2, "brown and grey", 5, true, false,5, true);
    }
    
     /**
     * Animal is eating
     * @return bread
     */
    public String eat() {
        return "bread";    
    }

    /**
     * How the animal moves
     * @return swimming
     */
    public String move {
        return "swimming";    
    }

    /**
     * The animal doing something
     * @return pooping
     */
    public String doSomething {
        return "pooping";    
    }
}