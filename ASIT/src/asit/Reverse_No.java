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
public class Reverse_No {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int res=0;
        while(n!=0)
        {
            res=res*10+n%10;
            n=n/10;
        }
        System.out.println(res);
    }
    
}
