public class vowelOrConsonent {
    public static void main(String[] args) {
        char letter= 's';
        if((letter>='A'&&letter<='Z')||(letter>='a'&&letter<='z')){
            if(letter =='A' || letter=='a'||
                    letter =='E' || letter=='e'||
                    letter =='O' || letter=='o'||
                    letter =='I' || letter=='i'||
                    letter =='U' || letter=='u'){
                System.out.println("letter is vowel");

            }
            else {
                System.out.println("letter is consonent");
            }
        }
    }
}
