/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class RusianProfesar {
    public static void main(String []args)
    {
        BigInteger m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextBigInteger();
        String s="";
        BigInteger i=BigInteger.ZERO;
        for (i = BigInteger.ONE; BigInteger.valueOf(s.length()).compareTo(m) <0; i=i.add(BigInteger.ONE)) {
            s+=i;
            s=Add(s);
           // System.out.println(i);
            
        }
        System.out.println(i.subtract(BigInteger.ONE));
    }
    public static String Add(String s)
    {
        
       return s.replaceAll("(\\d)\\1+", "$1");
        
    }
}
