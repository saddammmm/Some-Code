/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Next_number_sam_digit {
    public static void main(String[]args)
    {
        String num;
        Scanner sc=new Scanner(System.in);
       num=sc.nextLine();
       ArrayList<Integer>A=new ArrayList<>();
       int[]a=new int[num.length()];
        for (int i = 0; i <num.length(); i++) {
            //a[i]=Integer.parseInt(num.substring(i, i+1));
            A.add(Integer.parseInt(num.substring(i, i+1)));
        }
        int k=0,i=0;
        for ( i = num.length()-1; i >0; i--) {
            if(A.get(i)>A.get(i-1))
               break;
        }
        if(i==0)
            System.out.println("not possible");
        int x=A.get(i-1),s=i;
        for (int j = i+1; j <num.length(); j++) {
            if(A.get(j)>x&&A.get(j)<A.get(s))
                s=j;
        }
      
         Collections.swap(A, i-1, s);
         List<Integer>B=new ArrayList<>();
         B=A.subList(i, A.size());
         
        Collections.sort(B);
      
        for (int j = 0; j <=i-1; j++) {
            System.out.print(A.get(j));
        }
        for (int j = 0; j <B.size(); j++) {
            System.out.print(B.get(j));
        }
   }
    
}
