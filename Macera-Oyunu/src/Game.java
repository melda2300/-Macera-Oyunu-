import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Marcera Oyununa Hosgeldiniz");
        System.out.print("Oyuna başlamadan önce isminizi giriniz : ");
        String playerName = imput.nextLine();
        player = new Player(playerName);
        player.selectChar();

    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Eylem Gercekleştirmek için bir yer secin : ");
            System.out.println("1. Güvenli ev => Size ait güvenli bi ev , düşman yok");
            System.out.println("2. Mağara => Karsına belki zombi cıkabilir.");
            System.out.println("3. Orman => Karşınıza belki vampir cıkabilir.");
            System.out.println("4. Nehir => Karsınıza belki ayı cıkabilir.");
            System.out.println("5. Mağara => silah veya zırh alabilirsiniz.");
            System.out.println("Gitmek istediğiniz yer : ");

            int haritaSec = scan.nextInt();
            while (haritaSec < 0 || haritaSec > 5) {
                System.out.println("Lütfen gecerli bir yer seciniz");
                haritaSec = scan.nextInt();
            }
            switch (haritaSec) {
                case 1:
                    location = new SefaHouse(player) {
                        @Override
                        public boolean getLocantion() {
                            return false;
                        }
                    };
                    break;

               /* case 2:
                    location = new Cave(player); // Assuming Cave is another location class
                    break;
                case 3:
                    location = new Forest(player); // Assuming Forest is another location class
                    break;
                case 4:
                    location = new River(player); // Assuming River is another location class
                    break;
                case 5:
                    location = new Store(player); // Assuming Store is another location class for weapons/armor
                    break;

                */
                default:
                    location = new SefaHouse(player) {
                        @Override
                        public boolean getLocantion() {
                            return true;
                        }
                    };
                    break;
            }
           if (location.onLocantion()){
               System.out.print("oyun bitti");
               break;
           }
          break;
        }
    }
}

