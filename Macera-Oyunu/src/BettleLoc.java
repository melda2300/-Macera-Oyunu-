
public abstract class BettleLoc extends Location {

    Obstacle obstacle;

    public BettleLoc(String names,Obstacle obstacle ,Player player) {
        super(names, player);
        this.obstacle=obstacle;
        this.name=names;
    }
    public  boolean getLocation(){
        return  true;
    }
}
