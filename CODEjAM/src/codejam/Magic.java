/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Magic {
    public static void main(String[]args)
    {
        int t,z,o,m;
       
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        m=sc.nextInt();
        if(m>2){
        System.out.println(nth(m-1)+" "+nth(m));
        }
        if(m==1)
                System.out.println("0"+" "+"1");
        if(m==1)
                System.out.println("1"+" "+"1");
       
        
        t--;}
    }
    public static BigInteger nth(int n)
    {
        BigInteger a =BigInteger.ZERO, b =BigInteger.valueOf(1), c;
  if( n == 0)
    return a;
  for (int i = 2; i <= n; i++)
  {
     c = a.add(b);
     a = b;
     b = c;
  }
  return b;
    }
    
}
