public class Client {

  public static void main (String [] args) {
    SongComponent industrialMusic = new SongGroup("Industrial", "Industrial Group Description");
    SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy Metal Group Description");
    SongComponent dubstepMusic = new SongGroup("Dubstep", "Dubstep Group Description");

    SongComponent everySong = new SongGroup("Song List", "All song description");
    everySong.add(industrialMusic);

    industrialMusic.add(new Song("First Industrial song", "Artist 1", 1980));
    industrialMusic.add(new Song("Second Industrial song", "Artist 1", 1988));
    industrialMusic.add(dubstepMusic);
    dubstepMusic.add(new Song("First Dubstep song", "Artist 2", 2005));
    dubstepMusic.add(new Song("Second Dubstep song", "Artist 2", 2007));

    everySong.displaySongInfo();
  }

}
