import java.util.Scanner;

public class Player {
    private int damenge, healthy, money, resetHealth;
    private String name, charName;
    private Inventory inv;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        switch (charMenu()) {
            case 1:
                initPlayer("samuray", 5, 21, 15,21);
                setName("samuray");
                break;
            case 2:
                initPlayer("Okcu", 7, 18, 20,18);
                break;
            case 3:
                initPlayer("Şovalye", 8, 28, 4,28);

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

    public void initPlayer(String charName, int damenge, int healthy, int money,int resetHealth) {
        setClassName(charName);
        setDamenge(damenge);
        setHealthy(healthy);
        setMoney(money);
        resetHealth(resetHealth);
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

    public int getResetHealth() {
        this.resetHealth=healthy;
        return resetHealth;
    }

    public void setResetHealth(int resetHealth) {
        this.resetHealth = resetHealth;
    }
}
