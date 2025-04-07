public class TicketRunner {
    public static void main(String[] args) {
        Movies movies1=new Movies(300,400);
        Movies movies2=new Movies(500,450);
        Ticket ticket=new Ticket("Movie ticket",200,new Movies[]{movies1,movies2});
        ticket.display(new Movies[]{movies1,movies2});
    }
}
