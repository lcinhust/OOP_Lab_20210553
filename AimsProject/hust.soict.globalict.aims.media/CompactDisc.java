import java.util.ArrayList;

public class CompactDisc extends Media {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc() {
        super();
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track track : this.tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public String getArtist() {
        return artist;
    }
}
