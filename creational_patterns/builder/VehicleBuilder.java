public abstract class VehicleBuilder {

  protected Vehicle vehicle;

  public Vehicle getVehicle(){
    return vehicle;
  }

  public void createNewVehicle(){
    vehicle = new Vehicle();
  }

  public abstract void buildFrame();

  public abstract void buildEngine();

  public abstract void buildWheels();

  public abstract void buildDoors();

}
