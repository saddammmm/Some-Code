/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class EpicCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        BigInteger k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextBigInteger();
        ArrayList<BigInteger>G=new ArrayList<>();
        ArrayList<BigInteger>B=new ArrayList<>();
        
        for (int i = 0; i <n; i++) {
            B.add(sc.nextBigInteger());
        }
        for (int i = 0; i <n; i++) {
            G.add(sc.nextBigInteger());
        }
        
        BigInteger m=new BigInteger("-1");
        Collections.sort(B);
        Collections.sort(G);
        int c=0,i=0,j=0;
        while(i<B.size())
        {
            while(j<G.size())
                
            {
                if(B.get(i).subtract(G.get(j)).compareTo(k)<=0)
                {
                    if(B.get(i).subtract(G.get(j)).compareTo(k.multiply(m))>=0)
                    {
                        c++;
                        j++;
                    }
                    break;
                }
                j++;
            }
            i++;
        }
        
        
        
        
        System.out.println(c);
    }
    
}
