public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravely;

    public Griffindor(String name, String surname, int powerOfMagic, int transgress, int nobility, int honor, int bravely) {
        super(name, surname, powerOfMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravely = bravely;
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravely=" + bravely +
                '}';
    }

    public void compareStudents(Griffindor student) {
        int sum1 = this.nobility + this.bravely + this.honor;
        int sum2 = student.bravely + student.honor + student.nobility;

        if (sum1 > sum2) {
            System.out.println(this.getName() + this.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + student.getSurname());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + student.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + this.getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}
