public class OyakFactory implements Factory{
    @Override
    public Orders createOrderWithPrePayment(String driver, Vehicles vehicle) {
        return new OyakOrdersWithPrePayment(driver,vehicle);
    }

    @Override
    public Orders createOrderWithPostPayment(String driver, Vehicles vehicle, String deadLine) {
        return new OyakOrdersWithPostPayment(driver, vehicle, deadLine);
    }
}
