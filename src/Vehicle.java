public class Vehicle implements Names{

    private String name;
    private int wheels;
    private double value;

    /** Constructor. */
    public Vehicle()
    {
        name = "";
        wheels = 0;
        value = 0;
    }

    public Vehicle(String n, int w, double v)
    {
        name = n;
        wheels = w;
        value = v;
    }

    /** @return Vehicle's name(string) */
    public String getName()
    {
        return name;
    }
    /** @return Vehicle's tire count(integer) */
    public int getTire()
    {
        return wheels;
    }
    /** @return Vehicle's value(double) */
    public double getValue()
    {
        return value;
    }
}