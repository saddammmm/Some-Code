/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shussain
 */
public class TricyNum<X extends Number> {
    
    private X x;
    
    public TricyNum(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return x.doubleValue();
    }
    
    public static void main(String args[]) {
        TricyNum<Integer> a = new TricyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}