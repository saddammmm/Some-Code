/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

/**
 *
 * @author shussain
 */
public class XYZ {
   public static void main(String[]arg)
   {
       a1 i= new a1();
       a1 j=new a2();
       a2 k=new a2();
         ((a1)j).go();
       j.go();
       k.g2();
       k.go();
               
   }
}
class a1
{
    public void go()
    {
        System.out.println("hell!");
    }
}
class a2 extends a1
{
    public void g2()
    {
        System.out.println("frank");
    }
    
    public void go()
    {
        System.out.println("jj");
    }
}