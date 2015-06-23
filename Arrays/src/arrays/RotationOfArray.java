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
public class RotationOfArray {
    public static void main(String[]args)
    {
        int n,d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        d=sc.nextInt();
        int []A=new int[n];
        
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
            
        }
        Rotate(A, n, d);
        
    }
    public static void Rotate(int []a,int n,int d)
    {
        int []temp=new int[d];
        for (int i = 0; i <d; i++) {
            temp[i]=a[i];
        }
        int t=d;
        for (int i = 0; t <n; i++) {
            a[i]=a[t];
            t++;
        }
        for (int i = n-d-1; i <n; i++) {
            a[i]=temp[i];
        }
        System.out.println("YY");
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
        }
    }
}
