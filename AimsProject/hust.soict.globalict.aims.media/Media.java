import java.util.Objects;

import java.util.Comparator;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static int nbOfMedia = 0;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost) {
        this.id = nbOfMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbOfMedia++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Media)) {
            return false;
        }

        Media m = (Media) o;

        return id == m.id && Objects.equals(title, m.title) &&
                Objects.equals(category, m.category) && cost == m.cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
