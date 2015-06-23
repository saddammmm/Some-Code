/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Palin {
    
    public static void main(String[]args)
            
    {
        int t;
        Scanner scanner=new Scanner(System.in);
        String st;
        //t=scanner.nextInt();
       // scanner.nextLine();
        
        
        st=scanner.nextLine();
        System.out.println(palindrome(st));
    }
    public static String palindrome(String str) { 
        StringBuilder result = new StringBuilder(str); 
        if (str != null && str.length() > 0) { 
            int l = str.length() - 1; 
            int s = 0; 
            int e = l; 
            while ( e > s) { 
                if (str.charAt(s) == str.charAt(e)) { 
                    ++s; --e; 
                } else { 
                    s -= (l - e - 1); 
                    e = l; 
                } 
            } 
            StringBuilder start = new StringBuilder(str.substring(0, s - (l - e))); 
            result.append(start.reverse()); 
        } 
        return result.toString(); 
    }
}
