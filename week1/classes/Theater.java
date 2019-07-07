package objects.week1.classes;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    final private List<TicketOffice> ticketOffices = new ArrayList<>();
    final private Long fee;

    public Theater(Long fee) {
        this.fee = fee;
    }

    Long getFee() {
        return this.fee;
    }

    public void setTicketOffices(TicketOffice... ticketOffices) {
        for (TicketOffice ticketOffice : ticketOffices) {
            if (ticketOffice.getContract())
                this.ticketOffices.add(ticketOffice);
        }
    }

    public void setTicket(TicketOffice ticketOffice, Long num, Movie movie) {
        if (!ticketOffices.contains(ticketOffice)) return;
        while (num-- > 0) {
            ticketOffice.addTicket(new Ticket(this, movie));
        }
    }

    public void setInvitation(Audience audience) {
        audience.setInvitation(new Invitation(this));
    }

    public boolean enter(Audience audience) {
        Ticket ticket = audience.getTicket();
        return ticket.isValid(this);
    }
}