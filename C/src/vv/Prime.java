/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Prime {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("2");
        for (int i = 3; n>1; i++) {
            if(isPrime(i))
            {  System.out.println(i);n--;}
        }
    }
    public static boolean isPrime(int a)
            
    {  // System.out.println("ll");
        boolean t=true;
        for (int i = 2; i <=Math.sqrt(a); i++) {
            if(a%i==0){t=false;
            break;}
        }
        return t;
    }
}
