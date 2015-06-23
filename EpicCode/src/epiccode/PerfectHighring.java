/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class PerfectHighring {
    public static void main(String []args)
    {
        int n;
        BigInteger p,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextBigInteger();
        x=sc.nextBigInteger();
        ArrayList<BigInteger>A=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextBigInteger());
        }
        
        
        ArrayList<BigInteger>B=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            B.add(p.multiply(A.get(i)));
            p=p.subtract(x);
        }
      BigInteger d=B.get(0);int k=0;
        for (int i = 1; i <n; i++) {
            if(d.compareTo(B.get(i))<0)
            { d=B.get(i);
            k=i;
            }
            }
        System.out.println(k+1);
    }
    
}
