public class Hufflepuff extends Hogwards {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgress, int hardworking, int loyal, int honest) {
        super(name, surname, powerOfMagic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    public void compareStudents(Hufflepuff student) {
        int sum1 = this.hardworking + this.honest + this.loyal;
        int sum2 = student.hardworking + student.loyal + student.honest;

        if (sum1 > sum2) {
            System.out.println(this.getName() + this.getSurname() + " лучший Пуффендуец, чем " + student.getName() + student.getSurname());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + student.getSurname() + " лучший Пуффендуец, чем " + this.getName() + this.getSurname());
        } else {
            System.out.println("Студенты равны");
        }
    }
}
