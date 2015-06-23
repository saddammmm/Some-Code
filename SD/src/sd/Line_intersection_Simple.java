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
public class Line_intersection_Simple {
    public static  void main(String[]args)
    {
        int x1,y1,x2,y2,m1,n1,m2,n2;
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        m1=sc.nextInt();
        n1=sc.nextInt();
        m2=sc.nextInt();
        n2=sc.nextInt();
        int a1,b1,a2,b2,c1,c2;
        a1=y2-y1;
        b1=x2-x1;
        c1=a1*x1+b1*y1;
        a2=n2-n1;
        b2=m2-m1;
        c2=a2*m1+b2*n1;
        
        double det=a1*b2-a2*b1;
        if(det==0)
        {
            System.out.println("not intersect");
        }
        else
        {
            System.out.println((b2*c1-b1*c2)/det);
             System.out.println((a1*c2-a2*c1)/det);
        }
        
    }
}
