import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class MyProgram
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<String> lines = new ArrayList<>();
        Scanner file = new Scanner(new File("src/prog702q.dat"));
        ArrayList<Vehicle> v = new ArrayList<>();
        double CarsTotalValue = 0;
        double VehiclesTotalValue = 0;
        int CarsTotalTires = 0;
        int TrucksTotalTires = 0;
        int BusesTotalTires = 0;
        Vehicle LeastValuableTruck = new Vehicle("None",0,Double.MAX_VALUE);
        while(file.hasNext())
        {
            String Type = file.nextLine();
            String Name = file.nextLine();
            String Tires = file.nextLine();
            String Last = file.nextLine();
            lines.add(Type);
            lines.add(Name);
            lines.add(Tires);
            lines.add(Last);
            switch (Integer.parseInt(Type))
            {
                case 1:
                    v.add(new Car(Name, Integer.parseInt(Tires), Integer.parseInt(Last)));
                    CarsTotalValue += v.get(v.size() - 1).getValue();
                    VehiclesTotalValue += v.get(v.size() - 1).getValue();
                    CarsTotalTires += v.get(v.size() - 1).getTire();
                    break;
                case 2:
                    v.add(new Truck(Name, Integer.parseInt(Tires), Double.parseDouble(Last)));
                    VehiclesTotalValue += v.get(v.size() - 1).getValue();
                    TrucksTotalTires += v.get(v.size() - 1).getTire();
                    if ((v.get(v.size() - 1).getValue()) < (LeastValuableTruck.getValue()))
                        LeastValuableTruck = v.get(v.size() - 1);
                    break;
                case 3:
                    v.add(new Bus(Name, Integer.parseInt(Tires), Last));
                    VehiclesTotalValue += v.get(v.size() - 1).getValue();
                    BusesTotalTires += v.get(v.size() - 1).getTire();
                    break;
            }
        }
        //Output
        System.out.println("ANALYSIS DATA: ");
        System.out.println("----------------------------");
        System.out.println("Total number of vehicles: " + v.size());
        System.out.println("Total value of cars: " + CarsTotalValue);
        System.out.println("Total value of vehicles: " + VehiclesTotalValue);
        System.out.println("Least valuable truck: " + LeastValuableTruck.getName());
        System.out.println("Total number of car tires: " + CarsTotalTires);
        System.out.println("Total number of truck tires: " + TrucksTotalTires);
        System.out.println("Total number of bus tires: " + BusesTotalTires);
    }
}