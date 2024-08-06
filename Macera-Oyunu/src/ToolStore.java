public abstract class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super("Mağaza", player);
    }

    @Override
    public boolean onLocantion() {
        System.out.println("Mağazaya hoşgeldiniz");
        return true;
    }
}
