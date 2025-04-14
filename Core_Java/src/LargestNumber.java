public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={1,8,7,5,10,3};
        int temp=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
