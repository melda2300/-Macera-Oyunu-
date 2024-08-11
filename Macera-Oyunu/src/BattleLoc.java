
public abstract class BattleLoc extends Location {

    Obstacle obstacle;

    public BattleLoc(String names, Obstacle obstacle , Player player) {
        super(names, player);
        this.obstacle=obstacle;
        this.name=names;
    }
    public  boolean getLocation(){
        return  true;
    }
}
