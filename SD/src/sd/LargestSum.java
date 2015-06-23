/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LargestSum {
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []A=new int[n];
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(Sum(A, n));
    }
    public static int Sum(int []a,int n)
    {
        
        int max=a[0];
        int cur=a[0];
        for (int i = 1; i <n; i++) {
            cur=Math.max(a[i], cur+a[i]);
            max=Math.max(max, cur);
        }
        return max;
    }
}
