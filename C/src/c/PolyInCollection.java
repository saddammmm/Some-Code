/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shussain
 */
public class PolyInCollection {
    public void checkAnimals(Animalv[] animal)
    {
        for (Object object : animal) {
            object.checkup();
        }
    }
    public static void main(String[]args)
    {
        
    }
    }
 abstract class Animalv
{
    abstract public void checkup();
}
class Dogd extends Animalv
{
    public void checkup()
    {
        System.out.println("DOG");
    }
}
class Catc extends Animalv
{
    public void checkup()
    {
        System.out.println("CAtt");
    }
}
class Bird extends Animalv
{
    public void checkup()
    {
        System.out.println("Bird");
    }
}