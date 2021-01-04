package com.myparking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile
{
    YashParkingLot myParkingLot;

    public void processInput(File a) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(a);

        int lotSize;
        String input = "";
        int hour;
        int min;
        int sec;

        lotSize = scanner.nextInt();
        myParkingLot = new YashParkingLot(lotSize);

        while (scanner.hasNextLine())
        {
            input = scanner.next();
            hour = scanner.nextInt();
            min = scanner.nextInt();
            sec = scanner.nextInt();

           if(myParkingLot.hasInstance(input))
               myParkingLot.exit(input, hour, min, sec);
           else
               myParkingLot.entrance(input, hour, min, sec);
        }

        if(myParkingLot.noOfCars.size() > 0)
        {
            System.out.println("The following cars have not left the parking lot:");
            myParkingLot.displayAllCars();
        }

        System.out.println("\nTotal Revenue: $" + myParkingLot.TotalRevenue);
        scanner.close();

    }
};
