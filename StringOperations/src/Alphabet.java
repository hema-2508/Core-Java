public class Alphabet {
    public void noOfVowels(String word){
        int v_count=0;
        int c_count=0;
        int s_count=0;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)=='a'||word.charAt(i)=='A'||word.charAt(i)=='e'||word.charAt(i)=='E'||word.charAt(i)=='i'||word.charAt(i)=='I'||word.charAt(i)=='o'||word.charAt(i)=='O'||word.charAt(i)=='u'||word.charAt(i)=='U'){
                v_count=v_count+1;
            } else if (word.charAt(i)==' ') {
                s_count=s_count+1;
            }else {
                c_count=c_count+1;
            }

        }
        System.out.println(v_count);
        System.out.println(c_count);
    }

    public static void main(String[] args) {
        Alphabet alphabet=new Alphabet();
        alphabet.noOfVowels("RCB WILL WIN THE MATCH");
    }
}
