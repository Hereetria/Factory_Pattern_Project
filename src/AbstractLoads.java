public abstract class AbstractLoads implements Loads{

    protected int weight;
    protected String description;

    public AbstractLoads(int weight, String description){
        this.weight = weight;
        this.description = description;
    }

    @Override
    public int getWeight(){
        return weight;
    }

    public String getDescription(){
        return description;
    }


}
