public interface Factory {
    Orders createOrderWithPrePayment(String driver, Vehicles vehicle);
    Orders createOrderWithPostPayment(String driver, Vehicles vehicle, String deadLine);

}
