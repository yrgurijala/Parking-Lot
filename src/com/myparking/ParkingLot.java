package com.myparking;

import java.util.*;

public abstract class ParkingLot {

    public int capacity;
    public LinkedList<Car> noOfCars = new LinkedList<Car>();

    abstract void exit(String a, int b, int c, int d);
    abstract int pricing(Car a);

    ParkingLot(int a)
    {
        capacity = a;
    }

    public boolean hasInstance(String a)
    {
        int check = 0;
        Car checkCar;

        while (check != noOfCars.size())
        {
            checkCar = noOfCars.get(check);
            check++;

            if(checkCar.getName().equals(a))
                return true;
        }

        return false;
    }

    public void entrance(String a, int b, int c, int d)
    {
        Car carObject = new Car(a);
        carObject.SetEntryTime(b,c,d);

        if(noOfCars.size() != capacity)
        {
            noOfCars.push(carObject);

            String check = carObject.GetEntryTime();
            System.out.println("Car " + carObject.getName() + " entered at: " + check);
        }
        else
            System.out.println("Sorry " + carObject.getName() + " no space available for parking");
    }

    public void displayAllCars()
    {
        int check = 0;

        while (check != noOfCars.size())
        {
            Car display = noOfCars.get(check);
            System.out.println(display.getName());
            check++;
        }
    }
}
