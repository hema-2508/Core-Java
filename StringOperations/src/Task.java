public class Task {
    //RCB will win the match
    /*String name="RCB will win the match";*/
    public void task1(String name) {
        String[] arr = name.split(" ");
        for(int i=0;i<= arr.length;i++){
            if(i==2||i==3){
                reverse(arr[i]);
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
    public static void reverse(String word){
        String reverse="";
        for (int index=0;index<word.length();index++){
            reverse = word.charAt(index) + reverse;

        }
        System.out.println(reverse);;
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.task1("RCB will win the match");
    }
}
