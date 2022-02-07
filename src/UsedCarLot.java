import java.util.ArrayList;

/**
 * This class represents the UsedCarLot method
 *
 * @author Aaron Liu
 */

public class UsedCarLot {
    private ArrayList<Car> inventory;

    /** Constructor for the UsedCarLot class*/
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /** returns the car inventory of the UsedCarLot
     * @return The inventory
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }
    /**
      * Adds a Car to the end of the inventory
      *
      * @param car the Car to add
      */
    public void addCar(Car car) {
        inventory.add(car);
    }
    /** swaps the places of 2 cars in the car inventory of the UsedCarLot
     *
     * @param num1 the spot of the first car you want to swap
     * @param num2 the spot of the second car you want to swap
     * @return True if the trade was successful and false otherwise
     * */
    public boolean swap(int num1, int num2){
        if (num1 <= inventory.size() && num2 <= inventory.size() && num1 >= 0 && num2 >= 0 && num1 != num2)
        {
            Car car1 = inventory.get(num1);
            Car car2 = inventory.get(num2);
            inventory.set(num2, car1);
            inventory.set(num1, car2);
            return true;
        }
        else {
            return false;
        }
    }
    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /** Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     *   PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *   DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
     *   like you did the other addCar method; also note that this method is void
     * @param indexToAdd spot where you want to add the new car in
     * @param carToAdd the car you wish to add
    */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        /* IMPLEMENT ME */
        inventory.add(indexToAdd, carToAdd);
    }

    /** "sells" the Car located at indexOfCarToSell which
      *  removes it from the inventory list and shifting the remaining
      *  Cars in the inventory list to the left to fill in the gap;
      *  this method reduces the size of inventory by 1
      *
      *  Returns the Car that is being "sold" (removed from lot)
      *
      *  PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
      *
      *  HINT: the ArrayList remove() method returns the removed element while also
      *        removing it from the ArrayList
     * @param indexOfCarToSell the car you wish to remove/sell
     * @return the car that you removed/sold
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return soldCar;
    }

    /**
      * "Sells" the Car located at indexOfCarToSell which
      * removes it from the inventory list and shifting the remaining
      * Cars in the inventory list to the left to fill in the gap;
      * the method returns the Car that is being "sold" (removed from lot)
      * and reduces the size of inventory by 1
      * <p>
      * PRECONDITION: indexOfCarToSell &lt; inventory.size()
      *
      * @param indexOfCarToSell The index of the Car to sell/remove
      * @return the Car that was sold/removed
      */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return soldCar;
    }

    /** moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex &lt; indexOfCarToMove,, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
                      destinationIndex &lt; inventory.size()
       @param indexOfCarToMove the location of the car you want to move.
       @param destinationIndex the spot you want the car to go
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
        Car car1 = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car1);

    }



}
