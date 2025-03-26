import java.util.*;
import java.lang.*;
import java.io.*;



interface Car {
    public void start();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("This is Electric Car");
    }
}
class DieselCar implements Car {
    public void start() {
        System.out.println("This is Diesel Car");
    }
}


class interface {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Car tesla = new ElectricCar();
        Car XUV700 = new DieselCar();


        tesla.start();
        XUV700.start();
    }
}
