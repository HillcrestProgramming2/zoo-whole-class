/**
 * class that makes a mammal
 */
public abstract class Mammal extends ZooResident{
    private String furColor;
    private int gestationPeriod;


    /**
     * instance of a mammal
     * @param age age
     * @param color color
     * @param weight weight
     * @param endangered is it endangered
     * @param sleeping is it sleeping
     * @param furColor color of fur
     * @param gestationPeriod how long the gestation period is
     */
    public Mammal(int age, String color, double weight, boolean endangered, boolean sleeping, String furColor, int gestationPeriod) {
        super(age, color, weight, endangered, sleeping);
        this.furColor=furColor;
        this.gestationPeriod=gestationPeriod;
    }

    /**
     * returns furColor
     * @return furColor
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     *  sets furColor
     * @param furColor the color of the fur
     */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    /**
     * returns gestationPeriod
     * @return gestationPeriod
     */
    public int getGestationPeriod() {
        return gestationPeriod;
    }

    /**
     * sets the gestationPeriod
     * @param gestationPeriod how long the mammal is pregnant
     */
    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }


}
