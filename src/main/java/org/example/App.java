package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      TruckService truckService = new TruckService();

      Truck tata = new Truck("TATA","2019",1000,"Rajesh");
      Truck volvo = new Truck("VOLVO","2018",1000,"Akash");
      Truck eicher = new Truck("EICHER","2020",1000,"Mohit");

      //adding data into database
      System.out.println("Adding Data....");
      truckService.addTruck(tata);
      truckService.addTruck(volvo);
      truckService.addTruck(eicher);

      // fetching data from db
      System.out.println("Fetching Data By id:...."+1);
        Truck truck = truckService.getTruckByID(1);
        System.out.println("truck data:" + truck);

        //updating data
        System.out.println("Updating data.....");
        truck.setDriverName("Ramesh");
        truckService.updateTruck(truck);
        System.out.println("updated truck data:" + truckService.getTruckByID(1));

        //getting all data
      System.out.println("Fetching All Data......");
        List<Truck> allTrucks = truckService.getAllTruck();
        System.out.println("all truck in DB:");
        for(Truck truck1 : allTrucks)
        {
            System.out.println(truck1);
        }

        // delete truck details
      System.out.println("Deleting Data By id: "+2);
        truckService.deleteTruck(2);
        System.out.println("data deleted:"+2);

        allTrucks = truckService.getAllTruck();
        System.out.println("all trucks after operation: " + allTrucks);
    }
}
