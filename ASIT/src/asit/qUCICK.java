/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class qUCICK {
   
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t;
        BigInteger n;
        //t=sc.nextInt();
        n=sc.nextBigInteger();
        System.out.println(Cal(n));
        
    }
   public static BigInteger Cal(BigInteger n)
   {
       BigInteger a=new BigInteger("34");
       BigInteger b=new BigInteger("30");
              BigInteger c=new BigInteger("32");

       return a.pow(n.intValue()).add(b.multiply(n)).add(c);
       
   }


            }