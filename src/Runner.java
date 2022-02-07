import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // ArrayList<Integer> num = new ArrayList<>();
        // num.add(10);
        // num.add(5);
        // num.add(24);
        // System.out.println(num);
        System.out.println("HELLO IM FROM HOME");
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Apple", 10);
        Car car2 = new Car("Banana", 12);
        Car car3 = new Car("Pear", 13);

        Car[] carArray = {car1,car2,car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
