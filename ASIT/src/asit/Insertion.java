/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Insertion {
    public static void main(String args[])
    {
        
    int n,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>I=new ArrayList<>();
        int []a=new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <n; i++) {
            k=a[i];
             j=i-1;
            
            while(j>=0&&a[j]>k)
            {
                a[j+1]=a[j];
                j=j-1;
                
            }
            a[j+1]=k;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
}
}