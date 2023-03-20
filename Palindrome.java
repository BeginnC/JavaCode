import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String reverse = "";
        
        System.out.println("Enter word: ");
        var word = scanner.nextLine();
        word = word.replace(" ", "");
        int WLength = word.length();

        for(int i = WLength-1; i >=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        if(word.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Special word");
        }
    }
}