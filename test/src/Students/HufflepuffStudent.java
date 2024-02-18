package Students;

public class HufflepuffStudent extends HogwartsStudent{
    private  final  int hardWorking;
    private  final  int loyal;
    private  final  int honest;

    public HufflepuffStudent(int magic, int transgressionDistance, int hardWorking, int loyal, int honest) {
        super(magic, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyal = loyal;
        this.honest = honest;
    }
    @Override
    protected int getSpecificAbiloitesSum() {
        return hardWorking + loyal + honest;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }



    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "hardWorking=" + hardWorking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", magic=" + magic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public void compare(HufflepuffStudent hufflepuffStudent) {
        int abilitiesSum1 = getSpecificAbiloitesSum();
        int abilitiesSum2 = hufflepuffStudent.getSpecificAbiloitesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println(" Ученик 1 лучше ученика 2 ");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println(" Ученик 2 лучше ученика 1 ");
        } else {
            System.out.println(" Ученики равны ");
        }
    }
}
