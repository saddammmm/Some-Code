/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asit;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Reverse_WordbyWord {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        System.out.println(reverseWords2(s));
}
  

    public static String reverseWords2(String sentence) {
    StringBuilder sb = new StringBuilder(sentence.length() + 1);
    String[] words = sentence.split(" ");
     
    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]).append(' ');
    }
    sb.setLength(sb.length() - 1);  
    return sb.toString();
}
    
}
