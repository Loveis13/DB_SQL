package Students;

public abstract class HogwartsStudent {
    protected final int magic;
    protected final int transgressionDistance;

    public HogwartsStudent(int magic, int transgressionDistance) {
        this.magic = magic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    protected abstract int getSpecificAbiloitesSum();

    private int basicAbilitiesSum(){
        return magic + transgressionDistance;
    }

    public void basicCompare(HogwartsStudent){

    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "magic=" + magic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
