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
public class Newtonraphosan {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(New(n));
        
    }
   public static float New(int n)
   {
       double k=1.0;
       while((k*k-n>=0.0000001||(n-k*k>=0.0000001)))
       {
           k=(k+n/k)/2;
       }
       return (float) k;
   }
}
