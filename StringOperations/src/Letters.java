public class Letters {
    public void task2(String name) {
        String[] arr = name.split(" ");
        for(int i=0;i<= arr.length;i++){
            count(arr[i]);
        }
    }
    public static void count(String word){
        char[] arr = word.toCharArray();
        int i=0;
        for (int index=0;index< arr.length;index++){
            i++;

        }
        System.out.println(i);

    }

    public static void main(String[] args) {
        Letters letters = new Letters();
        letters.task2("RCB will win the match");
    }
}
