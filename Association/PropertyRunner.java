public class PropertyRunner {
    public static void main(String[] args) {
        Site site1=new Site(30,40);
        Site site2=new Site(80,100);
        Property property=new Property("Ganesh",1200,new Site[] {site1,site2});
        property.display(new Site[] {site1,site2});
    }
}
