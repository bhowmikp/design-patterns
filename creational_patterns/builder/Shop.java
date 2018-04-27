class Shop {

  private VehicleBuilder vehicleBuilder;

  public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
    this.vehicleBuilder = vehicleBuilder;
  }

  public Vehicle getVehicle() {
    return vehicleBuilder.getVehicle();
  }

  public void makeVehicle() {
    vehicleBuilder.createNewVehicle();
    vehicleBuilder.buildFrame();
    vehicleBuilder.buildEngine();
    vehicleBuilder.buildWheels();
    vehicleBuilder.buildDoors();
  }

}
