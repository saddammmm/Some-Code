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
public class OddNumberTimes {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []A=new int[n];
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(Odd(A, n));
    }
    public static int Odd(int[]a,int n)
    {
        int res=0;
        for (int i = 0; i <n; i++) {
            res=res^a[i];
        }
        return res;
    }
}
