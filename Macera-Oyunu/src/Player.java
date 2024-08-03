import java.util.Scanner;

public class Player {
    private int damenge, healthy, money;
    private String name, charName;
    private Inventory inv;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        switch (charMenu()) {
            case 1:
                setName("samuray");
                setDamenge(5);
                setHealthy(21);
                setMoney(15);
                break;
            case 2:
                setName("Okcu");
                setDamenge(7);
                setHealthy(18);
                setMoney(20);
                break;
            case 3:
                setName("Şovalye");
                setDamenge(8);
                setHealthy(24);
                setMoney(5);
                break;
        }
        System.out.println("Karakter oluştu :");
        System.out.println(" KARAKTER : " + getName() + " \t HASAR " + getDamenge() + " \t SAĞLIK " + getHealthy() + " \t PARA " + getMoney());
    }

    public int charMenu() {
        System.out.println("Lütfen Bir Karekter Seciniz : ");
        System.out.println("Karakter listesi : ");
        System.out.println("1. Samuray  =  Hasar : 5       Sağlık : 21       Para : 15 ");
        System.out.println("2. Okcu  =     Hasar : 7       Sağlık : 18       Para : 20 ");
        System.out.println("3. Şovalye  =  Hasar : 8       Sağlık : 24       Para :  5 ");
        System.out.println("Karakter Seciniz : ");
        int charId = scanner.nextInt();
        while (charId < 1 || charId > 3) {
            System.out.println("Lütfen Gecerli Bir Karekter Seciniz : ");
            charId = scanner.nextInt();
        }
        return charId;

    }

    public int getDamenge() {
        return damenge;
    }

    public void setDamenge(int damenge) {
        this.damenge = damenge;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return charName;
    }

    public void setClassName(String className) {
        this.charName = className;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
}
