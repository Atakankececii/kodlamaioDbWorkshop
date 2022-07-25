package entities;

public class Channel {
    private long id;
    private String name;

    public Channel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Channel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
