import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public void login() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Marcera Oyununa Hosgeldiniz");
        System.out.print("Oyuna başlamadan önce isminizi giriniz : ");
        String playerName = imput.nextLine();
        player = new Player(playerName);
        player.selectChar();

    }

}
