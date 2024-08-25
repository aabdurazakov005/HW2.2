public abstract class Hogwards {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgress;


    public Hogwards(String name, String surname, int powerOfMagic, int transgress) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                '}';
    }

    public abstract void printParameters();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void compareStudents(Hogwards student) {
        int sum1 = this.powerOfMagic + this.transgress;
        int sum2 = student.powerOfMagic + student.transgress;
        if (sum1 > sum2) {
            System.out.println(this.getName() + this.getSurname() + " обладает большей мощностью магии, чем " + student.getName() + student.getSurname());
        } else if (sum1 < sum2){
            System.out.println( student.getName() + student.getSurname() + " обладает большей мощностью магии, чем " + this.getName() + this.getSurname());
        } else {
            System.out.println("Студенты равны.");
        }
    }
}