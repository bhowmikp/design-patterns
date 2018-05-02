// works for all electronic devices

public class TurnOn implements Command {

  ElectronicDevice device;

  public TurnOn(ElectronicDevice device) {
    this.device = device;
  }

  public void execute() {
    device.on();
  }

  public void undo() {
    device.off();
  }

}
