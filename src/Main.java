import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри ", "Поттер ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Griffindor hermioneGranger = new Griffindor("Гермиона ", "Грейнджер ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Griffindor ronWeasley = new Griffindor("Рон ", "Уизли ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Slytherin drakoalfoy = new Slytherin("Драко ", "Малфой ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Slytherin grahamMontague = new Slytherin("Грэхэм ", "Монтагю ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Slytherin gregoryGoyle = new Slytherin("Грэгори ", "Гойл ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Hufflepuff zakhariahSmith = new Hufflepuff("Захария ", "Смит ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Hufflepuff sedrickDiggory = new Hufflepuff("Сэдрик ", "Диггори ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин ", "Финч-Флетчли ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Ravenclaw zhouChang = new Ravenclaw("Чжоу ", "Чанг ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Ravenclaw padmaPatyl = new Ravenclaw("Падма ", "Патил ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Ravenclaw marcusBelby = new Ravenclaw("Маркус ", "Бэлби ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        System.out.println(ronWeasley.toString());
        System.out.println(drakoalfoy.toString());
        System.out.println(zakhariahSmith.toString());
        System.out.println(zhouChang.toString());

        harryPotter.compareStudents(hermioneGranger);
        hermioneGranger.compareStudents(drakoalfoy);
    }

    public static int rnd100() {
        Random random = new Random();
        return random.nextInt(101);
    }
}