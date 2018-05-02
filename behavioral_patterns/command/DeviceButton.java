// invoker DeviceButton knows nothing
// it doesn't know what device or command is being used

public class DeviceButton {

  Command command;

  public DeviceButton(Command command) {
    this.command = command;
  }

  public void press() {
    command.execute();
  }

  public void pressUndo() {
    command.execute();
  }

}
