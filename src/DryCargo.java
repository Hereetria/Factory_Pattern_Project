public class DryCargo extends AbstractLoads{
    private String containerSize;
    public DryCargo(int weight, String description, String containerSize) {
        super(weight, description);
        this.containerSize = containerSize;
    }

    public String getContainerType() {
        return containerSize;
    }
}
