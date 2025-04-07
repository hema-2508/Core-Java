import java.util.Arrays;

public class Property {
    private String p_name;
    private String location;
    private int sqft;
    private Site[] area;
    public Property(String p_name,int sqft,Site[] area){
        this.p_name=p_name;
        this.sqft=sqft;
        this.area=area;
    }
    public void display(Site[] arr){
        System.out.println("name  :"+p_name+"  sqrt:"+sqft);
        for(Site site:arr){
            System.out.println("Site length "+site.length+"   Site width "+site.width);
        }
    }


}
