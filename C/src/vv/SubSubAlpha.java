/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

/**
 *
 * @author shussain
 */
public class SubSubAlpha extends Alpha{
    private SubSubAlpha(){
    s+="subsubalpha";
}
    public static void main(String args[])
    {
        new SubSubAlpha();
        System.out.println(s+" ");
    }
    
}
class SubAlpha extends Alpha
{
    private SubAlpha()
    {
        s+="subalph";
    }
}
class Alpha
{
    static String s=" ";
    protected Alpha()
    {
        s+="alpha";
    }
}