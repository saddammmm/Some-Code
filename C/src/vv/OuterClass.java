/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

/**
 *
 * @author shussain
 */
public class OuterClass {
    private int x=9;
    public void MakeInner()
    {
        InnerClass in=new InnerClass();//calling Inner class method inside to outer class
        in.SeeOuter();
    }
    public void Make2()
    {
        InnerClass vd=new InnerClass();
    vd.SeeOuter();
    }
    
    class InnerClass
    {
        public void SeeOuter()
        { System.out.println(this);
            System.out.println(OuterClass.this);
            System.out.println("X:="+x);
        }
    }
    public static void main(String args[])
    {
        OuterClass out=new OuterClass();
        OuterClass.InnerClass inner=out.new InnerClass();//callin Inner class method out side to outer class
        inner.SeeOuter();
        out.Make2();
        out.MakeInner();
    }
}
