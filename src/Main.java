public class Main {
    public static void main(String[] args) {
        int oilWeight = 1000;
        String description = "Rockefeller's Oil";
        Double volume = 15.0;

        String licensePlate = "35AC5244";
        int capacity = 1500;

        String driverName = "Mustafa";

        Loads oil = new LiquidFuel(oilWeight,description, volume);


        Vehicles truck = new Truck(licensePlate,capacity);
        truck.loadCargo(oil);

        Factory oyakFactory = new OyakFactory();
        Orders oyakOrder = oyakFactory.createOrderWithPrePayment(driverName,truck);

        oyakOrder.getVehicle().unloadCargo();

    }
}