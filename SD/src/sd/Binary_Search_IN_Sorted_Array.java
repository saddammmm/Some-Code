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
public class Binary_Search_IN_Sorted_Array {
    
    
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
            
            
        }
        int k=sc.nextInt();
        System.out.println(BinarySearch(a, k, n, 0));
    }
    public static int BinarySearch(int[]a,int key,int n,int m)
    {
        if(n<m)
            return 0;
        else
        { 
            int imid=(n+m)/2;
            if(a[imid]>key)
                return BinarySearch(a, key, m, imid-1);
            else if(a[imid]<key)
                return BinarySearch(a, key, imid+1, n);
            else 
                    return imid;
        }
    }
}
