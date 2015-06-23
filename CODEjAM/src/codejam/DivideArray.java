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
public class DivideArray {
    public static void main(String[]args)
    {
        int n,q,d;
        ArrayList<BigInteger>A=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        BigInteger r=BigInteger.ONE;
        for (int i = 0; i <n; i++) {
            A.add(sc.nextBigInteger());
        }
        q=sc.nextInt();
        for (int i = 0; i <q; i++) {
            d=sc.nextInt();
            r=r.multiply(BigInteger.valueOf(d));
            }
        for (int i = 0; i <n; i++) {
            A.set(i, A.get(i).divide(r));
        }
            for (int i = 0; i<n; i++) {
            System.out.print(A.get(i)+" ");
            
        }
        }
        
        
    
}
