package Students;

public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstAndPower;

    public SlytherinStudent(int magic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness,
                            int thirstAndPower) {
        super(magic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstAndPower = thirstAndPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstAndPower() {
        return thirstAndPower;
    }

    @Override
    protected int getSpecificAbiloitesSum() {
        return cunning + determination + ambition + resourcefulness +thirstAndPower;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstAndPower=" + thirstAndPower +
                ", magic=" + magic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(SlytherinStudent slytherinStudent) {
        int abilitiesSum1 = getSpecificAbiloitesSum();
        int abilitiesSum2 = slytherinStudent.getSpecificAbiloitesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println(" Ученик 1 лучше ученика 2 ");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println(" Ученик 2 лучше ученика 1 ");
        } else {
            System.out.println(" Ученики равны ");
        }
    }
}
