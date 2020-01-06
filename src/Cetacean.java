public abstract class Cetacean extends Mammal{
    private double blubberPounds;
    private int fins;

    /**
     * instance of a Cetacean
     * @param age age of cetacean
     * @param color color of cetacean
     * @param weight weight of cetacean
     * @param endangered is it endangered
     * @param sleeping is it sleeping
     * @param furColor color of fur
     * @param gestationPeriod how long is it pregnant
     * @param blubberPounds how many pounds of blubber does it have
     * @param fins how many fins does it have
     */
    public Cetacean(int age, String color, double weight, boolean endangered, boolean sleeping, String furColor, int gestationPeriod, String eat, String movement, String doStuff, double blubberPounds, int fins) {
        super(age, color, weight, endangered, sleeping, furColor, gestationPeriod);
        this.blubberPounds=blubberPounds;
        this.fins=fins;
    }

    /**
     * returns the number of pounds of blubber
     * @return
     */
    public double getBlubberPounds() {
        return blubberPounds;
    }

    /**
     * sets number of pounds of blubber
     * @param blubberPounds the number of pounds of blubber
     */
    public void setBlubberPounds(double blubberPounds) {
        this.blubberPounds = blubberPounds;
    }

    /**
     * returns the number of fins
     * @return the number of fins
     */
    public int getFins() {
        return fins;
    }

    /**
     * sets number of fins
     * @param fins the number of fins
     */
    public void setFins(int fins) {
        this.fins = fins;
    }
    @Override
    public String eat(){
        return "fish";
    }
    @Override
    public String move(){
        return "moving the fins";
    }
    @Override
    public String doSomething(){
        return "have high IQ";
    }
}
