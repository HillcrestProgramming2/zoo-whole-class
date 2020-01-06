public abstract class Marsupials extends Mammal{
    private boolean pouch;

    /**
     * instance of a marsupial
     * @param age age
     * @param color color
     * @param weight weight
     * @param endangered is it endangered
     * @param sleeping is it sleeping
     * @param furColor color
     * @param gestationPeriod gestation period
     * @param pouch does it have a pouch
     */
    public Marsupials(int age, String color, double weight, boolean endangered, boolean sleeping, String furColor, int gestationPeriod, boolean pouch) {
        super(age, color, weight, endangered, sleeping, furColor, gestationPeriod);
        this.pouch=pouch;
    }

    /**
     * returns if it has a pouch
     * @return pouch
     */
    public boolean isPouch() {
        return pouch;
    }

    /**
     * sets if it has a pouch
     * @param pouch if it has a pouch
     */
    public void setPouch(boolean pouch) {
        this.pouch = pouch;
    }
    @Override
    public String eat(){
        return "grass";
    }
    @Override
    public String move(){
        return "jumping";
    }
    @Override
    public String doSomething(){
        return "kicking";
    }
}
