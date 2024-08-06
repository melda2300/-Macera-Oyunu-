public abstract class SefaHouse extends NormalLoc {
    Player player;

    public SefaHouse(Player player) {
        super("Güvenli Ev", player);
        this.player = player;
    }

    @Override
    public boolean getLocation() {
        player.setHealth(player.resetHealth());

        System.out.println("Güvenli evdesiniz. \t Canınız yenilendi.");
        return true;
    }
}
