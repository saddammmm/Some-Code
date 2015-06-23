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
public class Longest_non_decreasing_sequence {
    public static void main(String []args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int []S=new int[n];
        int []Sol=new int[n+1];
        for (int i = 0; i <n; i++) {
            S[i]=sc.nextInt();
            
        }
        for (int i = 0; i <n; i++) {
            Sol[i]=1;
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i; j++) {
                if(S[i]>S[j]&&Sol[i]<Sol[j]+1)
                    Sol[i]=Sol[j]+1;
            }
        }
        System.out.println(Sol[n]);
    }
    
}
