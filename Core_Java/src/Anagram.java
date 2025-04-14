import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String word1="Hema";
        String word2="Ahem";
        String word1LC=word1.toLowerCase();
        String word2LC=word2.toLowerCase();
        char[] arr1=word1LC.toCharArray();
        char[] arr2=word2LC.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("The given word is anagram");
        }
        else{
            System.out.println("not an anagaram");
        }
    }
}
