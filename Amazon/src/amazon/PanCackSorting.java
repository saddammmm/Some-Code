/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class PanCackSorting {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int []A=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }
    }
     public static void flip(int arr[],int i)
        {
            int temp, start = 0;
    while (start < i)
    {
        temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        start++;
        i--;
    }
        }
    
}
