/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LCSITER {
    public static void main(String[]args)
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
       System.out.println(LCS(a, b, a.length()-1, b.length()-1)+1);
        System.out.println(Dynzmic(a, b, a.length(), b.length())+1);
        
    }
    public static int LCS(String a,String b,int n,int m)
    {
        if(m==0||n==0)
            return 0;
        if(a.charAt(n)==b.charAt(m))
            return 1+LCS(a,b,n-1,m-1);
        else
            return Math.max(LCS(a, b, n, m-1), LCS(a, b, n-1, m));
    }
    public static int Dynzmic(String a,String b,int m,int n)
    {
        int i,j;
        int [][]L=new int[m-1][n-1];
        for (int k = 0; k <=m; k++) {
            for (int l = 0; l <=n; l++) {
                if (k == 0 || l == 0)
         L[k][l] = 0;
  
       else if (a.charAt(k-1) == b.charAt(l-1))
         L[k][l] = L[k-1][l-1] + 1;
  
       else
         L[k][l] = Math.max(L[k-1][l], L[k][l-1]);
            }
            
        }
        return L[m][n];
    }
}
