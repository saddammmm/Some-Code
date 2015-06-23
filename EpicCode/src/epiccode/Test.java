/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Test {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
         ArrayList<Integer>A=new ArrayList<>();
        n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
        List B= A.subList(0, n/2);
        List C= A.subList((n/2), n);
      
       Collections.reverse(C);
        for (int i = 1; i <n/2; i++) {
            Num(B, i);
        }
    }
    public static void Num(List<Integer>A,int k)
    {
        int l;
        for (int i = 0; i < A.size()-k; i++) {
            for ( l = k; l>0; l--) {
                System.out.print(A.get(l)+" ");
            }
            System.out.println("");
        }
    }
}
