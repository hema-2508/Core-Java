public class LeapYear {
    public static void main(String[] args) {
        int num=1900;
        if ((num%4==0&&num%100!=0)||(num%400==0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
