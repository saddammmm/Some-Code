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
public class SearchInSortedMatrix {
    public static void main(String []args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int [][]M=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                M[i][j]=sc.nextInt();
            }
        }
    }
    public static int Search(int[][]a,int n,int m,int k)
    {
        int j=m-1, i=0;
         while(i<n&&j>0)
         {
             if(a[i][j]==k)
             {
                 System.out.println(i+" "+j);
                 return 1;
             }
             if(a[i][j]>k)
                 j--;
             else
                 i++;
         }
         System.out.println("Element not foud");
         return 0;
    }
}
