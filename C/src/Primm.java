
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shussain
 */
public class Primm {
    public static void main(String[]args)
    {
        int x,t;
        long m,n;
        Scanner sc=new Scanner(System.in);
     
        BigInteger b;
        x=sc.nextInt();
        t=sc.nextInt();
        System.out.println(pr(x, t));
        
    }
    public static long pr(long a,long b)
    { 
        long c=0;
        for (long i = a; i <=b; i++) {
            if(BigInteger.valueOf(i).isProbablePrime(1))
            { c++;
                System.out.println(i);}
        }
        return c;
    }
}
