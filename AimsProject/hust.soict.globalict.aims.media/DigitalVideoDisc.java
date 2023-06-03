public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public String toString() {
        String titleStr = String.format("%-15s", "[" + this.title + "]");
        String directorStr = String.format("%-15s", "[" + this.director + "]");
        String lengthStr = String.format("%-5s", "[" + this.length + "]");
        String costStr = String.format("%-10s", "[" + this.cost + "]$");
        return "DVD - " + titleStr + " - " + directorStr + " - " + lengthStr + ": " + costStr;
    }

    boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
