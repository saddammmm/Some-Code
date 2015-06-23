/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Largest_Sum_ContiguousSubarray {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []A=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
            
        }
        System.out.println(SUM(A, n));
    }
    public static  int SUM(int []a,int n)
    {
        int cur=a[0];
        int so_for=a[0];
        for (int i = 1; i <n; i++) {
            
            cur=Math.max(cur, cur+a[i]);
            so_for=Math.max(cur, so_for);
            
        }
        return so_for;
    }
}
