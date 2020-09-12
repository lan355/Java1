import java.util.ArrayList;

public class Airports {

    public ArrayList<Airport> passengers;

    public Airports()
    {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Airport airport)
    {
        passengers.add(airport);
    }

}
