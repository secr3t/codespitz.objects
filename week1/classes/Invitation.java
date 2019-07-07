package objects.week1.classes;

public class Invitation {
    final static public Invitation EMPTY = new Invitation(null);
    final private Theater theater;
    public Invitation(Theater theater) {
        this.theater = theater;
    }
}
