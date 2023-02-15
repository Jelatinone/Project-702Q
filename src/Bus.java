public class Bus extends Vehicle implements Names
{
    String Hometown;
    /** Constructor. */
    public Bus(String Name, int Tires, String Hometown)
    {
        super(Name,Tires,50000);
        this.Hometown = Hometown;
    }
    /** @return Bus's name(string) */
    public String getName()
    {
        return super.getName();
    }
    /** @return Bus's tire count(integer) */
    public int getTire()
    {
        return super.getTire();
    }
    /** @return Bus's value(double) */
    public double getValue()
    {
        return super.getValue();
    }
    /** @return Vehicles's hometown(String) */
    public String getHometown()
    {
        return Hometown;
    }


}