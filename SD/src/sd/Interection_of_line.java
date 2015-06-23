/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Interection_of_line {
    public static void main(String[]args)
    {
        int x1,x2,y1,y2,x3,y3,x4,y4;
        ArrayList<Integer>P=new ArrayList<>();
        ArrayList<Integer>Q=new ArrayList<>();
        ArrayList<Integer>R=new ArrayList<>();
        ArrayList<Integer>S=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i <2; i++) {
            P.add(sc.nextInt());
        }
        for (int i = 0; i <2; i++) {
            Q.add(sc.nextInt());
        }
        
        for (int i = 0; i <2; i++) {
            R.add(sc.nextInt());
        }
        for (int i = 0; i <2; i++) {
            S.add(sc.nextInt());
        }
        if(doIntresect(P, Q, R, S))
        {
            System.out.println("Yes");
        }
        else
        {
            System.err.println("No");
        }
    }
    public static int orientation(ArrayList<Integer>p,ArrayList<Integer>q,ArrayList<Integer>r)
    {
        
        int val=(q.get(1)-p.get(1))*(r.get(0)-q.get(0))-(q.get(0)-p.get(0))*(r.get(1)-q.get(1));
        if(val==0)
            return 0;
        return (val>0)?1:2;
    }
    public static boolean  doIntresect(ArrayList<Integer>p1,ArrayList<Integer>q1,ArrayList<Integer>p2,ArrayList<Integer>q2)
    {
        int o1 = orientation(p1, q1, p2);
    int o2 = orientation(p1, q1, q2);
    int o3 = orientation(p2, q2, p1);
    int o4 = orientation(p2, q2, q1);
         if (o1 != o2 && o3 != o4)
        return true;
         if (o1 == 0 && onSegment(p1, p2, q1)) return true;
 
 
    if (o2 == 0 && onSegment(p1, q2, q1)) return true;
 
  
    if (o3 == 0 && onSegment(p2, p1, q2)) return true;
 
  
    if (o4 == 0 && onSegment(p2, q1, q2)) return true;
 
    return false;
    }
    public static boolean onSegment(ArrayList<Integer>p,ArrayList<Integer>q,ArrayList<Integer>r)
    {
        if(q.get(0)<=max(p.get(0),r.get(0))&&q.get(0) >= min(p.get(0), r.get(0)) &&
        q.get(1) <= max(p.get(1), r.get(1)) && q.get(1) >= min(p.get(1), r.get(1)))
            return true;
        return false;
    }
    public static int max(int x,int y)
    {
        if(x>y)return x;
        return y;
    }
    public static int min(int x,int y)
    {
        if(x>y)return y;
        return x;
    }
}
