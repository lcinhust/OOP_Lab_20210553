public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title) {
        this.setTitle(title);
    }
    
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
