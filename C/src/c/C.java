/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author shussain
 */
class m
{
   
    public static void print(int a,int... s)
    {
        System.out.println(a);
        for (int i : s) {
            System.out.println(i);
        }
       
    }
     public static void lp(int... s)
        {
            for (int i : s) {
                System.out.println(i);
            }
  
        }
}
class h
{
    h(int n,int... a)
    {
        System.out.println(n);
        for (int i : a) {
            System.out.println(i);
        }
    }
   
    class p
    {
        p(int e,int... j)
        {
            System.out.println(e);
            for (int i : j) {
                System.out.println(j);
            }
        }
        p(char a,int... r){}
    }
}
public class C {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        m a=new m();
        //m.lp(1,2,3,4);
        //m.print(5, 1,2,3,4);
      
      
    }
}
