public class Ravenclaw extends Hogwards {
    private int smart;
    private int wise;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgress, int smart, int wise, int wit, int fullOfCreativity) {
        super(name, surname, powerOfMagic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Ravenclaw student) {
        int sum1 = this.smart + this.fullOfCreativity + this.wise + this.wit;
        int sum2 = student.fullOfCreativity + student.wit + student.wise + student.smart;

        if (sum1 > sum2) {
            System.out.println(this.getName() + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + student.getSurname());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + this.getSurname());
        } else {
            System.out.println("Студенты равны.");
        }
    }
}