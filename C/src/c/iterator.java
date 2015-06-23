/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shussain
 */
public class iterator {
    public static void main(String []args)
    {
        List<Dog>d=new ArrayList<>();
        Dog dm=new Dog("anshul");
        d.add(dm);
        d.add(new Dog("Oscar"));
        d.add(new Dog("Pilla"));
        Iterator<Dog> it= d.iterator();
        while(it.hasNext())
        {
            Dog d2=it.next();
            System.out.println(d2.d);
        }
        System.out.println("size " + d.size());
System.out.println("get1 " + d.get(1).d);
System.out.println("aiko " + d.indexOf(dm));
d.remove(2);
Object []oa=d.toArray();
        for (Object o : oa) {
            Dog d2=(Dog) o;
            System.out.println("oa " + d2.d);
        }
    }
    
}
class Dog
{
    public String d;
    Dog(String name)
    {
        d=name;
    }
}