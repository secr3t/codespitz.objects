package objects.week1.classes;

public class Ticket {
    final static public Ticket EMPTY = new Ticket(null, null);
    final private Theater theater;
    final private Movie movie;
    private boolean isEntered = false;
    public Ticket(Theater theater, Movie movie) {
        this.theater = theater;
        this.movie = movie;
    }

    public boolean isValid(Theater theater) {
        if(isEntered || theater != this.theater || this == EMPTY)
            return false;
        else {
            isEntered = true;
            return true;
        }
    };

    public Long getFee() {
        return theater.getFee();
    }
}
