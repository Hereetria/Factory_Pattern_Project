public class ArkasFactory implements Factory{
    @Override
    public Orders createOrderWithPrePayment(String driver, Vehicles vehicle) {
        return new ArkasOrdersWithPrePayment(driver,vehicle);
    }

    @Override
    public Orders createOrderWithPostPayment(String driver, Vehicles vehicle, String deadLine) {
        return new ArkasOrdersWithPostPayment(driver, vehicle, deadLine);
    }
}
