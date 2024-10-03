public abstract class AbstractOrdersWithPrePayment implements Orders{
    String driver;
    Vehicles vehicle;

    public AbstractOrdersWithPrePayment(String driver, Vehicles vehicle){
        this.driver = driver;
        this.vehicle = vehicle;
    }
    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public Vehicles getVehicle() {
        return vehicle;
    }
}
