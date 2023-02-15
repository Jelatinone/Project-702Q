public class Truck extends Vehicle implements Names
{
    Double Mileage;

    /** Constructor. */
    public Truck(String Name, int Tires, double Mileage)
    {
        super(Name,Tires,50000);
        this.Mileage = Mileage;
    }
    /** @return Truck's name(string) */
    public String getName()
    {
        return super.getName();
    }
    /** @return Truck's tire count(integer) */
    public int getTire()
    {
        return super.getTire();
    }
    /** @return Truck's value(double) */
    public double getValue()
    {
        return super.getValue() - (0.25 * Mileage);
    }
}
