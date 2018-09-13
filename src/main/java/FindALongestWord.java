import java.util.Scanner;

public class FindALongestWord {

    public static void getLongestString() {

        Scanner Object = new Scanner(System.in);
        System.out.println("Enter a sentence : "); //get the sentence from the user
        String sent = Object.nextLine();
        Scanner scanner = new Scanner(sent);
        int length = 0;
        String longest = "";
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > length) {
                length = word.length(); // gets the longest length
                longest = word; // gets the longest word
            }
        }
        System.out.println("The longest word is " + longest);
        System.out.println("The longest length is "+ length);

    }

    public static void main(String[] args) {
        FindALongestWord.getLongestString();
    }

}
