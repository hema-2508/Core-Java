public class Index {
    public void meth(String sentence){
        char[] arr=sentence.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(i==1||i==2||i==4||i==6||i==9||i==12||i==14){
                char a=arr[i];
                int b=a+1;
                char c= (char) b;
                System.out.println(c);
                return;
            }
            else {System.out.println(arr[i]);}
        }

    }

    public static void main(String[] args) {
        Index index=new Index();
        index.meth("You are welcome");
        char a='o';
        int b=a;
        System.out.println(b);
    }

}
