/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Longest_Non_decreasing_sequence {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>AA=new ArrayList<Integer>();
        int []A=new int[n];
        int []Sol=new int[n+1];
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            Sol[i]=1;        }
        for(int i=0;i<n;i++)
    {
        for (int j = 0; j <i; j++) {
            if(A[i]>A[j]&&Sol[i]<Sol[j]+1)
            { Sol[i]=Sol[j]+1;
           // AA.add(A[j]);
            }
        }
        
    }
        int max=0;
        
        for (int i = 0; i <=n; i++) {
            if(max<Sol[i])
                max=Sol[i];
        }
        System.out.println(max);
    }
    
}
