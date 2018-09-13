import java.util.Scanner;

public class FindALongestWord {

    public static void getLongestString() {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sent = ob.nextLine();
        Scanner st = new Scanner(sent);
        int length = 0;
        String longest = "";
        while (st.hasNext()) {
            String word = st.next();
            if (word.length() > length) {
                length = word.length();
                longest = word;
            }
        }
        System.out.println("The longest word is " + longest);
        System.out.println("The longest length is "+ length);

    }

    public static void main(String[] args) {
        FindALongestWord.getLongestString();
    }

}
