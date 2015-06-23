/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

/**
 *
 * @author shussain
 */
public class Test extends Mul implements Muld
{
    @Override
    public int t(int a,int b)
    {
        return a-b;
    }
    public int t(int a,int b,int c)
    {
        return a+b+c;
    }
    public static int mul2(int a,int b)
    {
        return muj(a, b);
        
    }
    public static void main(String []args)
    {
        sum s=new sum();
       Test f=new Test();
        System.out.println(f.t(100, 20,50));
        System.out.println(s.mul(10, 20));
        System.out.println(mul2(10, 20));
    }
    
}
class sum
{
 
    protected static int mul(int a,int b)
    {
        return a*b;
    }
}