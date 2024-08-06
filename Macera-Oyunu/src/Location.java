public abstract class Location {
    public String name;
    private Player player;

    public Location(String name, Player player) {
        this.name = name;
        this.player = player;
    }


    public abstract  boolean getLocantion();

    abstract boolean onLocantion();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
