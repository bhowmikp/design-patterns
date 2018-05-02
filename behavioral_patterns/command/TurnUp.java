// works for all electronic devices

public class TurnUp implements Command {

  ElectronicDevice device;

  public TurnUp(ElectronicDevice device) {
    this.device = device;
  }

  public void execute() {
    device.volumeUp();
  }

  public void undo() {
    device.volumeDown();
  }

}
