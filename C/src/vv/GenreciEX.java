/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shussain
 */
public class GenreciEX {
    public static void main(String []args)
    {
        //make some Cars for the pool
Car c1 = new Car();
Car c2 = new Car();
List<Car> carList = new ArrayList<Car>();
carList.add(c1);
carList.add(c2);
RentalGeneric<Car> carRental = new
RentalGeneric<Car>(2, carList);
// now get a car out, and it won't need a cast
Car carToRent = carRental.getrental();
carRental.returnRental(carToRent);
// can we stick something else in the original carList?
//carList.add(new Cat("Fluffy"));
        
    }
}
 class RentalGeneric<T>
{
    private List<T>rentalpool;
    private int maxNum;

    public RentalGeneric(int maxNum,List<T>rentalpool) {
        this.maxNum=maxNum;
        this.rentalpool=rentalpool;
    }
    public T getrental()
    {
        return rentalpool.get(0);
    }
    public void returnRental(T returnedThing)
    {
        rentalpool.add(returnedThing);
    }
}
class Car
{
    
}