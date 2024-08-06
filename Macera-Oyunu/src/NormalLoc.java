public abstract class NormalLoc extends Location {

    public NormalLoc(String name, Player player) {
        super(name, player);
    }

    @Override
   public boolean onLocantion() {
        return true;
    }

    public abstract boolean getLocation();
}
