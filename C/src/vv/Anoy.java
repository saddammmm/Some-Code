/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

import vv.A.b;

/**
 *
 * @author shussain
 */
public class Anoy {
    
    public static void main(String []args)
    {
       A x=new A();
      A.b a=x.new b();
      
       a.go();
       D.e f=new D.e();
       f.goo();
        
    }
}
class A
{
     class b
    {
        public void go()
        {
            System.out.println("hi");
        }
    }
}
class D
{
    static class e
    {
        public void goo()
        {
            System.out.println("hi222");
        }
    }
}