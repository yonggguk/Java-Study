package yongggguk.study.objects;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class TheaterTest {

    Theater theater;

    @Test
    public void test(){
        Bag bag = new Bag(1000);
        Audience audience = new Audience(bag);

        Ticket ticket = new Ticket();
        TicketOffice ticketOffice = new TicketOffice(0L, ticket);
    }

}