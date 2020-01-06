public abstract class Primates extends Mammal{
    private boolean thumbsHaver;
    private boolean toeHaver;

    /**
     * instance of a primate
     * @param age age of primate
     * @param color color of primate
     * @param weight weight of primate
     * @param endangered is the primate endangered
     * @param sleeping is the primate sleeping
     * @param furColor fur color of the primate
     * @param gestationPeriod gestation period of the primate
     * @param toeHaver does the primate have toes
     * @param thumbsHaver does the primate have thumbs
     */
    public Primates(int age, String color, double weight, boolean endangered, boolean sleeping, String furColor, int gestationPeriod, boolean toeHaver, boolean thumbsHaver) {
        super(age, color, weight, endangered, sleeping, furColor, gestationPeriod);
        this.thumbsHaver=thumbsHaver;
        this.toeHaver=toeHaver;
    }

    /**
     * returns whether or not it has thumbers
     * @return thumbsHaver
     */
    public boolean isThumbsHaver() {
        return thumbsHaver;
    }

    /**
     * sets if the primate has thumbs
     * @param thumbsHaver if the primate has thumbs
     */
    public void setThumbsHaver(boolean thumbsHaver) {
        this.thumbsHaver = thumbsHaver;
    }

    /**
     * returns if the primate has toes
     * @return toeHaver
     */
    public boolean isToeHaver() {
        return toeHaver;
    }

    /**
     * sets if the primate has toes
     * @param toeHaver if the primate has toes
     */
    public void setToeHaver(boolean toeHaver) {
        this.toeHaver = toeHaver;
    }
    @Override
    public String eat(){
        return "bananas";
    }
    @Override
    public String move(){
        return "swinging on trees";
    }
    @Override
    public String doSomething(){
        return "throw poop at each other";
    }
}
