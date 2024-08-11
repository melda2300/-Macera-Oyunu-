public abstract class Obstacle extends Location {
    Player player;
    Obstacle obstacle;

    public Obstacle(String name, Player player, Obstacle obstacle) {
        super(player);
        this.obstacle = obstacle;
        this.player = player;
        this.name = name;
    }

    public boolean getLoction() {
        return true;
    }
}
