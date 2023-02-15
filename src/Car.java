public class Car extends Vehicle implements Names
{
    /** Constructor. */
    public Car(String Name, int Tires, int Value)
    {
        super(Name,Tires,Value);
    }

    /** @return Car's name(string) */
    public String getName()
    {
        return super.getName();
    }
    /** @return Car's tire count(integer) */
    public int getTire()
    {
        return super.getTire();
    }
    /** @return Car's value(double) */
    public double getValue()
    {
        return super.getValue();
    }

}
