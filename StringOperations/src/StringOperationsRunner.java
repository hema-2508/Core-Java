public class StringOperationsRunner {
    public static void main(String[] args) {
        StringOperations stringOperations=new StringOperations();
        String name="We love freefire";
        stringOperations.reverseString(name);
        stringOperations.numOfWords(name);
        stringOperations.targetWord(name,"We");
    }
}
