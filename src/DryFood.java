public class DryFood extends AbstractLoads{
    private String foodType;

    public DryFood(int weight, String description, String foodType) {
        super(weight, description);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
}
