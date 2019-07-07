package objects.week1;


import objects.week1.classes.*;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(100L);
        Audience audience1 = new Audience(0L);
        Audience audience2 = new Audience(50L);
        TicketOffice ticketOffice = new TicketOffice(0L);
        TicketSeller seller = new TicketSeller();
        theater.setTicketOffices(ticketOffice);
        Movie movie = new Movie("spiderman", 1000L);
        theater.setTicket(ticketOffice, 10L, movie);
        theater.setInvitation(audience1);
        seller.setTicketOffice(ticketOffice);
        audience1.buyTicket(seller);
        audience2.buyTicket(seller);
        boolean isOk1 = theater.enter(audience1);
        boolean isOk2 = theater.enter(audience2);
        System.out.println(isOk1);
        System.out.println(isOk2);
    }
}
