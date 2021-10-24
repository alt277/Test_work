public class Exercise1 {

    public static String myreplace(String string, char oldChar, char newChar) {
        String newWord = "";
        char current;
        for (int i = 0; i <= string.length() - 1; i++) {
            current = string.charAt(i);
            if (current == oldChar)
                newWord += newChar;
            else
                newWord += current;
        }
        return newWord;
    }


    public static void main(String[] args) {
        String word = "Hello world";
        String newWord = myreplace(word, 'l', 'w');
        System.out.println("New word : " + newWord);
    }
}
