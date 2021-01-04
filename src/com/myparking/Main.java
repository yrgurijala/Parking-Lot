package com.myparking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {   
        File file1 = new File("input1.txt");
        File file2 = new File("input2.txt");
        File file3 = new File("input3.txt");
        File file4 = new File("input4.txt");
        File file5 = new File("input5.txt");
        
        int parkingCapacity1 = 3;
        int parkingCapacity2 = 10;
        int parkingCapacity3 = 10;
        int parkingCapacity4 = 100;
        int parkingCapacity5 = 100;
        
        double parkingLotPrice1 = 100;
        double parkingLotPrice2 = 5;
        double parkingLotPrice3 = 5;
        double parkingLotPrice4 = 2;
        double parkingLotPrice5 = 2;
        
        ParkingLot yashParkingLot1 = new ParkingLot(parkingCapacity1, parkingLotPrice1);
        ParkingLot yashParkingLot2 = new ParkingLot(parkingCapacity2, parkingLotPrice2);
        ParkingLot yashParkingLot3 = new ParkingLot(parkingCapacity3, parkingLotPrice3);
        ParkingLot yashParkingLot4 = new ParkingLot(parkingCapacity4, parkingLotPrice4);
        ParkingLot yashParkingLot5 = new ParkingLot(parkingCapacity5, parkingLotPrice5);
       
        System.out.println("Yash Parking Lot: Area 1");
        System.out.println("$" + String.format("%.2f", parkingLotPrice1) + " for every hour in this parking lot" + "\n");
        yashParkingLot1.processInput(file1);
        
        System.out.println("Yash Parking Lot: Area 2");
        System.out.println("$" + String.format("%.2f",parkingLotPrice2) + " for every hour in this parking lot" + "\n");
        yashParkingLot2.processInput(file2);
        
        System.out.println("Yash Parking Lot: Area 3");
        System.out.println("$" + String.format("%.2f",parkingLotPrice3) + " for every hour in this parking lot" + "\n");
        yashParkingLot3.processInput(file3);
        
        System.out.println("Yash Parking Lot: Area 4");
        System.out.println("$" + String.format("%.2f",parkingLotPrice4) + " for every hour in this parking lot" + "\n");
        yashParkingLot4.processInput(file4);
        
        System.out.println("Yash Parking Lot: Area 5");
        System.out.println("$" + String.format("%.2f",parkingLotPrice5) + " for every hour in this parking lot" + "\n");
        yashParkingLot5.processInput(file5);
        
        
        System.out.println("All revenue combined: $" + (yashParkingLot1.getTotalRevenue() + yashParkingLot2.getTotalRevenue() + 
        												yashParkingLot3.getTotalRevenue() +yashParkingLot4.getTotalRevenue() + 
        												yashParkingLot5.getTotalRevenue() ));
        
    }
}