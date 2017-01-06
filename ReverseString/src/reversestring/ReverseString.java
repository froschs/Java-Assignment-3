
package reversestring;

import java.util.Scanner;
        
/**
 * @author Seth
 */
public class ReverseString {

    public static void main(String[] args) {
       String userWord;
       char newWord;
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Enter the word you wish to reverse:");
       userWord = keyboard.next();
       for(int i = userWord.length() -1; i >= 0; i--){
           newWord = userWord.charAt(i);
           System.out.print(String.valueOf(newWord));
    }
   System.out.println();
}
}