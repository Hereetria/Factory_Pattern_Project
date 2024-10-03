public class LiquidCargo extends AbstractLoads {
    private String containerSize;

    public LiquidCargo(int weight, String description, String containerSize) {
        super(weight, description);
        this.containerSize = containerSize;
    }

    public String getContainerType() {
        return containerSize;
    }
}