// works for all electronic devices

public class TurnOff implements Command {

  ElectronicDevice device;

  public TurnOff(ElectronicDevice device) {
    this.device = device;
  }

  public void execute() {
    device.off();
  }

  public void undo() {
    device.on();
  }

}
