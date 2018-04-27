public class Client {

  public static void main(String [] args) {

    Shop shop = new Shop();

    VehicleBuilder carBuilder = new CarBuilder();
    VehicleBuilder motorCycleBuilder = new MotorCycleBuilder();

    shop.setVehicleBuilder(carBuilder);
    shop.makeVehicle();

    Vehicle vehile = shop.getVehicle();

  }

}
