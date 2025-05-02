public class StringOperations {
    public void reverseString(String name) {
        char[] arr = name.toCharArray();
        System.out.println("The reverse order of the given sentence is");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public void numOfWords(String name) {
        String[] arr = name.split(" ");
        int count = 0;
        for (String names : arr) {
//            System.out.println(names);
            count++;
        }
        System.out.println("\n");
        System.out.println("the number of words in the sentence is : " + count);

    }

    public void targetWord(String name, String target) {
        String[] arr = name.split(" ");
        boolean found = false;
        for (String names : arr) {
            if (names.equals(target)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("The target word is present");
        } else {
            System.out.println("The target word is not present");
            System.out.println("\n");
        }

    }


}