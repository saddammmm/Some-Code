/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class PairOfNumForSum {
    public static void main(String []args)
    {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[]A=new int[n];
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        sum=sc.nextInt();
        PrintPainr(A, n, sum);
        
    }
    public static void PrintPainr(int []a,int n,int sum)
    {
        int temp;
       
        ArrayList<Boolean>A=new ArrayList<>();
      
        for (int i = 0; i < Integer.MAX_VALUE-5; i++) {
            A.add(Boolean.FALSE);
        }
        for (int i = 0; i <n; i++) {
            temp=sum-a[i];
            if(temp>=0&&A.get(temp)==true)
                System.out.println(a[i]+" "+temp);
            
            A.add(i, Boolean.TRUE);
            
        }
    }
}
