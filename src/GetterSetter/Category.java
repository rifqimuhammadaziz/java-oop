package GetterSetter;

public class Category {
    /**
     * Encapsulation (private type used to secure the data from field)
     * For set/get data field only use method setter/getter
     */
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
