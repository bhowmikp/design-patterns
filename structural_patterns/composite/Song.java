public class Song extends SongComponent {

  String songName;
  String bandName;
  int releaseYear;

  public Song(String songName, String bandName, int releaseYear) {
    this.songName = songName;
    this.bandName = bandName;
    this.releaseYear = releaseYear;
  }

  public String getSongName() {
    return songName;
  }

  public String getBandName() {
     return bandName;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void displaySongInfo() {
    System.out.print(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear() + "\n");
  }

}
