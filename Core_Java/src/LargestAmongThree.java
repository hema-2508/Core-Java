public class LargestAmongThree {
    public static void main(String[] args) {
        int[] arr={6,10,3,7};
        int i=0;
        int temp=0;
        for(i=0;i< arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
