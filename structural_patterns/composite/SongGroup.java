import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

  ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();

  String groupName, groupDescription;

  public SongGroup(String groupName, String groupDescription) {
    this.groupName = groupName;
    this.groupDescription = groupDescription;
  }

  public void add(SongComponent newSongComponent) {
    songComponents.add(newSongComponent);
  }

  public void remove(SongComponent newSongComponent) {
    songComponents.remove(newSongComponent);
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGroupDescription() {
    return groupDescription;
  }

  public SongComponent getComponent(int componentIndex) {
    return songComponents.get(componentIndex);
  }

  public void displaySongInfo() {
    System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

    Iterator<SongComponent> songIterator = songComponents.iterator();

    while (songIterator.hasNext()) {
      SongComponent songInfo = songIterator.next();
      songInfo.displaySongInfo();
    }
  }

}
