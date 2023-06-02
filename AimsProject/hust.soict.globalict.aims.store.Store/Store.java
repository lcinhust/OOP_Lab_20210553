import java.util.ArrayList;

public class Store extends Cart{
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.remove(media);
        }
    }
}