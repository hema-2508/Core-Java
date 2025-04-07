public class Ticket {
    private String t_name;
    private String movie;
    private int cost;
    private Movies[] arr;
    public Ticket(String t_name,int cost,Movies[] arr){
        this.t_name=t_name;
        this.cost=cost;
        this.arr=arr;
    }
    public void display(Movies[] arr){
        System.out.println("name  :"+t_name+"  cost:"+cost);
        for(Movies movies:arr){
            System.out.println("Duration "+movies.movie_dur+"    views"+movies.view);
        }
    }
}
