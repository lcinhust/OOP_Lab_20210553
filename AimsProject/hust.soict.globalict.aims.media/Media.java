import java.util.Objects;

public class Media {
    private int id; 
    private String title;
    private String category;
    private float cost;

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
