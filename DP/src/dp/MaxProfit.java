/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class MaxProfit {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []prof=new int[n];
        for (int i = 0; i <n; i++) {
          prof[i]=sc.nextInt();
          
        }
        for (int i = 0; i < 10; i++) {
            
        }
       
    }
     public static int maxDiff(int[]a,int n)
        {
            int maxdif=a[1]-a[0];
            int minel=a[0];
            for (int i = 0; i <n; i++) {
                if(a[i]-minel>maxdif)
                    maxdif=a[i]-minel;
                if(a[i]<minel)
                    minel=a[i];
            }
            return maxdif;
        }
}
