package objects.week1.classes;

public class Movie {
    private final String title;
    private final long fee;

    public Movie(String title, long fee) {
        this.title = title;
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }

    public String getTitle() {
        return title;
    }
}
