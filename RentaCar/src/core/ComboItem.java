package core;
public class ComboItem {
    private int key;
    private String value;

    // Constructor
    public ComboItem(int key, String value) {
        this.key = key;
        this.value = value;
    }

    // Getter and Setter methods
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Override toString method to display the value when the object is printed(as string value)
    @Override
    public String toString() {
        return this.value;
    } // ekrana value print edecek
}
