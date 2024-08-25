public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgress, int cunning, int ambition, int determination, int resourcefulness, int thirstOfPower) {
        super(name, surname, powerOfMagic, transgress);
        this.cunning = cunning;
        this.ambition = ambition;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstOfPower=" + thirstOfPower +
                '}';
    }

    public void compareStudents(Slytherin student) {
        int sum1 = this.ambition + this.cunning + this.determination + this.resourcefulness + this.thirstOfPower;
        int sum2 = student.ambition + student.thirstOfPower + student.determination + student.cunning + student.resourcefulness;

        if (sum1 > sum2) {
            System.out.println(this.getName() + this.getSurname() + " лучший Слизеринец, чем " + student.getName() + student.getSurname());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + student.getSurname() + " лучший Слизеринец, чем " + this.getName() + this.getSurname());
        } else {
            System.out.println("Студенты равны.");
        }
    }
}
