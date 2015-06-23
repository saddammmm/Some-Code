/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coupan;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Coupan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       int t;
        Scanner sc=new Scanner(System.in);
        BigInteger n,m;
        t=sc.nextInt();
        while(t>0)
        {
           BigInteger r=BigInteger.ZERO;
        n=sc.nextBigInteger();
        m=sc.nextBigInteger();
        
        for (BigInteger i=n; i.compareTo(m)<=0 ; i=i.add(BigInteger.ONE)) {
            
          if(noOfDiv(i).mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)!=0)
                r=r.add(BigInteger.ONE);
            
        }
        System.out.println(r);
    t--; }
        
   }
    public static BigInteger noOfDiv(BigInteger n)
    {
       BigInteger factorCount = BigInteger.ZERO;
for (BigInteger i=BigInteger.ONE; i.compareTo(n)<=0 ; i=i.add(BigInteger.ONE))
{  
    if(n.mod(i).compareTo(BigInteger.ZERO) ==0)
    {
       factorCount=factorCount.add(BigInteger.ONE);
    
    }
}
return factorCount;
    }
}
