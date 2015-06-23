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
public class Check_Palindrome {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        if(n==rev(n))
            System.out.println("Number is Palindrome");
        else System.out.println("No is not Palindrome");
    }
    public static int rev(int n)
    {
        int res=0;
        while(n!=0)
        {
            res=res*10+n%10;
            n=n/10;
        }
        return res;
    }
    
}
