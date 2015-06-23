/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LargestPalindrome {
    public static void main(String []args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        
           LPS(str);
        
    }
    public static void LPS(String str)
            
    {
        int maxLength=1;
        int start=0;
        int len=str.length();
        int low ,high;
        for (int i = 0; i <len; i++) {
            low=i-1;//even length palindrome;
            high=i;
            while(low>=0&&high<len&&str.charAt(low)==str.charAt(high))
            {
                if(high-low+1>maxLength)
                {
                    start=low;
                    maxLength=high-low+1;
                }
                low--;
                high++;
            }
            low=i-1;
            high=i+1;//odd length palindrome
             while(low>=0&&high<len&&str.charAt(low)==str.charAt(high))
            {
                if(high-low+1>maxLength)
                {
                    start=low;
                    maxLength=high-low+1;
                }
                low--;
                high++;
            }
            
        }
        System.out.println(str.substring(start, start+maxLength));
    }
}
