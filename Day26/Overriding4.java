/*Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.*/
class Song {
  void play() {
    System.out.println("Pop song");
    System.out.println("Jazz song");
  }
}

class PopSong extends Song {
  void play(){
    System.out.println("Pop song with catchy beat and chorous");
  }
}
  class JazzSong extends Song{
    void play(){
    System.out.println("Jazz song with smooth melody");
  }

}

class SongDemo {
  public static void main(String args[]) {
    PopSong obj = new PopSong();
    JazzSong obj = new JazzSong();
    obj.play();
  }
}