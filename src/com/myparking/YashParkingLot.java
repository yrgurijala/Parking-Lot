package com.myparking;

//YashParkingLot costs $2 for 1 hour of parking
public class YashParkingLot extends ParkingLot
{
    int TotalRevenue = 0;

    YashParkingLot(int a) {
        super(a);
    }

    void exit(String a, int b, int c, int d)
    {
        int check = 0;
        Car exitCar;

        while (check != noOfCars.size())
        {
            exitCar = noOfCars.get(check);
            check++;

            if(exitCar.getName().equals(a)) {

                exitCar.SetExitTime(b, c, d);
                int priceOfTicket = pricing(exitCar);

                TotalRevenue += priceOfTicket;

                System.out.println(exitCar.getName() + " is exiting the parking lot at " + exitCar.GetExitTime());
                System.out.println("The parking bill for " + exitCar.getName() + " is: $" + priceOfTicket + "\n");

                noOfCars.remove(exitCar);

                return;
            }
        }

        System.out.println(a + " car not Found");
    }

    int pricing(Car a)
    {
        int hoursSpent = a.getExithours() - a.getEntryhours();
        int minsSpent = a.getEntrymins() - a.getEntrymins();

        int priceOfTicket = hoursSpent*2;

        if(minsSpent > 0)
            priceOfTicket += 2;

        return priceOfTicket;
    }
}
