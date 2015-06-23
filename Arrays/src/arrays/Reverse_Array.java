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
public class Reverse_Array {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        int j=n-1;
        int k;
        for (int i = 0; i <n/2; i++) {
            k=a[i];
            a[i]=a[j];
            a[j]=k;
            j--;
            //System.out.println(a[i]);
        }
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
        }
    }
}
