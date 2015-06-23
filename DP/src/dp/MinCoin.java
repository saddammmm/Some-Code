/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class MinCoin {
    public static void main(String []args)
    {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int[]V=new int[n];
        for (int i = 0; i <n; i++) {
            V[i]=sc.nextInt();
        }
        
        sum=sc.nextInt();
       int []Min=new int[sum+1];
       Min[0]=0;
        for (int i = 1; i <=sum; i++) {
            Min[i]= Integer.MAX_VALUE;
        }
        for (int i = 1; i <=sum; i++) {
            for (int j = 0; j <n; j++) {
                if(V[j]<=i&&Min[i-V[j]]+1<Min[i])
                    Min[i]=Min[i-V[j]]+1;
            }
           
        }
       System.out.println(Min[sum]);
    }
    
}
