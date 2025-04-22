package kodNest_qp;

public class Abstraction04 {
	public static void main(String[] args) {
        MusicPlayer currentPlayer = new SpotifyPlayer();
//        currentPlayer.play();  // Output: Spotify is playing music
//        currentPlayer.next();  // Output: Spotify skipped to the next song
        accessMusicPlayer(currentPlayer);
        currentPlayer = new YouTubePlayer();
//        currentPlayer.play();  // Output: YouTube video is playing
//        currentPlayer.pause(); // Output: YouTube video paused
        accessMusicPlayer(currentPlayer);
        
        
    }
	public static void accessMusicPlayer(MusicPlayer m) {
		m.play();
		m.pause();
		m.next();
		m.previous();
	}

}
interface MusicPlayer {
    void play();
    void pause();
    void next();
    void previous();
}
class SpotifyPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Spotify is playing music.");
    }
    public void pause() {
        System.out.println("Spotify paused the music.");
    }
    public void next() {
        System.out.println("Spotify skipped to the next song.");
    }
    public void previous() {
        System.out.println("Spotify went back to the previous song.");
    }
}

class YouTubePlayer implements MusicPlayer {
    public void play() {
        System.out.println("YouTube video is playing.");
    }
    public void pause() {
        System.out.println("YouTube video paused.");
    }
    public void next() {
        System.out.println("Playing next YouTube video.");
    }
    public void previous() {
        System.out.println("Playing previous YouTube video.");
    }
}
