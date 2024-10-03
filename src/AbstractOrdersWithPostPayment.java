public class AbstractOrdersWithPostPayment implements Orders{
    String driver;
    Vehicles vehicle;

    String deadLine;

    public AbstractOrdersWithPostPayment(String driver, Vehicles vehicle, String deadLine){
        this.driver = driver;
        this.vehicle = vehicle;
        this.deadLine = deadLine;
    }
    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public Vehicles getVehicle() {
        return vehicle;
    }

    public String getDeadLine(){
        return deadLine;
    }
}
