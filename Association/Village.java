public class Village {
    private String v_name;
    private String location;
    private int no_ppl;
    private Native[] arr;
    public Village(String v_name,int no_ppl,Native[] arr){
        this.v_name=v_name;
        this.no_ppl=no_ppl;
        this.arr=arr;
    }
    public void display(Native[] arr){
        System.out.println("name  :"+v_name+"  number of ppl:"+no_ppl);
        for(Native nat:arr){
            System.out.println("Native length "+nat.length+"   Native width "+nat.width);
        }
    }

}
