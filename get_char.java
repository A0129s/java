/* write a java program to get a character from user at even indices */

import java.util.*;
public class get_char {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // taking input
        String s = sc.nextLine();     // return input
        for(int i=0; i<s.length(); i+=2){
            System.out.println(s.charAt(i));
        }
    }
}
