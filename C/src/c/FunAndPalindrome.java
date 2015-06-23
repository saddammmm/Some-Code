/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author shussain
 */
public class FunAndPalindrome {
    public static void main(String[] args)
    {
        String string,sub;
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        sc.nextLine();
        while(t>0){
        string=sc.nextLine();
        
       ArrayList<String>f=new ArrayList<>();
        int count=0;
        int length=string.length();
       
        for( int c = 0 ; c < length ; c++ )
      {
         for(int i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
             //System.out.println(sub);
            if(isPalindrome(sub))count+=sub.length();
         }
      }
        
        
            System.out.println(count);
        t--;}
        
    }
    public static boolean isPalindrome(String input)
{
    for (int start = 0, end = input.length() - 1; start < end; ) {
        if (input.charAt(start++) != input.charAt(end--)) {
            return false;
        }
    }
    return true;
}
}
