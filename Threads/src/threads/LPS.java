/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LPS {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char []A=s.toCharArray();
        System.out.println(Longest(A, 0, s.length()-1));
    }
    public static int Longest(char[]A,int i,int j)
    {
        if(i==j)
            return 1;
        if(A[i]==A[j]&&i+1==j)
            return 2;
        if(A[i]==A[j])
            return Longest(A, i+1, j-1)+2;
        return Math.max(Longest(A, i, j-1), Longest(A, i+1, j));
    }
}
