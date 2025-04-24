import java.util.ArrayList;
import java.util.List;  

public class manager<T> {
    private List<T> items;

    public manager() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (T item : items) {
            if (item instanceof user) {
                ((user) item).displayInfo();
            } else if (item instanceof Courses) {
                ((Courses) item).displayCourseInfo();
            }
        }
    }
}
