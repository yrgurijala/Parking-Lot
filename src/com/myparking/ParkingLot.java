package com.myparking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParkingLot {

    public int capacity;
    public LinkedList<Car> noOfCars = new LinkedList<Car>();
    double totalRevenue = 0;
    double pricePerHour = 0;

    ParkingLot(int a, double b)
    {
        capacity = a;
        pricePerHour = b;;
    }
    
    public double getTotalRevenue() 
    {
    	return totalRevenue;
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
    
    public void displayAllCars()
    {
        int check = 0;

        while (check != noOfCars.size())
        {
            Car display = noOfCars.get(check);
            System.out.println("	" + display.getName());
            check++;
        }
    }

    public void processInput(File a) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(a);

        String input = "";
        int hour;
        int min;
        int sec;

        while (scanner.hasNextLine())
        {
            input = scanner.next();
            hour = scanner.nextInt();
            min = scanner.nextInt();
            sec = scanner.nextInt();

           if(this.hasInstance(input))
               this.exit(input, hour, min, sec);
           else
               this.entrance(input, hour, min, sec);
        }

        if(this.noOfCars.size() > 0)
        {
            System.out.println("\n	The following cars have not left the parking lot:");
            this.displayAllCars();
        }

        System.out.println("\n	Total Revenue: $" + String.format("%.2f", this.getTotalRevenue()) + "\n");
        scanner.close();

    }

    public void entrance(String a, int b, int c, int d)
    {
        Car carObject = new Car(a);
        carObject.SetEntryTime(b,c,d);

        if(noOfCars.size() != capacity)
        {
            noOfCars.push(carObject);

            String check = carObject.GetEntryTime();
            System.out.println("	Car " + carObject.getName() + " entered at: " + check);
        }
        else
            System.out.println("	Sorry " + carObject.getName() + " no space available for parking");
    }
    
    public void exit(String a, int b, int c, int d)
    {
        int check = 0;
        Car exitCar;

        while (check != noOfCars.size())
        {
            exitCar = noOfCars.get(check);
            check++;

            if(exitCar.getName().equals(a)) {

                exitCar.SetExitTime(b, c, d);
                double priceOfTicket = pricing(exitCar);

                totalRevenue += priceOfTicket;
                
                System.out.println("\n	" +exitCar.getName() + " is exiting the parking lot at " + exitCar.GetExitTime());
                System.out.println("	The parking bill for " + exitCar.getName() + " is: $" + String.format("%.2f", priceOfTicket) + "\n");

                noOfCars.remove(exitCar);

                return;
            }
        }

        System.out.println(a + " car not Found");
    }

    double pricing(Car a)
    {
        int hoursSpent = a.getExithours() - a.getEntryhours();
        int minsSpent = a.getExitmins() - a.getEntrymins();

        double priceOfTicket = hoursSpent*pricePerHour;

        if(minsSpent > 0)
            priceOfTicket += pricePerHour;

        return priceOfTicket;
    }
}
