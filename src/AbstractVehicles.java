public abstract class AbstractVehicles implements Vehicles{

    protected String licensePlate;
    protected int capacity;
    protected Loads cargoType;

    public AbstractVehicles(String licensePlate, int capacity) {
        this.licensePlate = licensePlate;
        this.capacity = capacity;
    }

    @Override
    public void loadCargo(Loads load) {
        if(load.getWeight() <= capacity){
            System.out.println("Araç Yüklendi");
            this.cargoType = load;
        }
        else
            System.out.println("Yük kapasiteyi aşıyor");
    }

    @Override
    public void unloadCargo() {
        if (cargoType != null){
            cargoType = null;
            System.out.println("Yük boşaltıldı");
        }
        else
            System.out.println("Araç zaten boş");
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getCapacity() {
        return capacity;
    }

    public Loads getCargoType() {
        return cargoType;
    }

}
