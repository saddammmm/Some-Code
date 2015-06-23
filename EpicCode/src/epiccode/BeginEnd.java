/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class BeginEnd {
    public static void main(String []args)
    {
        int n,l,i,j;
        String s,sub;
        BigInteger t=BigInteger.ZERO;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        s=sc.nextLine();
        l=s.length();
        for ( i = 0; i <l; i++) {
            for ( j = 1; j <=l-i; j++) {
                sub=s.substring(i,j+i);
                //System.out.println(sub);
                if(s.substring(i,j+i).charAt(0)==s.substring(i,j+i).charAt(j-1))
                { 
                    t=t.add(BigInteger.ONE);
                    System.out.println(sub);
                }
                }
            }
        
        System.out.println(t);
}
}
