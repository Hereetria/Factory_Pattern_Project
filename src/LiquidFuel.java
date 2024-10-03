public class LiquidFuel extends AbstractLoads {
    private double volume;

    public LiquidFuel(int weight, String description, double volume) {
        super(weight, description);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}