/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class A {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        ArrayList<BigInteger>D=new ArrayList<>();
        ArrayList<BigInteger>B=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            D.add(sc.nextBigInteger());
        }
        for (int i = 0; i <n; i++) {
            B.add(sc.nextBigInteger());
        }
        if(Dif(B, n).compareTo(Dif(D, n))>0)
        {System.out.println("Brian");
            System.out.println(Dif(B, n));}
        else
        {
            System.out.println("Dom");
        
        System.out.println(Dif(D, n));
        }
    }
    public static BigInteger Dif(ArrayList<BigInteger>A,int n)
    {
        BigInteger max=(A.get(1).subtract(A.get(0))).abs();
        
       // BigInteger min=A.get(0);
        for (int i = 1; i < n-1; i++) {
           if((A.get(i+1).subtract(A.get(i))).abs().compareTo(max)>0)
               max=(A.get(i+1).subtract(A.get(i))).abs();
           
        }
        return max;
        
    }
}
