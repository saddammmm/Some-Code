/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

/**
 *
 * @author shussain
 */
public class UseTwo<T,X> {
    T one;
    X two;

    public UseTwo(T one,X two) {
        this.one=one;
        this.two=two;
        
    }
    T getT()
    {
        return one;
    }
    X getX()
    {
        return two;
    }
    public static void main(String args[])
    {
        UseTwo<String,Integer>use=new UseTwo<String, Integer>("Saddam",1233);
        System.out.println(use.getT());
        System.out.println(use.getX());
    }
}
